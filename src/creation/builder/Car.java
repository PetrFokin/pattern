package creation.builder;

/**
 * Classic implementation of builder.
 */
public class Car {
    private final String mark;
    private final double fuelTank;
    private final double engine;
    private final int speedLimit;
    private final int weight;
    private final int seat;

    private Car(Builder builder) {
        this.mark = builder.mark;
        this.fuelTank= builder.fuelTank;
        this.engine= builder.engine;
        this.speedLimit= builder.speedLimit;
        this.weight= builder.weight;
        this.seat= builder.seat;
    }

    public String getMark() {
        return mark;
    }

    public double getFuelTank() {
        return fuelTank;
    }

    public double getEngine() {
        return engine;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public int getWeight() {
        return weight;
    }

    public int getSeat() {
        return seat;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", fuelTank=" + fuelTank +
                ", engine=" + engine +
                ", speedLimit=" + speedLimit +
                ", weight=" + weight +
                ", seat=" + seat +
                '}';
    }

    public static class Builder {
        private String mark;
        private double fuelTank;
        private double engine;
        private int speedLimit;
        private int weight;
        private int seat;

        public Builder setMark(String mark) {
            this.mark = mark;
            return this;
        }

        public Builder setFuelTank(double fuelTank) {
            this.fuelTank = fuelTank;
            return this;
        }

        public Builder setEngine(double engine) {
            this.engine = engine;
            return this;
        }

        public Builder setSpeedLimit(int speedLimit) {
            this.speedLimit = speedLimit;
            return this;
        }

        public Builder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Builder setSeat(int seat) {
            this.seat = seat;
            return this;
        }
        
        public Car build() {
            return new Car(this);
        }
    }
}
