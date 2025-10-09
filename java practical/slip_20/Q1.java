import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        // Check if 3 arguments are provided
        if (args.length < 3) {
            System.out.println("Please provide 3 numbers as command-line arguments.");
            return;
        }

        try {
            // Parse the command-line arguments to integers
            int[] numbers = new int[3];
            for (int i = 0; i < 3; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }

            // Sort the array
            Arrays.sort(numbers);

            // Display the sorted numbers
            System.out.println("Numbers in sorted order:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter integers.");
        }
    }
}
