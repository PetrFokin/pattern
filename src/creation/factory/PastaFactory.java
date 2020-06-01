package creation.factory;

public class PastaFactory {
    public Pasta makePasta(String type) {
        switch (type) {
            case "CHEESE":
                return new PastaWithCheese();
            case "MEAT":
                return new PastaWithMeat();
            case "PRAWN":
                return new PastaWithPrawn();
            case "MUSHROOM":
                return new PastaWithMushroom();
            default:
                throw new IllegalArgumentException("We don't have the same dish");
        }
    }
}
