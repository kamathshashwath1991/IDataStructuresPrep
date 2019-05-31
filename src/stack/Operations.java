package stack;

public class Operations {

    Node head;

    void insert(int data){
        Node new_Node = new Node(data);

        if (head == null){
            head = new_Node;
            System.out.println(" Head: " + head.data);
        }
        else{
            Node last = head;
            while (last.next!=null){
                last = last.next;
            }

            last.next = new_Node;
            new_Node.next = null;

            System.out.println("Data inserted: " + new_Node.data);
        }
    }

    void remove(){
        Node last = head;
        Node prev = null;
        while (last.next!=null){
            prev = last;
            last = last.next;
        }
        prev.next = null;
        System.out.println("Removed Data " + last.data);
    }

    void headOfStack(){
        Node last = head;
        while (last.next!=null){
            last = last.next;
        }

        System.out.println("Head of stack" + last.data);
    }

    boolean find(int data){
        Node search = head;
        while (search.next!= null){
            if (search.data == data){
                System.out.println(search.data + "found the element");
                return true;
            }
            else {
                System.out.println("did not find the element");
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Operations o = new Operations();
        o.insert(10);
        o.insert(20);
        o.insert(30);
        o.insert(40);

        o.remove();
        o.headOfStack();
        o.find(10);
    }
}
