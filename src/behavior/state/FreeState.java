package behavior.state;

public class FreeState implements RoomState {

    private Room room;

    public FreeState(Room room) {
        this.room = room;
    }

    @Override
    public void free() {
        System.out.println("The room is free");
    }

    @Override
    public void book() {
        room.setState(new BookState(room));
        System.out.println("The room is booked");
    }

    @Override
    public void rent() {
        room.setState(new RentState(room));
        System.out.println("The room is rented");
    }
}
