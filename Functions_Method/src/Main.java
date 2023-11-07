import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Q. Take input of two numbers and print the sum
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("Enter number 1:");
        num1 = in.nextInt();

        System.out.print("Enter number 2");
        num2 = in.nextInt();

        sum = num1 +num2;
        System.out.println("The sum = " + sum);

        //If we were asked to keep adding the sum n number of times it would not look good
        //Hence we need to use Functions and method so we can cluster a piece of code and use it multiple times


    }
}