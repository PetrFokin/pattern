package behavior.command;

public class Light {

    private boolean turnedOn = false;

    public void turnOn() {
        System.out.println("Light is turned on");
        turnedOn = true;
    }

    public void turnOff() {
        System.out.println("Light is turned off");
        turnedOn = false;
    }
}
