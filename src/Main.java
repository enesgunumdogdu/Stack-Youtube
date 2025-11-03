import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world");
        Stack<Integer> stack = new Stack<>();
        System.out.println("Stack state 1: " + stack);
        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.push(15);
        stack.push(23);
        stack.push(45);

        System.out.println("Stack state 2: " + stack);
        System.out.println("Is stack empty? " + stack.isEmpty());

        System.out.println("Top element of stack: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack state 3: " + stack);
    }
}
