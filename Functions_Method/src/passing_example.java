public class passing_example {
    public static void main(String[] args) {
        String name = "Meghavi Jadav";
        greet(name);
    }
    private static void greet(String naam){
        System.out.println(naam);
        //(String name) and greet(name) in this the name not necessarily have to be the same thing
        //If you replace 'name' with 'naam' it will still work
        /*
        Internally what is happening is-
        -  this method is called Meghavi Jadav that is passes above will
            be replaced by 'naam' doesn't matter what you name the string
         */

    }

}
