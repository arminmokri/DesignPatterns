package structural.flyweight;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();

        forest.plantTree(15, 25, "Pine", "Dark Green", "Scaly");
        forest.plantTree(10, 10, "Oak", "Green", "Rough");
        forest.plantTree(10, 11, "Oak", "Green", "Rough"); // Reuses Oak type
        forest.plantTree(10, 12, "Oak", "Green", "Rough"); // Reuses Oak type
        forest.plantTree(10, 13, "Oak", "Green", "Rough"); // Reuses Oak type
        forest.plantTree(10, 14, "Oak", "Green", "Rough"); // Reuses Oak type
        forest.plantTree(10, 15, "Oak", "Green", "Rough"); // Reuses Oak type
        forest.plantTree(10, 16, "Oak", "Green", "Rough"); // Reuses Oak type
        forest.plantTree(10, 17, "Oak", "Green", "Rough"); // Reuses Oak type
        forest.plantTree(10, 18, "Oak", "Green", "Rough"); // Reuses Oak type

        forest.draw();
        System.out.println();

        Set<TreeType> treeTypes = new HashSet<>();
        for (Tree tree : forest.getTrees()) {
            TreeType treeType = tree.type();
            treeTypes.add(treeType);
        }

        // although we have 10 trees, we just have 2 types.
        // (for example in GTA millions of tree is in the game, but we just have few unique tree types)
        System.out.println("Tree number: " + forest.getTrees().size());
        System.out.println("Tree Type number: " + treeTypes.size());

    }
}
