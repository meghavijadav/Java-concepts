import java.util.HashSet;
import java.util.Iterator;

public class IterationOnHashSet {
    public static void main(String[] args) {
        HashSet<String> city = new HashSet<>();
        city.add("Delhi");
        city.add("Mumbai");
        city.add("Noida");
        city.add("Bengaluru");

        //Using Iterators
        System.out.println("Printing using Iterators");
        Iterator it = city.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //Using Enhanced For Loop
        System.out.println("Printing using Enhanced For Loop");
        for(String cities : city){
            System.out.println(cities);
        }
    }
}
