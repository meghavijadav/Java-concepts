import java.util.Scanner;

public class alphabet_casecheck {
    public static void main(String[] args) {
        System.out.println("Enter to check here:");
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        System.out.println(ch);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }else {
            System.out.println("Uppercase");
        }

    }
}
