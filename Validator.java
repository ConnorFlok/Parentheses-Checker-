import java.util.Stack;

public class Validator {

    public boolean check(String java) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < java.length(); i++) {
            char current = java.charAt(i);

            if (current == '{' || current == '[' || current == '(') {
                stack.push(current);
            } else if (current == '}' || current == ']' || current == ')') {
                if (stack.isEmpty()) {
                    return false; 
                }
                char top = stack.pop();
                if (!isMatchingPair(top, current)) {
                    return false; 
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '{' && close == '}') ||
               (open == '[' && close == ']') ||
               (open == '(' && close == ')');
    }
}
