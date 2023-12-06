package stackArray;

public class main {
    public static void main(String[] args) {
        stack stack = new stack(4);
//        System.out.println("is Empty:"+stack.isEmpty());
//        System.out.println("is full: "+stack.isFull());

        /*push*/
        stack.push(2);
        stack.push(3);

        /*pop*/
//        System.out.println(stack.pop());

        /*peek method*/
//        System.out.println(stack.peek());

        /*delete*/
        stack.delete();

    }
}
