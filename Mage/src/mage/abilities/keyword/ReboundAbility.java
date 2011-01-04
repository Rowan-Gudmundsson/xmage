/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mage.abilities.keyword;

import java.util.UUID;
import mage.Constants.Duration;
import mage.Constants.Outcome;
import mage.Constants.Zone;
import mage.abilities.Ability;
import mage.abilities.DelayedTriggeredAbility;
import mage.abilities.SpellAbility;
import mage.abilities.TriggeredAbilityImpl;
import mage.abilities.condition.common.MyTurn;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.ReplacementEffectImpl;
import mage.cards.Card;
import mage.game.ExileZone;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.game.events.GameEvent.EventType;
import mage.game.events.ZoneChangeEvent;
import mage.game.stack.Spell;
import mage.players.Player;

/**
 * This ability has no effect by default and will always return false on the call
 * to apply.  This is because of how the {@link ReboundEffect} works.  It will
 * install the effect if and only if the spell was cast from the {@link Zone#HAND Hand}.
 * <p/>
 * 702.85. Rebound
 * <p/>
 * 702.85a Rebound appears on some instants and sorceries. It represents a static
 * ability that functions while the spell is on the stack and may create a delayed
 * triggered ability. "Rebound" means "If this spell was cast from your hand,
 * instead of putting it into your graveyard as it resolves, exile it and, at
 * the beginning of your next upkeep, you may cast this card from exile without
 * paying its mana cost."
 * <p/>
 * 702.85b Casting a card without paying its mana cost as the result of a rebound
 * ability follows the rules for paying alternative costs in rules 601.2b and 601.2e-g.
 * <p/>
 * 702.85c Multiple instances of rebound on the same spell are redundant.

 * @author maurer.it_at_gmail.com
 */
public class ReboundAbility extends TriggeredAbilityImpl<ReboundAbility> {
	//20101001 - 702.85
	private boolean installReboundEffect;

	public ReboundAbility ( ) {
		super(Zone.STACK, null);
		this.installReboundEffect = false;
	}

	public ReboundAbility ( ReboundAbility ability ) {
		super(ability);
	}

	@Override
	public boolean checkTrigger(GameEvent event, Game game) {
		//Something hit the stack from the hand, see if its a spell with this ability.
		if ( event.getType() == EventType.ZONE_CHANGE &&
			 ((ZoneChangeEvent)event).getFromZone() == Zone.HAND &&
			 ((ZoneChangeEvent)event).getToZone() == Zone.STACK )
		{
			Card card = (Card)game.getObject(event.getTargetId());

			if ( card.getAbilities().contains(this) ) {
				this.installReboundEffect = true;
			}
		}

		//Only 'install' the effect on a successfully cast spell otherwise the user
		//may cancel before paying its costs and potentially having two copies rebound
		if ( event.getType() == EventType.SPELL_CAST && this.installReboundEffect ) {
			Spell spell = game.getStack().getSpell(event.getTargetId());
			if (spell != null && spell.getSourceId().equals(this.getSourceId())) {
				spell.getSpellAbility().addEffect(new ReboundEffect());
				this.installReboundEffect = false;
			}
		}
		return false;
	}

	@Override
	public String getRule() {
		return "Rebound (If you cast this spell from your hand, exile it as it resolves. At the beginning of your next upkeep, you may cast this card from exile without paying its mana cost.)";
	}

	@Override
	public ReboundAbility copy() {
		return new ReboundAbility(this);
	}
}

/**
 * Upon successful resolution of a spell with the {@link ReboundAbility} this effect
 * will setup a {@link ReboundCastFromHandReplacementEffect replacement effect} which
 * will only work once.  It will then setup a {@link ReboundEffectCastFromExileDelayedTrigger delayed trigger}
 * which will fire upon the controllers next upkeep.
 *
 * @author maurer.it_at_gmail.com
 */
class ReboundEffect extends OneShotEffect<ReboundEffect> {

	public ReboundEffect ( ) {
		super(Outcome.Benefit);
	}

	public ReboundEffect ( ReboundEffect effect ) {
		super(effect);
	}

	@Override
	public boolean apply(Game game, Ability source) {
		Card sourceCard = (Card)game.getObject(source.getSourceId());
		ReboundEffectCastFromExileDelayedTrigger trigger = new ReboundEffectCastFromExileDelayedTrigger(sourceCard.getId(), sourceCard.getId());
		trigger.setControllerId(source.getControllerId());
		game.addDelayedTriggeredAbility(trigger);

		game.getContinuousEffects().addEffect(new ReboundCastFromHandReplacementEffect(sourceCard.getId()), source);
		return true;
	}

