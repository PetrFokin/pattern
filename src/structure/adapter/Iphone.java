package structure.adapter;

public class Iphone implements SmartPhone {

    @Override
    public void call() {
        System.out.println("Make a smart call");
    }

    @Override
    public void makePhoto() {

    }

    @Override
    public void internetSurfing() {

    }
}
