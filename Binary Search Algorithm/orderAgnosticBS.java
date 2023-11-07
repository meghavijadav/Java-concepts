public class orderAgnosticBS {
    public static void main(String[] args) {
        //  This code works for both ascending and descending order
        //int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int [] arr = {99,80,76,67,54,43,33,22,18,10,8,-10};
        int target = 22;
        int ans = orderAgnosticBS(arr, target);
        System.out.println( ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //To find whether the given Array is sorted in Ascending or Descending Order
        boolean isAsc = arr[start] < arr[end];
        /*
        => to elaborate

        if(arr[start] < arr[end]){
            isAsc = true;
        }else{
            isAsc = false;
        }
         */
        while (start <= end) {
            //find the middle element
            //int mid = (start + end)/2;
            //now the problem is that int has a fixed size hence it may happen that 'start+end' may exceed the range of java
            //so the better way to do this is
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            //If the array is ascending, this block of code will be executed
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                //If the array is descending, this block of code will be executed
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
