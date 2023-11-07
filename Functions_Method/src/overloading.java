import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class overloading {
    public static void main(String[] args) {
        //When you have two or more functions of the same name
        fun(67);
        fun("Meghavi Jadav");
        //Call any one to check how to code understands which function is being

        int ans1 = sum(1,2);
        System.out.println(ans1);

        int ans2 = sum(1,2, 3);
        System.out.println(ans2);

        demo(4,5,67,84,00,23);
        //You can put string here as well instead of numbers
        // But if you put demo(); which is null value.
        // Then this is called ambiguity
    }
    static int sum(int x , int y){
        return x + y;
    }

    static int sum(int x , int y, int z){
        return x + y + z;
    }
    static void fun(int a){
        System.out.println("First one");
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println("Second one");
        System.out.println(name);
    }
    static void fun(int n, String name){

    }

    // VarArgs in overloading
    static void demo(int...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String...v){
        System.out.println(Arrays.toString(v));
    }

}
