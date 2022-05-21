import java.util.LinkedList;
import java.util.Stack;

// author: Guy ABN

public class Exercice3a {
    public static void main(String arg[]) throws Exception {
        // EXERCICE 3 test
        // create a linked list
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // a)
        System.out.println("The number of even numbers in the list is: " + countEven(list));
    }
    // EXERCICE 3:
    // a) Write a method that counts only even numbers that are in this linked list
    public static int countEven(LinkedList list) {
        int count = 0;
        if (list == null) {
            return count;
        }
        while (!list.isEmpty()) {
            int n = (int) list.pop();
            if (n % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}