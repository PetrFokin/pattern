package creation.builder;

/**
 * Elegant implementation of builder.
 * Attention: It isn't thread safe.
 */
public class Club {
    private String name;
    private int capacity;
    private int drugDealers;
    private double ticketCost;

    private Club() {

    }

    @Override
    public String toString() {
        return "Club{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", drugDealers=" + drugDealers +
                ", ticketCost=" + ticketCost +
                '}';
    }

    public static Builder newBuilder() {
        return new Club().new Builder();
    }

    public class Builder {

        private Builder() {

        }

        public Builder setName(String name) {
            Club.this.name = name;
            return this;
        }

        public Builder setCapacity(int capacity) {
            Club.this.capacity = capacity;
            return this;
        }

        public Builder setDrugDealers(int drugDealers) {
            Club.this.drugDealers = drugDealers;
            return this;
        }

        public Builder setTicketCost(double ticketCost) {
            Club.this.ticketCost = ticketCost;
            return this;
        }

        public Club build() {
            return Club.this;
        }
    }
}
