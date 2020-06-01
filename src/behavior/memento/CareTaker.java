package behavior.memento;

import java.util.ArrayDeque;
import java.util.Deque;

public class CareTaker {

    private final Deque<Save> saves = new ArrayDeque<>();

    public void addSave(Save save) {
        saves.push(save);
    }

    public Save getSave() {
        return saves.poll();
    }
}
