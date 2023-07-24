import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
    public static void main(String[] args) {
                                                // Setting the priority using Comparator into max heap
        Queue <Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); 
        pq.offer(13);
        pq.offer(12);
        pq.offer(10);
        pq.offer(20);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
