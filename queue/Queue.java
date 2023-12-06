package queue;

public class Queue {
    private Node first;
    private Node last;
    private  int length;
    public  class Node
    {
        int value;
        Node next;
        public  Node(int value)
        {
            this.value=value;
            next=null;
        }
    }

    public Queue(int value)
    {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public  void getFirst()
    {
        System.out.println("first=: "+first.value);
    }
    public void getLast()
    {
        System.out.println("last=:"+last.value);
    }
    public void getLength()
    {
        System.out.println("length=: "+length);
    }
    public void printQueue()
    {
        Node temp = first;
        while (temp != null)
        {
            System.out.print(temp.value+"=>");
            temp=temp.next;
        }
        System.out.println();

    }

    /*Add node into queue*/
    public void addQueue(int value)
    {
        Node newNode = new Node(value);
        if (length == 0) {
            first = newNode;
            last = newNode;
        }
        else
        {
            last.next = newNode;
            last=newNode;
        }
        length++;

    }

    public Node deQueue()
    {

        if (length == 0)
            return null;
        Node temp = first;
        if (length == 1)
        {
            first =null;
            last=null;
        }
        else {
            first =first.next;
            temp.next = null;
        }
        length--;
        return temp;
    }



}
