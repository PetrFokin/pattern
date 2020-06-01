package creation.singleton.threadsafe;

public class OnDemandSingleton {

    private OnDemandSingleton() {}

    public static OnDemandSingleton getInstance() {
        return OnDemandSingletonHolder.INSTANCE;
    }

    private static class OnDemandSingletonHolder {
        private static final OnDemandSingleton INSTANCE = new OnDemandSingleton();
    }
}
