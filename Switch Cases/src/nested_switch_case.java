import java.sql.SQLOutput;
import java.util.Scanner;

public class nested_switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String department = sc.next();

        switch (empID) {
            case 1 -> System.out.println("Meghavi Jadav");
            case 2 -> System.out.println("Vedanti Jadav");
            case 3 -> {
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }

        /*
        switch (empID){
            case 1:
                System.out.println("Meghavi Jadav");
                break;
            case 2:
                System.out.println("Vedanti Jadav");
                break;
            case 3:
                switch (department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department entered");
                }
                break;
            default:
                System.out.println("Enter correct EmpID");
        }
        */

    }

}
