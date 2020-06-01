package behavior.template;

import java.util.List;

public interface Cooking {
    String findReceipt();
    List<String> prepareListOfProducts(String receipt);
    List<String> buy(List<String> products);

    default void cook() {
        String receipt = findReceipt();
        List<String> productsList = prepareListOfProducts(receipt);
        List<String> goods = buy(productsList);
        System.out.println("Cooking...");
    }
}
