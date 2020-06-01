package creation.singleton.threadsafe;

public class ThreadSafeLazySingleton {
    private static ThreadSafeLazySingleton INSTANCE;

    private ThreadSafeLazySingleton() {}

    public static synchronized ThreadSafeLazySingleton getInstance() {
        if (INSTANCE == null)
            INSTANCE = new ThreadSafeLazySingleton();
        return INSTANCE;
    }
}
