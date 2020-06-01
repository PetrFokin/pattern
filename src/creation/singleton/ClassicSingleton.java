package creation.singleton;

public class ClassicSingleton {
    public static final ClassicSingleton INSTANCE = new ClassicSingleton();

    private ClassicSingleton() {}
}
