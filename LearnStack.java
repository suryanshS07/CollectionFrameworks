import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        //LIFO("last in First out")
        animals.push("Lion");
        animals.push("Horse");
        animals.push("Zebra");
        animals.push("cat");
        System.out.println(animals.peek());
        animals.peek();
        animals.pop();
        animals.peek();
    }
}
