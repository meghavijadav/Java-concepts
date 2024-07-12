import java.util.Arrays;

public class MinAbsoluteDifferencePair {
    public static void main(String[] args) {
        int[] A = {1, 4, 7, 8};
        int[] B = {2, 3, 5, 6};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;
        for (int i = 0; i < A.length; i++) {
            minDiff += Math.abs(A[i] - B[i]);
        }
        System.out.println("Minimum Absolute Difference of Pairs = " + minDiff);
    }
}
