package structure.flyweight;

public class Tree {

    private int x;
    private int y;
    private TreeType type;

    public Tree(TreeType type) {
        this.type = type;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
