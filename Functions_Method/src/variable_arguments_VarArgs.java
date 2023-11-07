import java.util.Arrays;

public class variable_arguments_VarArgs {

    public static void main(String[] args) {
        fun(); //Empty Array
        fun(2,3,4,5,56,87,23,45,65);
        //It will print all this and internally store it in an array
        //Variable length Arguments is when you don't know how many inputs there are

        multiple(2,3,"Meghavi","Vedanti");
    }
    static void multiple(int a, int b,String...v){
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}

