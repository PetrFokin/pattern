package behavior.strategy;

public class WeekendPriceStrategy implements PriceStrategy {

    private final int rate;

    public WeekendPriceStrategy(int rate) {
        this.rate = rate;
    }

    @Override
    public Integer countPrice(int price) {
        return this.rate * price;
    }
}
