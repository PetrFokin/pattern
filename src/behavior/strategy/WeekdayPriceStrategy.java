package behavior.strategy;

public class WeekdayPriceStrategy implements PriceStrategy {

    private final int rate;

    public WeekdayPriceStrategy(int rate) {
        this.rate = rate;
    }

    @Override
    public Integer countPrice(int price) {
        return this.rate * price;
    }
}
