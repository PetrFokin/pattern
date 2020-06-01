package structure.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements Data {

    private static final String EXTRA_SPACE = "...";

    private final String name;
    private final List<Data> files = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(Data data) {
        files.add(data);
    }

    @Override
    public void remove(Data data) {
        files.remove(data);
    }

    @Override
    public void display() {
        System.out.println(EXTRA_SPACE + name);
        files.forEach(Data::display);
    }
}
