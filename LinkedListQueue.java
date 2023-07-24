import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args) {
        Queue <Integer> queue = new LinkedList<>();

        // add element in the queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        System.out.println(queue);

        //  Remove element in the queue
        System.out.println(queue.poll());
        System.out.println(queue);

        //  peek()  next value that is ready to remove
        System.out.println(queue.peek());

    }
}
