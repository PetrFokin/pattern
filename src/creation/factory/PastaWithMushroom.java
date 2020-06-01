package creation.factory;

public class PastaWithMushroom implements Pasta{
    @Override
    public int getCost() {
        return 400;
    }

    @Override
    public int getSize() {
        return 450;
    }

    @Override
    public int getCalorie() {
        return 500;
    }
}
