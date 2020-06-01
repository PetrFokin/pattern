package behavior.chainofresponsibility;

import java.util.EnumSet;

public enum Bag {
    WEAR, BOOK, LAPTOP, PHONE, PASSPORT, WALLET, PISTOL, MACHINE_GUN, DRUG, KNIFE, EXPLOSIVE;

    public final static EnumSet<Bag> ILLEGAL_THINGS = EnumSet.of(PISTOL, MACHINE_GUN, DRUG, KNIFE, EXPLOSIVE);
    public final static EnumSet<Bag> WEAPONS = EnumSet.of(PISTOL, MACHINE_GUN, KNIFE);
}
