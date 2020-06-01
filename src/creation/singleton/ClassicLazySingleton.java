package creation.singleton;

public class ClassicLazySingleton {
    private static ClassicLazySingleton INSTANCE;

    private ClassicLazySingleton() {}

    public static ClassicLazySingleton getInstance() {
        if (INSTANCE == null)
            INSTANCE = new ClassicLazySingleton();
        return INSTANCE;
    }
}
