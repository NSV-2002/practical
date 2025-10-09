import java.util.ListIterator;
import java.util.LinkedList;

public class Q1 {
    public static void main(String[] args) {
        // Create a LinkedList of fruits
        LinkedList<String> fruits = new LinkedList<>();

        // Add fruit names to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Guava");
        fruits.add("Orange");

        // Get ListIterator starting at the end of the list
        ListIterator<String> iterator = fruits.listIterator(fruits.size());

        // Display the contents in reverse order
        System.out.println("Fruits in reverse order:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
