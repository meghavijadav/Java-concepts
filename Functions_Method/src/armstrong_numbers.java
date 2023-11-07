import java.util.Scanner;

public class armstrong_numbers {
    public static void main(String[] args) {
        //Code for printing all three digit Armstrong Numbers

        Scanner in = new Scanner(System.in);

        //int n = in.nextInt();

        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)){
                System.out.println(i + " ");
            }
        }
        //System.out.println(isArmstrong(n));
    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while (n > 0){
            int rem = n % 10;
            n = n /10;
            sum = sum + rem*rem*rem;
        }
        /*
        if (sum == original){
            return true;
        }
        return false;
         */
        //Instead of this we can use:
        return sum == original;
    }
}
