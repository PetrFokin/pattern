package creation.singleton.threadsafe;

public class ThreadSafeDoubleCheckedLazySingleton {
    private static volatile ThreadSafeDoubleCheckedLazySingleton INSTANCE;

    private ThreadSafeDoubleCheckedLazySingleton() {}

    public static ThreadSafeDoubleCheckedLazySingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (ThreadSafeDoubleCheckedLazySingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ThreadSafeDoubleCheckedLazySingleton();
                }
            }
        }
        return INSTANCE;
    }
}
