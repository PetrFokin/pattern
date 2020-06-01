package behavior.command;

public class Test {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);
        LightSwitcher.turn(lightOnCommand);
        LightSwitcher.turn(lightOffCommand);
    }
}
