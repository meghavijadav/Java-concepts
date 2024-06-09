public class palindrome {
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

    //slow-fast approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow; //slow is MidNode
    }

    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //step1 - find mid
        Node midNode = findMid(head);

        //step2- reverse second half
        Node prev = null;
        Node curr =midNode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        //right half head
        Node right = prev;

        //left half head
        Node left = head;
        //step3 -check left and right half
        while (right != null){
            if(right.data != left.data){
                return false;
            }
                right = right .next;
                left = left.next;
        }
        return true;
    }
    public static void main(String[] args) {
        palindrome ll = new palindrome();
//        ll.head = new Node(1);
//        ll.head.next = new Node(2);
        //Instead of making these on our own we will make methods

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();

        System.out.println(ll.checkPalindrome());

    }
}
