import java.util.LinkedList;
import java.util.Stack;

// author: Guy ABN

public class Exercice3c {
    public static void main(String[] args) throws Exception {
        // EXERCICE 3 test
        // create a linked list
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // c)
        displayEvenReverse(list);
    }
    // c) Write a method that displays only even list elements in reverse order
    public static void displayEvenReverse(LinkedList list) {
        if (list == null) {
            return;
        }
        Stack<Integer> stack = new Stack<>();
        while (!list.isEmpty()) {
            int n = (int) list.pop();
            if (n % 2 == 0) {
                stack.push(n);
            }
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
