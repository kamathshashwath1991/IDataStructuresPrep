package trees;

public class leftView {
    Node root;
    static int max_level = 0;


    void getLeftView(Node root, int level){
        if (root == null){
            return;
        }

        if (max_level < level){
            System.out.println(root.data);
            max_level = level;
        }

        getLeftView(root.left,level+1);
        getLeftView(root.right,level+1);
    }


    public static void main(String[] args) {
        leftView tree = new leftView();
        tree.root= new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        tree.getLeftView(tree.root,1);
    }
}
