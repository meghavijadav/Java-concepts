public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void print(){
        Node temp = head;
//        System.out.print("null");
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    //remove
    public int removeFirst(){
        if(head == null){
            System.out.println("Doubly LinkedList is Empty");
            return Integer.MIN_VALUE; //returned -infinity
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null; // this line will give error for single node
        size--;
        return val;
    }

    public int removeLast() {
        if (tail == null) {
            System.out.println("Doubly LinkedList is Empty");
            return Integer.MIN_VALUE; // returned -infinity
        }
        if (size == 1) {
            int val = tail.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }


    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.print();
        dll.addFirst(3);
        dll.print();
        dll.addFirst(2);
        dll.print();
        dll.addFirst(1);
        dll.print();
        dll.addLast(4);
        dll.print();
        dll.addLast(5);
        dll.print();

        dll.reverse();
        dll.print();

//        System.out.println("----------------");
//        System.out.println("Size of the LinkedList: "+ dll.size);
//        dll.removeFirst();
//        System.out.println("After Using Remove First: ");
//        dll.print();
//        System.out.println("Size of the LinkedList after removing first: "+ dll.size);
//        dll.removeLast();
//        System.out.println("After Using Remove Last: ");
//        dll.print();
//        System.out.println("Size of the LinkedList after removing last: "+ dll.size);
//
//        System.out.println("----------------");

    }
}
