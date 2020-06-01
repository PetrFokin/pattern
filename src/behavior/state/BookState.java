package behavior.state;

public class BookState implements RoomState {

    private Room room;

    public BookState(Room room) {
        this.room = room;
    }

    @Override
    public void free() {
        room.setState(new FreeState(room));
        System.out.println("The room is free");
    }

    @Override
    public void book() {
        System.out.println("The room has been already booked");
    }

    @Override
    public void rent() {
        room.setState(new RentState(room));
        System.out.println("The room is rented");
    }
}
