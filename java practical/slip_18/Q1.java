public class Q1 {
    public static void main(String[] args) {
        // Check if a command-line argument is provided
        if (args.length < 1) {
            System.out.println("Please provide a number as command-line argument.");
            return;
        }

        try {
            int num = Integer.parseInt(args[0]); // Convert argument to integer

            System.out.println("Factors of " + num + " are:");
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter an integer.");
        }
    }
}
