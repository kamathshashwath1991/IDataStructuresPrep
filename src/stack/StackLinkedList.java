package stack;

public class StackLinkedList {

    stack.Node head;

    void push(int data){
        stack.Node newNode = new stack.Node(data);

        if (head == null){
            head = newNode;
            System.out.println("Head : " + newNode.data);
        }
        else {
            Node last = head;

            while (last.next!= null){
                last = last.next;
            }

            last.next = newNode;
            newNode.next = null;
            System.out.println("data " + newNode.data);
        }
    }

    void pop(){
        Node last = head;
        Node prev =  null;
        while (last.next.next!= null){
            last= last.next;
        }
        int x = last.next.data;
        prev = last.next;

        prev.next = null;

        System.out.println("Removed element : " + x);
    }




    public static void main(String[] args) {
        StackLinkedList s = new StackLinkedList();
        s.push(10);
        s.push(20);
        s.push(30);

        s.pop();

    }
}
