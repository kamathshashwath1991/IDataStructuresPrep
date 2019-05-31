import java.util.ArrayList;
import java.util.List;

public class KthElement {


    List<Integer> getElement(Node root, List<Integer> list){

        if (root == null){
            return null;
        }

        getElement(root.left,list);
        list.add(root.key);
        getElement(root.right,list);

        return list;
    }


    public static void main(String args[]){
        KthElement tree = new KthElement();

        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left = new Node(10);
        root.right = new Node(14);

        List<Integer> list = new ArrayList<>();
        tree.getElement(root,list);

        System.out.println("smallest kth element " + list.get(2));
    }


}
