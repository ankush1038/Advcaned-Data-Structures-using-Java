import java.util.Stack;

public class InfixToPostfixConverter {
    public static boolean isOperator(char ch){
        return (ch=='+' || ch=='-' || ch=='*' || ch=='/');
    }

    public static int getPrecedence(char op){
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }


    public static String infixToPostfix(String infix){
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for(int i=0;i<infix.length();i++) {
            char curr = infix.charAt(i);

            if (Character.isLetterOrDigit(curr)) {
                postfix.append(curr);
            } else if(curr =='('){
                stack.push(curr);
            } else if(curr == ')'){
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop();
            } else if(isOperator(curr)){
                while (!stack.isEmpty() && getPrecedence(stack.peek()) >= getPrecedence(curr)) {
                    postfix.append(stack.pop());
                }
                stack.push(curr);
            }
        }
        while(!stack.isEmpty()){
            postfix.append(stack.pop());
        }
        return postfix.toString();
    }

    public static void main(String[] args) {
        String infix = "5+6/7*6";
        String postfix = infixToPostfix(infix);
        System.out.println("Infix Expression : " + infix);
        System.out.println("Postfix Expression : " + postfix);
    }
}
