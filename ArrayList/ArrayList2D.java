import java.util.ArrayList;

public class ArrayList2D {
    public static void main(String[] args) {
//        ArrayList<ArrayList <Integer>> mainList = new ArrayList<>(); - This is also Correct
        ArrayList<ArrayList> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int i = 0; i <= 5; i++) {
            list1.add(i);
            list2.add(i*2);
            list3.add(i*3);
        }
        System.out.println("List 1: "+ list1);
        System.out.println("List 2: "+ list2);
        System.out.println("List 3: "+ list3);

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println("Main List: " + mainList);
    }
}
