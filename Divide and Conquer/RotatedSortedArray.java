public class RotatedSortedArray {
    public static int search(int arr[],int tar, int si, int ei){
        if(si > ei){
            return -1;
        }

        int mid = si +(ei-si)/2;

        //considering mid = target
        if(arr[mid] == tar){
            return mid;
        }

        //When mid lies on Line1 and else when on Line2
        if(arr[si] <= arr[mid]){
            //searching on the left : case a
            if(arr[si] <= tar  && tar <= arr[mid]){
                return search(arr, tar, si, mid -1 );
            }else{
                //search on the right : case b
                return search(arr, tar, mid+ 1, ei);
            }

        }else{
            if(arr[mid] <= tar && tar <= arr[ei]){
                //search on the right : case c
                return search(arr, tar, mid+ 1, ei);
            }else{
                //search on the left : case d
                return search(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target =0;
        int tarIdx = search(arr, target, 0, arr.length -1);
        System.out.println(tarIdx);
    }
}
