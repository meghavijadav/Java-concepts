public class Permutation {
    public static void findPermutation(String str, String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        //recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            //"abcde" => "ab"+"de" = "abde" -> if i want to remove 'c' from the string
            String s = str.substring(0, i) + str.substring(i+ 1); //New String
            findPermutation(s, ans+curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");
    }
}
