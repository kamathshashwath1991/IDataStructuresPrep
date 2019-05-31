
public class CheckBST {

    Node root, prev;

    boolean isBST(){
        prev = null;
        return isBST(root);
    }

    boolean isBST(Node root){
        if (root != null) {

            if (!isBST(root.left)) {
                return false;
            }
            if (prev != null && root.key <= prev.key) {
                return false;
            }
            prev = root;
            return isBST(root.right);
        }

        return true;
    }

    public static void main(String args[]){

    }


}
