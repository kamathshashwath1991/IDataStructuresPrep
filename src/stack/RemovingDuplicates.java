package stack;

import linkedlist.RemoveDuplicates;

import java.util.Stack;

public class RemovingDuplicates {

    public void remove(String s){
        Stack<Character> stack = new Stack();

        for (int i = 0; i< s.length(); i++){
            if (stack.isEmpty() || s.charAt(i)!=s.charAt(i-1)){
                stack.push(s.charAt(i));
            }
        }

        while (!stack.isEmpty()){
            System.out.println("Inside stack" + stack.pop());
        }
    }


    public static void main(String[] args) {
        String s =  "aaaaaabaabccccccc";

        RemovingDuplicates r = new RemovingDuplicates();
        r.remove(s);
    }
}
