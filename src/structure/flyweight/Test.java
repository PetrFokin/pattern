package structure.flyweight;

public class Test {
    public static void main(String[] args) {
        TreeFactory treeFactory = new TreeFactory();
        Tree tree1 = treeFactory.getTree("pine");
        tree1.setX(10);
        tree1.setY(20);
        Tree tree2 = treeFactory.getTree("birch");
        tree2.setY(35);
        tree2.setX(10);
        Tree tree3 = treeFactory.getTree("pine");
        tree3.setX(11);
        tree3.setY(28);
    }
}
