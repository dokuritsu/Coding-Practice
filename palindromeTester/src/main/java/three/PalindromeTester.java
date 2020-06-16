package three;

import java.util.Stack;

/**
 * Hello world!
 */
public final class PalindromeTester {
    private PalindromeTester() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        String palindrome = null;
        Boolean result = isStringPalindrome(palindrome);
        System.out.println(result);
    }

    public static boolean isStringPalindrome(String str){
        Stack<Character> stack = new Stack<Character>();
        String reverse = "";

        if(str == null || str.length() == 0){
            return true;
        } else {
            for (int i = 0; i < str.length(); i++) {
                stack.push(str.charAt(i));
            }

            for (int i = 0; i < str.length(); i++){
                reverse = reverse + stack.pop();
            }
    
            if(reverse.equals(str)){
                return true;
            } else {
                return false;
            }
        }
    }
}
