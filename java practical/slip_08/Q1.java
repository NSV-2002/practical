public class Q1 {
    public static void main(String[] args) {
        // Check if a command-line argument is provided
        if (args.length < 1) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }

        // Parse the number from the argument
        int num = Integer.parseInt(args[0]);
        int reversed = 0;
        int original = num;

        // Reverse the number
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        // Display the result
        System.out.println("Original Number: " + original);
        System.out.println("Reversed Number: " + reversed);
    }
}
