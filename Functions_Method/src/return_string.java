import java.util.Scanner;

public class return_string {
    public static void main(String[] args) {
        //String message = greet();
        //System.out.println(message);

        //You can take the name via input as well
        //Scanner in = new Scanner(System.in);
        //System.out.print("Enter your name:");
        //String name = in.next();

        String personalised = myGreet("Meghavi Jadav");
        System.out.println(personalised);
    }

    private static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static String greet(){
        String greeting = "How are you?";
        return greeting;
    }
}
