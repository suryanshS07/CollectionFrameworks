import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnpriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> number = new PriorityQueue<>(Comparator.reverseOrder());
        number.offer(21);
        number.offer(43);
        number.offer(54);
        number.offer(23);
        number.offer(34);
        number.offer(9);
        number.offer(43);
        System.out.println(number);

        System.out.println(number.poll());
        System.out.println(number);
        System.out.println(number.poll());
        System.out.println(number);






    }
}
