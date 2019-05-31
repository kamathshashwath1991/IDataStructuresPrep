package trees;

import java.util.LinkedList;
import java.util.Queue;

public class maxWidthOfTree {

    Node root;

    int getMax(Node root){
        Queue<Node> q = new LinkedList<>();
        ((LinkedList<Node>) q).add(root);
        ((LinkedList<Node>) q).add(null);

        int max = Integer.MIN_VALUE;
        int width = 0;
        while (!q.isEmpty()){
            Node temp = ((LinkedList<Node>) q).pop();



            if (temp == null){
                if (!q.isEmpty()){
                    if (width>max){
                        max = width;
                    }
                    width = 0;
                    ((LinkedList<Node>) q).add(null);

                }
            }
            else {
                if (temp.left!=null){
                    ((LinkedList<Node>) q).add(temp.left);
                    width ++;

                }
                if (temp.left!=null && temp.right!=null) {
                    ((LinkedList<Node>) q).add(temp.right);
                    width ++;

                }
            }



        }

        return max;
    }

    public static void main(String[] args) {
        maxWidthOfTree tree = new maxWidthOfTree();
        tree.root= new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println(tree.getMax(tree.root));
    }
}
