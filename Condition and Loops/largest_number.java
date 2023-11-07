import java.util.Scanner;

public class largest_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter value for a:");
        int a = in.nextInt();
        System.out.println("Enter value for b:");
        int b = in.nextInt();
        System.out.println("Enter value for c:");
        int c = in.nextInt();

        int max = a;
        if (b > max){
            max = b;
        }
        if (c > max){
            max = c;
        }
        System.out.println("The largest of the three numbers is:");
        System.out.print( max);


        /*Another way to write the same code
        1.
        int max = 0;
        if (a > b){
            max = a;
        } else {
            max = b;
        }
        if (c > max){
            max = c;
        }
         */

        //Second method to write the same thing using Math.max
        /*
        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
         */


    }
}
