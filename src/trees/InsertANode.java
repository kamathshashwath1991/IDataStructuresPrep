package trees;

public class InsertANode{

    class Node{
        int data;
        Node left,right;

        public Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    static Node searchNode(Node root,int data){
        if (root == null || root.data == data){
            return root;
        }

        if (root.data > data){
            searchNode(root.left,data);
        }

        return searchNode(root.right,data);
    }


    public static void main(String[] args) {

    }
}
