import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        System.out.println("Enter the value of n here for for loop:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        /*
        Syntax for loops

        for (initialisation; condition; increment/decrement){
        //body
        }
         */


        // to create a default for iteration loop type fori

       /* for (int i = 0; i < ; i++) {
            System.out.println("Hello World");
        }
        */

        // Q. Print numbers from 1 to n
        for (int num = 1; num <=n; num += 1 ){
            System.out.println(num);
        }

        /*
        Syntax for while loop

        while (condition){
        //body
        }
         */

        System.out.println("Enter the value of n here for while loop:");
        Scanner in1 = new Scanner(System.in);
        int k = in1.nextInt();
        int num = 1;
        while (num <= k){
            System.out.println(num);
            num += 2;
        }

         /*
        Syntax for do while loop

        do{
        //body
        } while (condition);
         */

        System.out.println("Enter the value of n here for do while loop:");
        Scanner in2 = new Scanner(System.in);
        int m = in2.nextInt();
        int num1 = 1;

        do {
            System.out.println(num1);
            num1++;
        } while(num1 <= m);

    }
}
