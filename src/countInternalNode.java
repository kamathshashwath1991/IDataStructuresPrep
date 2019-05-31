public class countInternalNode {

    Node insert(Node root,int data){
        if (root == null){
            return new Node(data);
        }

        if (data < root.key){
            root.left = insert(root.left,data);
        }
        else {
            root.right = insert(root.right,data);
        }

        return root;
    }

    void countInternal(Node root){
        if (root == null){
            return;
        }
        if (root.left!= null){
            countInternal(root.left);
            System.out.print(root.left.key);
        }

        if (root.right!= null){
            countInternal(root.right);
            System.out.print(root.right.key);
        }

    }

    public static void main(String[] args) {
        countInternalNode cn = new countInternalNode();
        Node root = null;

        root = cn.insert(root,3);
        cn.insert(root,4);
        cn.insert(root,2);
        cn.insert(root,5);
        cn.insert(root,1);

        cn.countInternal(root);
        //System.out.print("Value : " + );

    }
}
