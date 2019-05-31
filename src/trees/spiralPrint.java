package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class spiralPrint {
    Node root;

    void spiral(Node root){
        Stack<Node> s1= new Stack<>();
        Stack<Node> s2 = new Stack<>();

        s1.push(root);

        while (!s1.isEmpty() || !s2.isEmpty()){
            while (!s1.isEmpty()){
                Node temp = s1.peek();
                s1.pop();
                System.out.println(temp.data + " ");

                if (temp.right!= null){
                    s2.push(temp.right);
                }
                if (temp.left!=null){
                    s2.push(temp.left);
                }
            }

            while (!s2.isEmpty()){
                Node temp = s2.peek();
                s2.pop();
                System.out.println(temp.data + " ");

                if (temp.left!=null){
                    s1.push(temp.left);
                }
                if (temp.right!= null){
                    s1.push(temp.right);
                }
            }
        }

    }

    public static void main(String[] args) {
        spiralPrint tree = new spiralPrint();
        tree.root= new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        tree.spiral(tree.root);

    }
}
