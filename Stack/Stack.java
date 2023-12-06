package Stack;

public class Stack {
    private Node top;
    private int height;

    class  Node{
        int value;
        Node next;
        Node(int value)
        {
            this.value = value;
        }

    }

    public Stack(int value)
    {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void printStack()
    {
        Node temp =top;
        while (temp != null)
        {
            System.out.print(temp.value+"=>");
            temp=temp.next;
        }
    }

    public  void  getTop()
    {
        System.out.println("top==> "+ top.value);
    }
    public void getHeigth()
    {

        System.out.println("heigth==> "+ height);
    }

            /*pushe method*/
    public void push(int value)
    {
        Node newNode = new Node(value);
        if(height == 0)
        {
            top = null;
        }
        else
        {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

            /*pop mothod*/
    public  Node pop()
    {
        Node temp = top;
        if (height == 0 )
            return null;
        else
        {
            top = top.next;
            temp = null;

        }
        height--;
        return temp;
    }





}
