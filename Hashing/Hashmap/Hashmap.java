import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args) {
        //Create
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert- O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        System.out.println(hm);
        //size
        System.out.println(hm.size()); //3

        //Is Empty
        System.out.println(hm.isEmpty()); //false

        //Get- O(1)
        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Bhutan")); //null

        //ContainsKey- O(1)
        System.out.println(hm.containsKey("India")); //true
        System.out.println(hm.containsKey("Bhutan")); //false

        //Remove
        hm.remove("US");
        System.out.println(hm);

        //Clear
        hm.clear();
        System.out.println(hm);

    }
}
