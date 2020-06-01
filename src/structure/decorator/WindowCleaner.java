package structure.decorator;

public class WindowCleaner implements Cleaner {
    private final Cleaner cleaner;

    public WindowCleaner(Cleaner cleaner) {
        this.cleaner = cleaner;
    }

    @Override
    public void clean() {
        cleaner.clean();
        cleanWindow();
    }

    public void cleanWindow() {
        System.out.println("Clean a window");
    }
}
