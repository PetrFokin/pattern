package structure.adapter;

public class Nokia implements Phone {
    @Override
    public void call() {
        System.out.println("Make a call");
    }
}
