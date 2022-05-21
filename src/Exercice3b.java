import java.util.LinkedList;

// author: Guy ABN

public class Exercice3b {
    public static void main(String arg[]) throws Exception {
        // EXERCICE 3 test
        // create a linked list
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // b)
        displayOdd(list);
    }
    // b) Write a method that displays only odd linked list elements
    public static void displayOdd(LinkedList list) {
        if (list == null) {
            return;
        }
        while (!list.isEmpty()) {
            int n = (int) list.pop();
            if (n % 2 != 0) {
                System.out.println(n);
            }
        }
    }
}
