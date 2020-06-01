package behavior.template;

import java.util.List;

import static java.util.Arrays.asList;

public class SimpleCooking implements Cooking {

    @Override
    public String findReceipt() {
        return "Pasta with shrimps";
    }

    @Override
    public List<String> prepareListOfProducts(String receipt) {
        return asList("Pasta", "Shrimps", "Sour cream", "Tomatoes");
    }

    @Override
    public List<String> buy(List<String> products) {
        return asList("Pasta", "Shrimps", "Sour cream", "Tomatoes");
    }
}
