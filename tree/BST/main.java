package tree.BST;

public class main {
    public static void main(String[] args) {
        BinarySearceTree bst = new BinarySearceTree();
        System.out.println("root=="+bst.root);
        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(52);
        bst.insert(82);
        bst.insert(27);

        System.out.println(bst.contain(2));
    }
}
