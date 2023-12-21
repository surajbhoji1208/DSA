package tree.BST;

public class main {
    public static void main(String[] args) {
        BinarySearceTree bst = new BinarySearceTree();

        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(52);
        bst.insert(82);
        bst.insert(27);

//        System.out.println(bst.rContains(2));
//        System.out.println(bst.contain(2));


//        insert recurion

        bst.rInsert(12);
        System.out.println("root=="+bst.root.value);
    }
}
