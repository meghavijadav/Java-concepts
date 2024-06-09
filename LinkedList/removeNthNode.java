public class removeNthNode {
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


    public int iterativeSearch(int key){
        removeNthNode.Node temp = head;
        int i = 0;
        while (temp != null){
            if(temp.data == key){ //key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        //key not found
        return -1;
    }


    public void deleteNthFromEnd(int n){
        //calculate size
        int sizeLL = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sizeLL++;
        }

        if(n == sizeLL){
            //Remove First
            head = head.next;
            return;
        }

//        sizeLL - n
        int i = 1;
        int iToFind = sizeLL - n;
        Node prev = head;
        while (i < iToFind){
            prev = prev.next;
            i++;
        }
        //Now we reached the node just prev to Nth Node
        prev.next = prev.next.next;
        return;
        //we skipped the Nth node and now prev points towards next
    }

    public static void main(String[] args) {
        removeNthNode ll = new removeNthNode();
//        ll.head = new Node(1);
//        ll.head.next = new Node(2);
        //Instead of making these on our own we will make methods

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.deleteNthFromEnd(3);
        ll.print();

    }
}
