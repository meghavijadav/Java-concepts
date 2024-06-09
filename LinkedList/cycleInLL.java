public class cycleInLL {
    public static class Node{
        //we created a class
        int data;
        Node next;

        public Node(int data){
            //here we created the object of that code
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //Method- add(), remove(), print(), search()
    public void addFirst(int data){
        //step1- create new node
        Node newNode = new Node(data);
        size++;
        //because irrespective of anything you will create a new node

        //base case - linked list is empty
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step2- new node's next = head
        newNode.next = head; //linked one node to another

        //step3 - head = newNode
        head = newNode;
    }

    public void addLast(int data){
        //step1- create new node
        Node newNode = new Node(data);
        size++;

        //base case
        if(head == null){
            head = tail = newNode;
            return;
        }

        //step2- tail.next will point to new node
        tail.next = newNode;

        //step3 - Make tail your new Node
        tail = newNode;


    }

    //method to print the data
    public void print(){
        //base case
        if(head == null){
            System.out.println("LinkedList is Empty");
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;//+1
            fast = fast.next.next; //+2
            if(slow == fast){
                return true; //cycle exists
            }
        }
        return false; //cycle doesn't exist
    }



    public static void main(String[] args) {
//        cycleInLL ll = new cycleInLL();
//
//        ll.addFirst(2);
//        ll.addFirst(1);
//        ll.addLast(3);
//        ll.addLast(4);
//        ll.addLast(5);
//        ll.print();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        System.out.println(isCycle());

    }
}
