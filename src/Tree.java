public class Tree{



    Node root;

    Tree(){
        root = null;
    }

    void insert(int key){
        root = insertKey(root,key);
    }

    Node insertKey(Node root, int key){

        if(root == null){
            root = new Node(1);
            return root;
        }

        if (root.key > key){
            root.left = insertKey(root.left,key);
        }
        else if (root.key < key){
            root.right = insertKey(root.right,key);
        }

        return root;
    }

    public static void main(String args[]){
        Tree t = new Tree();

        t.insert(1);
        t.insert(2);
        t.insert(3);

    }

}
