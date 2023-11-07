import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        System.out.println(Arrays.toString(search(arr, 8)));
    }
    //To search in the row provided between the col provided
    static int[] binarySearch(int[][] matrix, int row , int cStart, int cEnd, int target){
        while(cStart < cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            if(matrix[row][mid] < target){
                cStart = mid + 1;
            }else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length; //be cautious matrix might be empty

        if (rows == 1){
            return binarySearch(matrix, 0, 0, cols-1,target );
        }
        int rStart = 0;
        int rEnd = rows -1;
        int cMid = cols /2;
        //Run the loop till 2 rows are remaining

        while(rStart < (rEnd -1)){
            // While this is true it will be having more than two rows
            int mid = rStart + (rEnd - rStart)/2;
            if (matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] < target){
                rStart = mid;
            }else{
                rEnd = mid;
            }
        }

        // once this loop runs we will be left with two rows
        // Now we shall check whether the target is in any of the 2 rows
        if(matrix[rStart][cMid] == target){
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart + 1][cMid] == target){
            return new int[]{rStart +1 ,cMid};
        }


        // Search in first, second, third and fourth half so-and-so forth
        //Refer notes for diagram and better explanation
        //First Half
        if(target <= matrix[rStart][cMid - 1]){
            return binarySearch(matrix, rStart, 0,cMid-1,target);
        }
        //Second Half
        if(target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]){
            return binarySearch(matrix, rStart, cMid - 1,cols-1,target);
        }
        //Third Half
        if(target <= matrix[rStart + 1][cMid - 1]){
            return binarySearch(matrix, rStart + 1, 0,cMid-1,target);
        }
        //Fourth Half
        else{
            return binarySearch(matrix, rStart + 1, cMid +1,cols-1,target);
        }

    }
}
