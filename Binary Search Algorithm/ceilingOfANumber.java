public class ceilingOfANumber {
    public static void main(String[] args) {
        //We have been given a sorted array
        int [] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println( ans);
    }

    static int ceiling(int[] arr, int target) {{
            int start = 0;
            int end = arr.length - 1;
            int mid = start + (end - start)/2;

                if(target > arr[mid]){
                    return arr[mid];
                } else if (target < arr[mid]) {
                    return arr[mid + 1 ];
                }else{

                }

            }
            return -1;
        }

    }


