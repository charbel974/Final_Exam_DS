import java.util.Stack;

public class Exercice2 {
    public static void main(String[] args) throws Exception {
        // EXERCICE 2 test
        // create a stack
        String test1 = "guy";
        String test2 = "bob";
        // test isPalindrome function
        System.out.println("Is " + test1 + " a palindrome? " + isPalindrome(test1));
        System.out.println("Is " + test2 + " a palindrome? " + isPalindrome(test2));
    }
    // EXERCICE 2:
    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                stack.push(Character.toLowerCase(c));
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return str.equals(sb.toString());
    }
}
