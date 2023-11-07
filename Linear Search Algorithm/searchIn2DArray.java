import java.util.Arrays;

public class searchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18,12,3,9},
                {78, 99, 34, 56},
                {18, 12}
        };
        //Here there is no need to mention type because by default it knows its type array when you write it down like this
        int target = 34;
        int[] ans = search(arr,target);
        //format of return value {row, col}
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col< arr[row].length; col++){
                if(arr[row][col] == target){
                    //why create new object? why not return {row,col}?
                    //Because the Array is not initialised
                    return new int[]{row,col};
                    //Because there was no need to mention the type here you need to initialise
                }
            }
        }
        return new int[]{-1, -1};
    }
}
