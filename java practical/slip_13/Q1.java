import java.util.LinkedList;
import java.util.Iterator;

public class Q1 {
    public static void main(String[] args) {
        // Create a LinkedList of fruits
        LinkedList<String> fruits = new LinkedList<>();

        // Add fruit names to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Guava");
        fruits.add("Orange");

        // Display the contents using an Iterator
        System.out.println("Fruits in the list:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
