package stack;

public class PranathesisChecker {

    static class stack{
        int top = -1;
        char items[] = new char[100];

        void push(char data){
            if (top >= 99){
                System.out.println("Stack overflow");
            }
            else {
                items[++top] = data;
            }
        }

        char pop(){
            if (isEmpty()){
                System.out.println("Stack is empty");
                return ' ';
            }
            else {
                char data = items[top--];
                return data;
            }
        }

        boolean isEmpty(){
            if (top==-1){
                System.out.println("Stack is empty");
                return false;
            }
            return true;
        }
    }

    static boolean isMatchingPair(char character1, char character2){
        if (character1 == '{' && character2 == '}'){
            return true;
        }
        else if (character1 == '(' && character2 == ')'){
            return true;
        }
        else if (character1 == '[' && character2 == ']'){
            return true;
        }
        return false;
    }

    static boolean areParanthesisBalanced(char exp[]){
        stack s = new stack();
        for (int i =0; i< exp.length;i++){

            if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[')
                s.push(exp[i]);

            if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']'){
                if (s.isEmpty()){
                    return false;
                }
                else if(!isMatchingPair(s.pop(),exp[i])){
                    return false;
                }
            }
        }
        if (s.isEmpty()){
            return false;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
