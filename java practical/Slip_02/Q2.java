class MyNumber {
    private int num;

    // Default constructor - initializes num to 0
    MyNumber() {
        num = 0;
    }

    // Parameterized constructor - initializes num to a given value
    MyNumber(int n) {
        num = n;
    }

    // Method to check if number is negative
    boolean isNegative() {
        return num < 0;
    }

    // Method to check if number is positive
    boolean isPositive() {
        return num > 0;
    }

    // Method to check if number is odd
    boolean isOdd() {
        return num % 2 != 0;
    }

    // Method to check if number is even
    boolean isEven() {
        return num % 2 == 0;
    }
}

public class Q2 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number as a command line argument.");
            return;
        }

        // Convert command line argument to integer
        int value = Integer.parseInt(args[0]);

        // Create object using parameterized constructor
        MyNumber obj = new MyNumber(value);

        // Display results
        System.out.println("Number: " + value);

        if (obj.isPositive())
            System.out.println("It is Positive");
        else if (obj.isNegative())
            System.out.println("It is Negative");
        else
            System.out.println("It is Zero");

        if (obj.isEven())
            System.out.println("It is Even");
        else
            System.out.println("It is Odd");
    }
}
