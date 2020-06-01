package behavior.chainofresponsibility;

import java.util.EnumSet;

public class Customer {
    private final EnumSet<Bag> bags;

    public Customer(Bag bag, Bag ... bags) {
        this.bags = EnumSet.of(bag, bags);
    }

    public EnumSet<Bag> getBags() {
        return bags;
    }
}
