package behavior.state;

public class Room {

    private RoomState state = new FreeState(this);

    public void setState(RoomState state) {
        this.state = state;
    }

    public void free() {
        state.free();
    }

    public void book() {
        state.book();
    }

    public void rent() {
        state.rent();
    }
}
