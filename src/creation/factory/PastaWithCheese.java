package creation.factory;

public class PastaWithCheese implements Pasta {
    @Override
    public int getCost() {
        return 450;
    }

    @Override
    public int getSize() {
        return 300;
    }

    @Override
    public int getCalorie() {
        return 600;
    }
}
