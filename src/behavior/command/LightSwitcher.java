package behavior.command;

public class LightSwitcher {
    public static void turn(Command command) {
        command.execute();
    }
}
