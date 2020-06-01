package creation.factory;

public class PastaWithPrawn implements Pasta{
    @Override
    public int getCost() {
        return 500;
    }

    @Override
    public int getSize() {
        return 300;
    }

    @Override
    public int getCalorie() {
        return 500;
    }
}
