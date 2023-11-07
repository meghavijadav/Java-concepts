import java.util.Arrays;
import java.util.Arrays;
public class maxIn2DArray {
        public static void main(String[] args) {
            int[][] arr = {
                    {23, 4, 1},
                    {18, 12, 3, 9},
                    {78, 99, 34, 56},
                    {18, 12}
            };
            //Here there is no need to mention type because by default it knows its type array when you write it down like this
            int target = 34;
            int[] ans = max(arr);
            //format of return value {row, col}
            System.out.println(Arrays.toString(ans));
            System.out.println(max(arr));
            System.out.println("The range is:" + Integer.MIN_VALUE);
            //This will give you the range
        }

    static int[] max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return new int[]{max};
    }
}

