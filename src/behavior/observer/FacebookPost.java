package behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class FacebookPost implements Observable {

    private String state;
    private List<Observer> observers = new ArrayList<>();

    public FacebookPost(String state) {
        this.state = state;
    }

    @Override
    public void attacheObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void changeState(String state) {
        this.state = state;
        observers.forEach(Observer::getNotification);
    }

    @Override
    public String getState() {
        return state;
    }
}
