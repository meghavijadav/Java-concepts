public class removeCycle {
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

    public static void removeCycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }

        // find meeting point
        slow = head; //initialize slow to head to find the meeting point
        Node prev = null; //last node
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //remove cycle -> lastNode.next =  null
        prev.next = null;
    }


    public static void main(String[] args) {

        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());


    }
}
