public class Scope {
    public static void main(String[] args) {
        // Scope in very simple language means that you can access the variable only in this function
        int a = 10;
        int b = 20;
        String name = "Vedanti";
        //System.out.println(c);
        //You can not use it outside the function.
        //This will give you error because 'marks' is not in this function
        {
           //Block code
           a = 78;
            System.out.println("'a' inside the block: " + a);
           // if you type int a then it will give you an error because 'a' is already initialized
            int c = 99;
            name = "Meghavi";
            System.out.println("'name' inside the block: " + name);
        }
        System.out.println("'a' outside the block: " + a);
        System.out.println("'name' outside the block: " + name);
        //System.out.println(c);
        //The above will give error as a variable initialized in the block is ony limited to it.

        //Scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
        //System.out.println(i);
        // This will give an error as it can not be accessed outside for loop
    }

    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
        //If you make changes here it will be valid in this function scope only
    }
}
