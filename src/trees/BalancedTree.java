package trees;

import java.util.Map;

public class BalancedTree {

    Node root;

    class height{
        int height = 0;
    }

    public int getHeight(Node node){
        if (node == null){
            return 0;
        }

        return 1+ Math.max(getHeight(node.left),getHeight(node.right));
    }

    public static void main(String[] args) {

        BalancedTree tree = new BalancedTree();
        tree.root= new Node(1);
        tree.root.left = new Node(2);;
        tree.root.left.left = new Node(4);
        tree.root.left.left.left = new Node(8);



        //.System.out.println(tree.checkBalance(tree.root));
    }
}
