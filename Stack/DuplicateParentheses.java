import java.util.Stack;

public class DuplicateParentheses {
    public static void main(String[] args) {
        String str = "((a+b))"; //true - duplicate exists
        String str1 = "(a-b)"; //false - no duplicate
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str1));
    }

    public static boolean isDuplicate(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            //closing
            if(ch == ')'){
                int count = 0;
                while (st.peek() != '('){
                    //over here we do not need to check if the stack is empty while checking closing
                    //because it will never be empty as it is a valid parentheses always
                    st.pop();
                    count++;
                }
                if(count < 1){
                    return true; //duplicate exists
                }else{
                    st.pop(); //opening pair
                }
            }else {
                //opening, operator, operand
                st.push(ch);
            }
        }
        return false;
    }
}
