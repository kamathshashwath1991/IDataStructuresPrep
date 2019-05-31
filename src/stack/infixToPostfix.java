package stack;

import java.util.Calendar;
import java.util.Stack;

public class infixToPostfix {

    public static int Prec(Character c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public  static String check(String exp){
        Stack<Character> stack = new Stack<>();
        String result = new String(" ");

        for (int i= 0; i<exp.length();i++){
            char c= exp.charAt(i);

            if (Character.isLetterOrDigit(c)){
                result += c;
            }
            else if (c == '('){
                stack.push(c);
            }
            else if (c == ')'){
                while (!stack.isEmpty() && stack.peek()!='('){
                    result+=stack.pop();
                }
                if (!stack.isEmpty() && stack.peek()!='('){
                    return "Invalid";
                }
                else {
                    stack.pop();
                }
            }
            else {
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())){
                    result += c;
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()){
            result += stack.pop();
        }

        return result;
    }


    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(check(exp));
    }
}
