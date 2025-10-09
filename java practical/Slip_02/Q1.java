import java.util.*;

public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter how many numbers you want to store: ");
        int n = sc.nextInt();

        // Accept n integers from user
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            numbers.add(num);
        }

        // Display elements of ArrayList
        System.out.println("\nElements in the ArrayList:");
        for (int num : numbers) {
            System.out.println(num);
        }

        sc.close();
    }
}
