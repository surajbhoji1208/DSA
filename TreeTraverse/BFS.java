package TreeTraverse;

import tree.BST.BinarySearceTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
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
    //contains method
    public boolean contain(int value)
    {
        Node temp = root;
        while(temp != null)
        {
            if(value < temp.value)
            {
                temp=temp.left;
            }
            else if (value > temp.value) {
                temp= temp.rigth;

            }
            else
            {
                return true;
            }
        }
        return  false;
    }

                /* BFS methods starts */
    public ArrayList<Integer> BFS_Traverce()
    {
        Node currNode = root;

        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        queue.add(currNode);

        while (queue.size()>0)
        {
            currNode = queue.remove();
            result.add(currNode.value);
            if (currNode.left != null)
            {
                queue.add(currNode.left);
            }
            if (currNode.rigth != null)
            {
                queue.add(currNode.rigth);
            }
        }
        return result;
    }

}
