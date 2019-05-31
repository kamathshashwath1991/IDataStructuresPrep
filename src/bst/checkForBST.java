package bst;

public class checkForBST {

    class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data = data;
            left= right= null;
        }
    }

    boolean check(Node root){
        if (root == null){
            return false;
        }
        
        if (root.left.data < root.data){
            check(root.left);
        }
        else if (root.right.data > root.data){
            check(root.right);
        }
        else {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        checkForBST tree = new checkForBST();

        Node root = null;

        root =tree.new Node(15);
        root.left = tree.new Node(10);
        root.right = tree.new Node(20);
        root.left.left = tree.new Node(8);
        root.left.right = tree.new Node(12);
        root.right.left = tree.new Node(26);
        root.right.right = tree.new Node(25);

        System.out.println(tree.check(root));
    }
}
