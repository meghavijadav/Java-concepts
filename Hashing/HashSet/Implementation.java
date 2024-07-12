import java.util.*;
public class Implementation {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);

        System.out.println("set:" + set);
        System.out.println("set size: " + set.size());
        System.out.println("is set empty?: " + set.isEmpty());


        if(set.contains(2)){
            System.out.println("Set contains 2");
        }

        set.remove(2);
        System.out.println("set after removing 2: "+set);

        if(set.contains(3)){
            System.out.println("Set contains 3");
        }

        set.clear();
        System.out.println("set after clearing: "+set);
        System.out.println("set size: " + set.size());
        System.out.println("is set empty? : "+set.isEmpty());
    }
}
