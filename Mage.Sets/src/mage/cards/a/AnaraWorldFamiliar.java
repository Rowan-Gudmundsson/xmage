package mage.cards.a;

import mage.MageInt;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.condition.common.MyTurnCondition;
import mage.abilities.decorator.ConditionalContinuousEffect;
import mage.abilities.effects.common.continuous.GainAbilityControlledEffect;
import mage.abilities.keyword.IndestructibleAbility;
import mage.abilities.keyword.PartnerAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.SubType;
import mage.constants.SuperType;
import mage.filter.FilterPermanent;
import mage.filter.common.FilterControlledPermanent;
import mage.filter.predicate.permanent.CommanderPredicate;

import java.util.UUID;

/**
 * @author TheElk801
 */
public final class AnaraWorldFamiliar extends CardImpl {

    private static final FilterPermanent filter = new FilterControlledPermanent();

    static {
        filter.add(CommanderPredicate.instance);
    }

    public AnaraWorldFamiliar(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{3}{G}");

        this.addSuperType(SuperType.LEGENDARY);
        this.subtype.add(SubType.WOLF);
        this.subtype.add(SubType.BEAST);
        this.power = new MageInt(4);
        this.toughness = new MageInt(4);

        // As long as it's your turn, commanders you control have indestructible.
        this.addAbility(new SimpleStaticAbility(new ConditionalContinuousEffect(
                new GainAbilityControlledEffect(
                        IndestructibleAbility.getInstance(),
                        Duration.WhileOnBattlefield, filter
                ), MyTurnCondition.instance, "as long as it's your turn, " +
                "commanders you control have indestructible"
        )));

        // Partner
        this.addAbility(PartnerAbility.getInstance());
    }

    private AnaraWorldFamiliar(final AnaraWorldFamiliar card) {
        super(card);
    }

    @Override
    public AnaraWorldFamiliar copy() {
        return new AnaraWorldFamiliar(this);
    }
}
