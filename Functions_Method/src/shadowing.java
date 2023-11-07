public class shadowing {
     static int x = 90;
     //This wil be shadowed at line 12
    // static is object independent
    // x will be accessible inside the curly brackets above

    public static void main(String[] args) {
        System.out.println("Value of x before changing it: " + x );
        int x = 40;
        //The class variable at line 2 is shadowed by this
        //scope begins only when the value is initialized
        System.out.println("Value of x after changing it: " + x);
        fun();
    }

    //Shadowing in Java is practicing the use of two variables with the same name
    static void fun(){
        System.out.println(x);
    }
}
