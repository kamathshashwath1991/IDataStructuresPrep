package linkedlist;

public class RemoveDuplicates {

     Node head = null;

    public void removeDuplicates(){

       Node p =head;
       Node q;

       while (p!=null && p.next!=null){
           if (p.data == p.next.data){
               q = p.next.next;

               if (q ==null){
                   p.next = null;
                   break;
               }

               p.next = q.next;
           }

           if (p.data!=p.next.data){
               p = p.next;
           }
       }

    }

    public void insert(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    public void Print(){
        Node last = head;

        if (head == null){
            System.out.println("list is empty");
        }

        while (last!=null){
            System.out.println("data" + last.data);
            last = last.next;
        }
    }

    public static void main(String[] args) {
        RemoveDuplicates rm= new RemoveDuplicates();
        rm.insert(1);
        rm.insert(1);
        rm.insert(1);
        rm.insert(2);
        rm.insert(2);
        rm.insert(3);
        rm.Print();

        rm.removeDuplicates();
        rm.Print();
    }
}
