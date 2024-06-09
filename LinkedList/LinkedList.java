public class LinkedList {

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

    public void add(int index, int data){
        if(index == 0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < index - 1){
            temp = temp.next;
            i++;
        }

        //i = index -1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        //if my linked-list is empty
        if(size == 0){
            System.out.println("LinkedList is Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.println("LinkedList is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail =null;
            size = 0;
            return val;
        }
        //Traverse to reach previous node, prev: i  = size - 2
        Node prev = head;
        for (int i = 0; i < size -2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int iterativeSearch(int key){
        LinkedList.Node temp = head;
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

    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }
        int index = helper(head.next, key);
        if(index == -1){
            return -1;
        }
        return index + 1;
    }

    public int recursiveSearch(int key){
        return helper(head, key);
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head ;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
//        ll.head = new Node(1);
//        ll.head.next = new Node(2);
        //Instead of making these on our own we will make methods
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addLast(5);
        ll.print();
        ll.add(2, 3);
        ll.print();

        System.out.println("----------------");
        System.out.println("Size of the LinkedList: "+ ll.size);
        ll.removeFirst();
        System.out.println("After Using Remove First: ");
        ll.print();
        System.out.println("Size of the LinkedList after removing first: "+ ll.size);
        ll.removeLast();
        System.out.println("After Using Remove Last: ");
        ll.print();
        System.out.println("Size of the LinkedList after removing last: "+ ll.size);

        System.out.println("----------------");

        System.out.print("We found '3' in iterative search at index: ");
        System.out.println(ll.iterativeSearch(3));

        System.out.print("We found '10' in iterative search at index: ");
        System.out.println(ll.iterativeSearch(10));

        System.out.print("We found '3' in recursive search at index: ");
        System.out.println(ll.recursiveSearch(3));

        System.out.print("We found '10' in recursive search at index: ");
        System.out.println(ll.recursiveSearch(10));

    }
}
