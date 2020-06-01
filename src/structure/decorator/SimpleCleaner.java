package structure.decorator;

public class SimpleCleaner implements Cleaner {
    @Override
    public void clean() {
        System.out.println("Clean a floor");
    }
}
