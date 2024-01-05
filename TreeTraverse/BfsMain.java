package TreeTraverse;

import tree.BST.BinarySearceTree;

public class BfsMain {
    public static void main(String[] args) {
        BFS bst = new BFS();

        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(27);
        bst.insert(52);
        bst.insert(82);

//        System.out.println(bst.rContains(2));

//        insert recurion

//        bst.rInsert(12);
//        System.out.println("root=="+bst.root.value);

                    /*BSF call8*/
        System.out.println(bst.BFS_Traverce());
    }
}
