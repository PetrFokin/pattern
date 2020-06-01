package behavior.state;

import java.io.IOException;

public class RentState implements RoomState {

    private Room room;

    public RentState(Room room) {
        this.room = room;
    }

    @Override
    public void free() {
        room.setState(new FreeState(room));
        System.out.println("The room is free");
    }

    @Override
    public void book() {
        System.out.println("The room has been already rented");
    }

    @Override
    public void rent() {
        System.out.println("The room has been already rented");
    }
}
