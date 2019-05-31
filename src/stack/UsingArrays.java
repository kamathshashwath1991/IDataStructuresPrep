package stack;

import java.util.Map;

public class UsingArrays {

    static int MAX = 1000;
    int top = 0;
    int a[] = new int[MAX];

    UsingArrays(){
        top =-1;
    }

    boolean empty(){
        top = -1;
        return false;
    }

    boolean push(int x){
        if (top >= MAX-1){
            System.out.println("Stack overflow");
            return false;
        }
        else {
            a[++top] = x;
            System.out.println(" elemtn pushed");
            return true;
        }
    }

    int top(){
        if (top < 0){
            System.out.println("Stack underflow");
            return 0;
        }
        else {
            int x = a[top--];
            return x;
        }
    }

    public static void main(String[] args) {
        UsingArrays u = new UsingArrays();

        u.push(10);
        u.push(20);
        u.push(30);

        System.out.println(u.top());
    }
}
