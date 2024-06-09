import java.util.LinkedList;
public class MergeSortOnLL {
    public static class Node {
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

    private Node merge(Node head1, Node head2) {
        Node mergedLinkedList = new Node(-1);
        Node temp = mergedLinkedList;

        while (head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1.next;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2.next;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null){
            temp.next = head1.next;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null){
            temp.next = head2.next;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLinkedList.next;
    }

    private Node getMid() {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public Node mergeSort(Node head) {
        //base case
        if(head == null || head.next == null){
            //should be or to represent empty or a LL with a single node
            return head;
        }

        //find mid
        Node mid = getMid();

        //left and right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight =mergeSort(rightHead);

        //merge
        return merge(newLeft,newRight);
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        System.out.println(ll);

    }
}