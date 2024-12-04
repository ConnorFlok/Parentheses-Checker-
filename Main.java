import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        System.out.println("Pushing items onto the stack...");
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Popping items from the stack...");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
       
    }
}
