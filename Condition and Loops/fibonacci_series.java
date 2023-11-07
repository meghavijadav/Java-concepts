import java.util.Scanner;

public class fibonacci_series  {
    public static void main(String[] args) {
        System.out.println("Enter the value of n:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int p = 0;
        int i = 1;
        int count = 2;

        while (count <=n ){
            int temp = i;
            i = i + p;
            p = temp;
            count++;
        }
        System.out.println(i);
    }
}
