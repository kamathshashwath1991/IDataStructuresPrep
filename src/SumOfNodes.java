public class SumOfNodes {

    Node insert(Node root,int data){
        if (root == null){
            return (new Node(data));
        }

        if (data<= root.key){
            root.left= insert(root.left,data);
        }
        else {
            root.right= insert(root.right,data);
        }

        return root;
    }

    int Sum(Node node){
        if(node == null) return 0;
        return node.key+Sum(node.left)+ Sum(node.right);

    }

    void getCountofLeafNodes(Node root,int value){

       getCountofLeafNodes(root.left,value);
       if (root.left==null && root.right ==null){
            value++;
       }
       getCountofLeafNodes(root.right,value);
    }

    public static void main(String[] args) {
        SumOfNodes cn = new SumOfNodes();

        Node root = null;

        root = cn.insert(root,3);
        cn.insert(root,4);
        cn.insert(root,2);
        cn.insert(root,5);
        cn.insert(root,1);

        System.out.println(cn.Sum(root));
    }
}
