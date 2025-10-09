import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        // Create LinkedList with initial colors
        LinkedList<String> colours = new LinkedList<>();
        colours.add("Red");
        colours.add("Blue");
        colours.add("Yellow");
        colours.add("Orange");

        // i. Display the contents of the List using an Iterator
        System.out.println("Colours in the list:");
        Iterator<String> it = colours.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // ii. Display the contents of the List in reverse order using a ListIterator
        System.out.println("\nColours in reverse order:");
        ListIterator<String> listIt = colours.listIterator(colours.size());
        while (listIt.hasPrevious()) {
            System.out.println(listIt.previous());
        }

        // iii. Create another list containing pink and green
        LinkedList<String> newColours = new LinkedList<>();
        newColours.add("Pink");
        newColours.add("Green");

        // Insert new list elements between Blue and Yellow
        int index = colours.indexOf("Blue") + 1;
        colours.addAll(index, newColours);

        // Display the updated list
        System.out.println("\nUpdated Colours List:");
        for (String colour : colours) {
            System.out.println(colour);
        }
    }
}
