package structure.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

    private final Map<String, TreeType> treeTypes = new HashMap<>();

    public Tree getTree(String type) {
        TreeType treeType = treeTypes.get(type);
        if (treeType == null) {
            treeType = new TreeType(type, new Object());
            treeTypes.put(type, treeType);
            System.out.println("Create new TreeType: " + type);
        }
        return new Tree(treeType);
    }
}
