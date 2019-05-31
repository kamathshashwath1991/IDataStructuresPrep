public class MinElement {

    Node insert(Node root, int data){
        if (root == null){
            root = new Node(data);
        }

        if (data <= root.key){
             root.left = insert(root.left,data);
        }
        else {
            root.right = insert(root.right,data);
        }

        return root;
    }

    int getMinElement(Node root){

     Node current = root;

     while (current.left!= null){
         current = current.left;
     }

     return root.key;
    }

    public static void main(String args[]){
        MinElement min = new MinElement();
        Node root = null;

        root = min.insert(root, 4);
        min.insert(root, 2);
        min.insert(root, 1);
        min.insert(root, 3);
        min.insert(root, 6);
        min.insert(root, 5);

        System.out.println("Minimum value of BST is " + min.getMinElement(root));

    }
}
