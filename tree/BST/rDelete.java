package tree.BST;

public class rDelete {
    public static void main(String[] args) {
        BinarySearceTree bst = new BinarySearceTree();
        bst.insert(2);
        bst.insert(1);
        bst.insert(3);


            /*
                2
              /  \
             1    3

            */
        System.out.println("root==>"+bst.root.value);
        System.out.println("root-left==>"+bst.root.left.value);
        System.out.println("root-right==>"+bst.root.rigth.value);

        bst.rDelete(2);
        /*
                3
              /  \
             1    null

            */

        System.out.println("root==>"+bst.root.value);
        System.out.println("root-left==>"+bst.root.left.value);
        System.out.println("root-right==>"+bst.root.rigth);

    }
}
