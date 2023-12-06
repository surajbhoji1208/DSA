package DoublyLinkedLIst;

public class DoublyLinkedList {
    private  Node head;
    private Node tail;
    private  int length;

    class  Node{
        int value;
        Node next;
        Node prev;
        Node(int value)
        {
            this.value=value;
        }

    }

    public DoublyLinkedList(int value)
    {
        Node newNode=new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }


    public  void printList()
    {
        Node temp=head;
        while (temp!=null)
        {
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
    public void Head()
    {
        System.out.println("head:"+head.value);

    }
    public  void Tail()
    {
        System.out.println("tail:"+tail.value);
    }
    public void Length()
    {
        System.out.println("lenth:"+length);
    }

        /*  append in doublylinked list*/

    public  void apend(int value)
    {
        Node newNode=new Node(value);
        if(length==0)
        {
            head=newNode;
            tail=newNode;
        }
        else {
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
        length++;
    }


    /* remove linked list from back*/
    public  Node RemoveNode()
    {
        Node temp=tail;
        if(length==0)
        {
           return null;
        }
        if(length==0)
        {
            head=null;
            tail=null;
        }else {
            tail=tail.prev;
            tail.next=null;
            temp.prev=null;
        }
        length--;
        return temp;
    }


    /*prepend linked list from front*/
    public void PrependList(int value)
    {
        Node newNode=new Node(value);
        if(length == 0)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        length++;
    }

    /*remove first */
    public Node RemoveFirst()
    {
        if(length == 0)
        {
            return null;
        }
        Node temp=head;
        if(length == 1)
        {
            head=null;
            tail=null;
        }
        else {
            head=head.next;
            head.prev=null;
            temp.next=null;
        }
        length--;
        return  temp;
    }

    /*get by index*/
    public Node getList(int index)
    {
        if(length < 0 || index >=length)
        {
            return null;
        }
        Node temp=head;
        if(index < length/2)
        {
            for (int i=0;i<index;i++)
            {
                temp=temp.next;
            }
        }else
        {
            temp = tail;
            for (int i=length-1;i>index;i--)
            {
                temp=temp.prev;
            }
        }
        return temp;
    }

    /* set value by index*/
    public  boolean setByIndex(int index, int value)
    {
        Node temp = getList(index);
        if(temp !=null)
        {
            temp.value=value;
            return true;
        }
        return false;
    }

    /* insert node at perticular index*/
    public  boolean insert(int index, int value)
    {
        if(length < 0 || index > length)
        {
            return  false;
        }
        if (index == 0)
        {
            PrependList(value);
            return true;
        }
        if (index == length)
        {
            apend(value);
            return  true;
        }
        Node newNode = new Node(value);
        Node before = getList(index-1);
        Node after=before.next;
        newNode.prev=before;
        newNode.next=after;
        before.next=newNode;
        after.prev=newNode;
        length++;
        return true;
    }


    //remove by index
    public Node RemoveNode(int index)
    {
        if(index < 0 || index >= length) return  null;
        if (index == 0) return RemoveFirst();
        if(index == length-1) return  RemoveNode();

        Node temp = getList(index);
        temp.next.prev=temp.prev;
        temp.prev.next=temp.next;
        temp.prev=null;
        temp.next=null;
        length--;
        return temp;
    }






}
