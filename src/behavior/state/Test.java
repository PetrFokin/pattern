package behavior.state;

public class Test {

    public static void main(String[] args) {
        Room room = new Room();
        room.book();
        room.free();
        room.rent();
        room.book();
        room.rent();
        room.free();
    }
}
