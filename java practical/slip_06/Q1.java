import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a TreeSet to store unique and sorted integers
        Set<Integer> numbers = new TreeSet<>();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Input n integers
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        // Display elements in sorted order
        System.out.println("\nElements in sorted order (duplicates removed):");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Search for a particular element
        System.out.print("\nEnter element to search: ");
        int key = sc.nextInt();

        if (numbers.contains(key)) {
            System.out.println("Element " + key + " is present in the collection.");
        } else {
            System.out.println("Element " + key + " is NOT present in the collection.");
        }

        sc.close();
    }
}
