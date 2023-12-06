package queue;

public class main {
    public static void main(String[] args) {
        Queue queue = new Queue(0);
        queue.getFirst();
        queue.getLast();
        queue.getLength();
        queue.printQueue();

        /*Add node in queue*/
//        queue.addQueue(1);
//        queue.printQueue();

        /*dequeue*/
        queue.addQueue(1);
        queue.addQueue(2);
        queue.deQueue();
        queue.printQueue();


    }
}
