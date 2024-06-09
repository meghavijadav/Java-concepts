public class QuickSort {
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei ){
        //last element we will take as pivot element
        //pidx - pivot index
        if(si >= ei){
            return;
        }

        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx -1); //left part of the pivot
        quickSort(arr, pIdx + 1, ei); //left part of the pivot
    }

    private static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si -1; // The role of this is to make space for elements smaller than the pivot
        for (int j = si; j < ei; j++) {
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i]; //it will be wrong to write pivot = arr[i] because pivot is a variable
        arr[i] = temp;
        return ei;
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 8, 2, 5};
        quickSort(arr, 0, arr.length -1 );
        printArr(arr);
    }
}
