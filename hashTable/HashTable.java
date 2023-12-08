package hashTable;

public class HashTable {
    private  int size =7;
    private  Node[] dataMap;

    class  Node
    {
        String key;
        int value;
        Node next;
        Node(String key, int value)
        {
            this.key=key;
            this.value=value;
        }

    }
    public  HashTable()
    {
        dataMap =new Node[size];
    }

    public  void printTable()
    {
        for(int i=0;i<dataMap.length;i++)
        {
            System.out.println(i+":");
            Node temp = dataMap[i];
            while (temp !=null)
            {
                System.out.println("{"+temp.key + "=" + temp.value + "}");
                temp=temp.next;
            }
        }
    }

    //creating hash method for  crating hash index
    private  int hash(String key)
    {
        int hash =0;
        char[] keyChar = key.toCharArray();
        for(int i=0;i<keyChar.length;i++)
        {
            int assciiValue = keyChar[i];
            hash = (hash + assciiValue * 23) % dataMap.length;
        }
        return hash;
    }


    //set method
    public  void set(String key , int value)
    {
        int index = hash(key);
        Node newNode = new Node(key , value);
        if(dataMap[index]==null)
        {
            dataMap[index]=newNode;
        }else
        {
            Node temp = dataMap[index];
            while (temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
}
