package structure.composite;

public class File implements Data {

    private static final String EXTRA_SPACE = ".....";

    private final String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void add(Data data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Data data) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void display() {
        System.out.println(EXTRA_SPACE + name);
    }
}
