package bst;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PairSum {

    class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }


    void inorder(Node root, ArrayList<Integer> al){
        if (root!=null){
            inorder(root.left,al);
            al.add(root.data);
            inorder(root.right,al);
        }
    }

    void checkforPair(Node root,int target){
        ArrayList<Integer> al = new ArrayList<>();

        inorder(root,al);

        if (al.isEmpty()){
            System.out.println("Yet to fill up");
        }

        int start = 0, end = al.size()-1;

        if (al.get(start) + al.get(end) == target){
            System.out.println("True");
        }

        else if (al.get(start) + al.get(end) > target){
            end --;
        }
        else {
            start++;
        }
    }

    //checkforPair(Node root,int target)

    public static void main(String[] args) {
        PairSum tree = new PairSum();

        Node root = null;
        root =tree.new Node(15);
        root.left = tree.new Node(10);
        root.right = tree.new Node(20);
        root.left.left = tree.new Node(8);
        root.left.right = tree.new Node(12);
        root.right.left = tree.new Node(26);
        root.right.right = tree.new Node(25);

        tree.checkforPair(root,33);
    }
}
