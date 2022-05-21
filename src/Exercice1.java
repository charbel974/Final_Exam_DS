import java.util.Stack;

public class Exercice1 {
    public static void main(String[] args) throws Exception {
        // EXERCICE 1 test
        // create a stack
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        int stackSum = sum(stack);
        System.out.println("Sum of the stack: " + stackSum);
    }
    
    // function to sum all the stack elements
    public static int sum(Stack st) {
        int sum = 0;
        if (st == null) {
            return sum;
        }
        while (!st.isEmpty()) {
            sum += (int) st.pop();
        }
        return sum;
    }
}
