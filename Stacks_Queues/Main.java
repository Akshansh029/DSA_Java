
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // Queue que = 
        // Insertion
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Removing
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
