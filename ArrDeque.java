import java.util.ArrayDeque;

public class ArrDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(50);
        adq.offerFirst(60);
        adq.offerLast(70);
        adq.offer(45);
        adq.offer(80);
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println(adq);
        System.out.println(adq.pollFirst());
        System.out.println(adq);
        System.err.println(adq.pollLast());
        System.out.println(adq);
        
    }
}
