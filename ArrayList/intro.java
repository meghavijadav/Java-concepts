import java.util.ArrayList;
public class intro {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //Add Operation - O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("-----add---- ");
        System.out.println("List after adding elements:" + list);

        list.add(1,9); //O(n)
        System.out.println("Adding 9 to index 1: " + list);

        //Get Operation - O(1)
        int ele = list.get(2); //enter index
        System.out.println("-----get---- ");
        System.out.println("Element at index 2 is: " + ele);

        //Delete Operation - O(n)
        list.remove(2);
        System.out.println("-----remove---- ");
        System.out.println("List after removing the number on index 2: " + list);

        //Set element at index Operation - O(n)
        list.set(2,  10);
        System.out.println("-----set---- ");
        System.out.println("setting the number on index 2 to a new value" + list);

        //contains element operation - O(n)
        System.out.println("-----contains---- ");
        System.out.println( "Does the list contain 1? ans- "+ list.contains(1));
        System.out.println( "Does the list contain 11? ans- "+ list.contains(11));

    }
}
