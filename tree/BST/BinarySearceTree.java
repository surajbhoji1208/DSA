package tree.BST;

public class  BinarySearceTree {
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

    //contains method using recursion
    public  boolean rContains(int value)
    {
        return rContains(root,value);
    }

    private boolean rContains(Node currentNode,int value)
    {
        if(currentNode ==null)
        {
            return false;
        }
        if(currentNode.value ==  value)
        {
            return true;
        }
        if(value < currentNode.value)
        {
            return rContains(currentNode.left,value);
        }
        else
        {
            return rContains(currentNode.rigth,value);
        }
    }

    //insert method using recursion
    public void rInsert(int value)
    {
         rInsert(root, value);
    }
    public Node rInsert(Node currentNode,int value)
    {
            if(currentNode == null) return new Node(value);

            if(value< currentNode.value)
            {
                currentNode.left = rInsert(currentNode.left,value);
            } else if (value> currentNode.value) {
                currentNode.rigth =rInsert(currentNode.rigth,value);
            }
            return currentNode;
    }

}
