package stackArray;

public class stack {
    int[] arr;
    int topOfStack;

    public stack(int size)
    {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("array created with size of :"+size);
    }

    /*stack is empty*/
    public  boolean isEmpty()
    {
        if(topOfStack == -1)
        {
            return  true;
        }
        else {
            return false;
        }
    }

    /*check stack is full*/
    public boolean isFull()
    {
        if(topOfStack == arr.length-1)
        {
            return true;
        }
        else {
            return  false;
        }
    }

    /* push method*/
    public  void  push(int value)
    {
        if(isFull())
        {
            System.out.println("stack is full");
        }
        else
        {
            arr[topOfStack+1]=value;
            topOfStack++;
        }
    }

    /*pop method*/
    public int pop()
    {
        if (isEmpty())
        {
            System.out.println("stack is empty");
            return -1;
        }
        else {
                int topStack = arr[topOfStack];
                topOfStack--;
                return topStack;
        }
    }

    /*peek*/
    public  int peek()
    {
        if (isEmpty())
        {
            System.out.println("stack is empty");
            return -1;

        }
        else {
            return arr[topOfStack];
        }
    }

    public void delete()
    {
        arr = null;
        System.out.println("stack delete successfully");
    }

}
