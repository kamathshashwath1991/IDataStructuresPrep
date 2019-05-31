public class CountNumberNode {

    int n=1;

    Node insert(Node root, int data){
        if (root == null){
            return  (new Node(data));
        }

        if (data< root.key){
            root.left = insert(root.left,data);
        }
        else{
            root.right = insert(root.right,data);
        }

        return root;
    }

    int countNodes(Node root){

        if (root == null){
            return 0;
        }

        if (root.left!= null){
            n++;
            n =countNodes(root.left);
        }

        if (root.right!=null){
            n++;
            n =countNodes(root.right);
        }

        return n;
    }

    public static void main(String[] args) {
        CountNumberNode cn = new CountNumberNode();
        Node root = null;

        root = cn.insert(root,3);
        cn.insert(root,4);
        cn.insert(root,2);
        cn.insert(root,5);
        cn.insert(root,1);

        System.out.println(cn.countNodes(root));
    }
}
