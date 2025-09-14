import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world");
        Stack<Integer> stack = new Stack<>();
        System.out.println("Stack 1.durum=" + stack);
        System.out.println("Stack boş mu? " + stack.isEmpty());

        stack.push(15);
        stack.push(23);
        stack.push(45);

        System.out.println("Stack 2.durum=" + stack);
        System.out.println("Stack boş mu? " + stack.isEmpty());

        System.out.println("Stackin en üstteki elemanı= " + stack.peek());
        System.out.println("Çıkarılan eleman = " + stack.pop());
        System.out.println("Stack 3.durum=" + stack);



        }
}
