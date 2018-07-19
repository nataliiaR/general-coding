import java.util.Stack;

public class ClusteredParenthesis {


    public boolean checkIfClusteredProperly(String parenthesis) {
        boolean clustered = true;
        Stack<Character> stack = new Stack<>();
        if (parenthesis.length() % 2 != 0){
            clustered = false;
        }
        else {
            for (int i = 0; i < parenthesis.length(); i++) {
                if (parenthesis.charAt(i) == '{' || parenthesis.charAt(i) == '[' || parenthesis.charAt(i) == '(') {
                    stack.push(parenthesis.charAt(i));
                }
                if (parenthesis.charAt(i) == '}' && stack.peek() == '{') {
                    stack.pop();

                } else if (parenthesis.charAt(i) == '}' && stack.peek() != '{') {
                    clustered = false;
                }

                if (parenthesis.charAt(i) == ']' && stack.peek() == '[') {
                    stack.pop();

                } else if (parenthesis.charAt(i) == ']' && stack.peek() != '[') {
                    clustered = false;
                }
                if (parenthesis.charAt(i) == ')' && stack.peek() == '(') {
                    stack.pop();

                } else if (parenthesis.charAt(i) == ')' && stack.peek() != '(') {
                    clustered = false;
                }
            }

        }
        return clustered;
    }
}