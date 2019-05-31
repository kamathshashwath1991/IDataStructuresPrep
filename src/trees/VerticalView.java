package trees;

import java.util.*;

public class VerticalView {

    Node root;

    static void getTopView(Node node){

        class Node_obj {
            Node root;
            int hd;

            Node_obj(Node node, int hd){
                this.root= node;
                this.hd = hd;
            }
        }

        Queue<Node_obj> q = new LinkedList<Node_obj>();
        Map<Integer,Node> map = new HashMap<>();

        if (node == null){
            return;
        }
        else {
            ((LinkedList<Node_obj>) q).add(new Node_obj(node,0));
        }

        System.out.println("Top view of the tree is");

        while (!q.isEmpty()) {
            Node_obj temp = ((LinkedList<Node_obj>) q).pop();

            if (!map.containsKey(temp.hd)) {
                map.put(temp.hd, temp.root);
            }

            if (temp.root.left != null) {
                ((LinkedList<Node_obj>) q).add(new Node_obj(temp.root.left, temp.hd - 1));
            }


            if (temp.root.right != null) {
                ((LinkedList<Node_obj>) q).add(new Node_obj(temp.root.right, temp.hd + 1));
            }
        }

        for (Map.Entry<Integer,Node> entry: map.entrySet()){
            System.out.println(entry.getValue().data);
        }

    }

    public static void main(String[] args) {
        VerticalView tree = new VerticalView();
        tree.root= new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        getTopView(tree.root);
    }
}
