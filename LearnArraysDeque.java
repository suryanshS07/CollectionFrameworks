import java.util.ArrayDeque;

public class LearnArraysDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(323);
        adq.offerFirst(342);
        adq.offerLast(39);
        adq.offer(343);
        adq.offer(39);
        adq.offer(308);
        adq.offer(307);
        adq.offer(342);
        adq.offerLast(39);
        System.out.println(adq);
        System.out.println(adq.peekFirst());

        System.out.println(adq.peekLast());
        System.out.println("poll" + adq.poll());


    }
}
