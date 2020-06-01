package structure.decorator;

public class KitchenCleaner implements Cleaner {

    private final Cleaner cleaner;

    public KitchenCleaner(Cleaner cleaner) {
        this.cleaner = cleaner;
    }

    @Override
    public void clean() {
        cleaner.clean();
        cleanOwen();
    }

    public void cleanOwen() {
        System.out.println("Clean an owen");
    }
}
