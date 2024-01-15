package TreeTraverse;

import java.util.ArrayList;
import java.util.List;

public class DFSPreOrder {

    Node root;

    class  Node
    {
        int value;
        Node left;
        Node rigth;

        private  Node(int value)
        {
            this.value=value;
        }

    }

    //insert method
    public  boolean insert(int value)
    {
        Node newNode = new Node(value);
        if(root == null)
        {
            root = newNode;
            return  true;
        }
        Node temp=root;
        while (true)
        {
            if(newNode.value ==  temp.value)
            {
                return false;
            }
            if (newNode.value< temp.value)
            {
                if(temp.left==null)
                {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            }
            else
            {
                if(temp.rigth == null){
                    temp.rigth = newNode;
                    return true;
                }
                temp =temp.rigth;
            }
        }
    }

    /* DFS preorder */
    public ArrayList<Integer> DFSPreorder()
    {
        ArrayList<Integer> result = new ArrayList<>();

        class Traverse{ //we cant create methode inside a methos there for we create class and inside class declear one method constructor
            public Traverse(Node CurrentNode)
            {
                result.add(CurrentNode.value);
                if(CurrentNode.left != null){
                    new Traverse(CurrentNode.left);
                }
                if (CurrentNode.rigth != null)
                {
                    new Traverse(CurrentNode.rigth);
                }
            }
        }
        new Traverse(root);

        return result;
    }

    /* main methode*/
    public static void main(String[] args) {
        DFSPreOrder bst = new DFSPreOrder();

        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(27);
        bst.insert(52);
        bst.insert(82);

        bst.DFSPreorder();
    }
}

