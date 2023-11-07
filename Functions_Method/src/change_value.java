import java.util.Arrays;

public class change_value {
    public static void main(String[] args) {
        //create an array
        int[] arr = {1, 3, 2, 45, 6};
        change(arr);
        // The reference is passed by call by value because the value being passed refers to the object
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 99;
        // If you make a change to the object via this reference variable
        // same object will be changed as they are pointing towards the same object.
    }
}
