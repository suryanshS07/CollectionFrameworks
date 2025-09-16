import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> marks = new LinkedList<>();
        marks.offer(13);
        marks.offer(12);
        marks.offer(34);
        marks.offer(43);
        System.out.println(marks);
        System.out.println(marks.poll());
        System.out.println(marks.peek());
    }
}
