package structure.decorator;

public class Test {

    public static void main(String[] args) {
        Cleaner simpleCleaner = new SimpleCleaner();
        WindowCleaner windowCleaner = new WindowCleaner(simpleCleaner);
        KitchenCleaner kitchenCleaner = new KitchenCleaner(windowCleaner);
        kitchenCleaner.clean();
    }
}
