public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a , b);
        System.out.println(a + " " + b);
        String name = "Meghavi Jadav";
        changeName(name);
        System.out.println(name);

    }
    static void changeName(String name){

        name = "Vedanti Jadav"; // creating a new object
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        // This code will not swap the numbers nor will change the name
        /*
        Let us understand why this is happening

         */
    }
}
