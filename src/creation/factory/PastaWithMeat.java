package creation.factory;

public class PastaWithMeat implements Pasta {
    @Override
    public int getCost() {
        return 550;
    }

    @Override
    public int getSize() {
        return 450;
    }

    @Override
    public int getCalorie() {
        return 750;
    }
}
