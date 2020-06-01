package behavior.observer;

public interface Observable {
    void attacheObserver(Observer observer);
    void changeState(String state);
    String getState();
}
