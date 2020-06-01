package behavior.observer;

public class User implements Observer {

    private Observable observable;

    public User(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void getNotification() {
        System.out.println(observable.getState());
    }
}