	@Override
	public ReboundEffect copy() {
		return new ReboundEffect(this);
	}
}

/**
 * This replacement effect needs to be created only when the spell with rebound
 * successfully resolves.  This will help to ensure that interactions with Leyline of the Void
 * or any other such effect will not get in the way.  This should take precendence
 * in such interactions.
 *
 * @author maurer.it_at_gmail.com
 */
class ReboundCastFromHandReplacementEffect extends ReplacementEffectImpl<ReboundCastFromHandReplacementEffect> {

	private UUID cardId;

	ReboundCastFromHandReplacementEffect ( UUID cardId ) {
		super(Duration.OneUse, Outcome.Exile);
		this.cardId = cardId;
	}

	ReboundCastFromHandReplacementEffect ( ReboundCastFromHandReplacementEffect effect ) {
		super(effect);
		this.cardId = effect.cardId;
	}

	@Override
	public boolean apply(Game game, Ability source) {
		throw new UnsupportedOperationException("Not supported.");
	}

	@Override
	public ReboundCastFromHandReplacementEffect copy() {
		return new ReboundCastFromHandReplacementEffect(this);
	}

	@Override
	public boolean replaceEvent(GameEvent event, Ability source, Game game) {
		Card sourceCard = (Card)game.getObject(source.getSourceId());
		Player player = game.getPlayer(sourceCard.getOwnerId());

		sourceCard.moveToExile(source.getSourceId(), player.getName() + " Rebound Exile", source.getSourceId(), game);
		this.used = true;

		return true;
	}

	@Override
	public boolean applies(GameEvent event, Ability source, Game game) {
		if ( event.getType() == EventType.ZONE_CHANGE &&
			 ((ZoneChangeEvent)event).getFromZone() == Zone.STACK &&
			 ((ZoneChangeEvent)event).getToZone() == Zone.GRAVEYARD &&
			 source.getSourceId() == this.cardId )
		{
			return true;
		}
		return false;
	}

	@Override
	public String getText(Ability source) {
		return "Rebound - If you cast {this} from your hand, exile it as it resolves";
	}
}

/**
 * This delayed trigger will tell the framework when its ok to kick off the
 * {@link ReboundCastSpellFromExileEffect} by checking the step and the controller
 * of this ability.  When it is the controllers upkeep step the framework will then
 * be told it can kick off the effect.
 *
 * @author maurer.it_at_gmail.com
 */
class ReboundEffectCastFromExileDelayedTrigger extends DelayedTriggeredAbility<ReboundEffectCastFromExileDelayedTrigger> {

	ReboundEffectCastFromExileDelayedTrigger ( UUID cardId, UUID sourceId ) {
		super(new ReboundCastSpellFromExileEffect(cardId));
		setSourceId(sourceId);
		this.optional = true;
	}

	ReboundEffectCastFromExileDelayedTrigger ( ReboundEffectCastFromExileDelayedTrigger ability ) {
		super(ability);
	}

	@Override
	public ReboundEffectCastFromExileDelayedTrigger copy() {
		return new ReboundEffectCastFromExileDelayedTrigger(this);
	}

	@Override
	public boolean checkTrigger(GameEvent event, Game game) {
		if ( event.getType() == EventType.UPKEEP_STEP_PRE && MyTurn.getInstance().apply(game, this) ) {
			return true;
		}
		return false;
	}
}

/**
 * Will be triggered by {@link ReboundEffectCastFromExileDelayedTrigger} and will
 * simply cast the spell then remove it from its former home in exile.
 *
 * @author maurer.it_at_gmail.com
 */
class ReboundCastSpellFromExileEffect extends OneShotEffect<ReboundCastSpellFromExileEffect> {

	private UUID cardId;

	ReboundCastSpellFromExileEffect ( UUID cardId ) {
		super(Outcome.Benefit);
		this.cardId = cardId;
	}

	ReboundCastSpellFromExileEffect ( ReboundCastSpellFromExileEffect effect ) {
		super(effect);
		this.cardId = effect.cardId;
	}

	@Override
	public boolean apply(Game game, Ability source) {
		ExileZone zone = game.getExile().getExileZone(this.cardId);
		Card reboundCard = zone.get(this.cardId, game);
		Player player = game.getPlayer(source.getControllerId());
		SpellAbility ability = reboundCard.getSpellAbility();

		player.cast(ability, game, true);
		zone.remove(reboundCard.getId());

		return true;
	}

	@Override
	public ReboundCastSpellFromExileEffect copy() {
		return new ReboundCastSpellFromExileEffect(this);
	}

	@Override
	public String getText(Ability source) {
		return "Rebound - You may cast {this} from exile without paying its mana cost";
	}
}
