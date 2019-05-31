package stack;

public class TwoStacksArrays {

    int size;
    int top1,top2;
    int arr[];

    TwoStacksArrays(int n){
        arr = new int[n];
        size = n;
        top1 = -1;
        top2= size;
    }

    void push1(int x){
        if (top1 < top2-1){
            arr[++top1] = x;
        }
        else {
            System.out.println("Stack overflow");
        }
    }

    void push2(int x){
        if (top1 < top2 -1){
            arr[--top2] = x;
        }
        else {
            System.out.println("Stack overflow");
        }
    }

    int pop1(){
        if (top1 >= 0){
            int x = arr[top1--];
            return x;
        }
        else {
            System.out.println("Stack underflow");
        }
        return 0;
    }

    int pop2(){
        if (top2 < size ){
            int x = arr[top2++];
            return x;
        }
        else {
            System.out.println("Stack underflow");
        }
        return 0;
    }
}
