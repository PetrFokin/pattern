package behavior.strategy;

import java.util.HashMap;
import java.util.Map;

public class Cinema {

    private PriceStrategy priceStrategy;
    private final Map<String, Integer> prices = new HashMap<>();

    public Cinema() {
        init();
    }

    public Integer getTicketCost(String filmName) {
        return priceStrategy.countPrice(prices.getOrDefault(filmName, 150));
    }

    public void setPriceStrategy(PriceStrategy priceStrategy) {
        this.priceStrategy = priceStrategy;
    }

    private void init() {
        prices.put("Escape from Shousheng", 100);
        prices.put("Big Lebowski", 300);
    }
}
