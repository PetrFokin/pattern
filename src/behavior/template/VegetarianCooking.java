package behavior.template;

import java.util.List;

import static java.util.Arrays.asList;

public class VegetarianCooking implements Cooking {

    @Override
    public String findReceipt() {
        return "Buckwheat with soy meat";
    }

    @Override
    public List<String> prepareListOfProducts(String receipt) {
        return asList("Beans", "Soy meat", "Buckwheat");
    }

    @Override
    public List<String> buy(List<String> products) {
        return asList("Beans", "Soy meat", "Buckwheat");
    }
}
