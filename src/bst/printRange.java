package bst;

public class printRange {

    class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    void print(Node root, int low, int high){

        if (root == null){
            return;
        }

//        if (root.data >= low && root.data <=high){
//            System.out.println(root.data);
//        }
        if (root.data > low)
            print(root.left,low,high);
        if (root.data >= low && root.data <= high)
            System.out.println("touching in values" + root.data);
        if (root.data < high)
            print(root.right,low, high);

    }

    public static void main(String[] args) {

        printRange tree = new printRange();

        Node root = null;
        root =tree.new Node(20);
        root.left = tree.new Node(12);
        root.right = tree.new Node(22);
        root.left.left = tree.new Node(9);
        root.left.right = tree.new Node(13);
        root.right.left = tree.new Node(21);
        root.right.right = tree.new Node(25);

        tree.print(root,13,25);

    }
}
