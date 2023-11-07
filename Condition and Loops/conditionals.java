public class conditionals {
    public static void main(String[] args) {
        /*
            Syntax of if statements:
            if (boolean expression T or F){
                //body
            } else{
                //do this
            }
        */
        int salary = 28000;
        if (salary > 10000) {
            salary = salary + 2000;
            //multiple if else statements
        } else if(salary > 20000){
            salary += 3000;
        }
        else{
            salary += 1000;
        }
        System.out.println(salary);
    }
}
