import java.util.Scanner;

public class sum_using_functions {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);

       /* int ans = sum3(20,30);
        System.out.println(ans);

        */
    }

    //Pass the value of numbers when you are calling the method in main()

    /*static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }

     */

    //Return the value
    static int sum() {
        int num1, num2, sum;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number 1:");
        num1 = in.nextInt();

        System.out.print("Enter number 2:");
        num2 = in.nextInt();

        sum = num1 + num2;
        return sum;
        //End of function
        // if the return statement is hit the function is over or it ends
    }

}
    /*
    Access modifier (we'll look in OOP)

    return_type name (arguments){
        //body
        return statement:
     }
     */


