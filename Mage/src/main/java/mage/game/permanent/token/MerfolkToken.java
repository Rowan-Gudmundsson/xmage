package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

/**
 * @author spjspj
 */
public final class MerfolkToken extends TokenImpl {

    public MerfolkToken() {
        super("Merfolk Token", "1/1 blue Merfolk creature token");
        cardType.add(CardType.CREATURE);
        color.setBlue(true);
        subtype.add(SubType.MERFOLK);
        power = new MageInt(1);
        toughness = new MageInt(1);
    }

    protected MerfolkToken(final MerfolkToken token) {
        super(token);
    }

    public MerfolkToken copy() {
        return new MerfolkToken(this);
    }
}
