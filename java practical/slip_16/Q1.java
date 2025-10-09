// MyNumber class
class MyNumber {
    private int number;

    // Parameterized constructor
    public MyNumber(int number) {
        this.number = number;
    }

    // Method to check if number is even
    public boolean isEven() {
        return number % 2 == 0;
    }

    // Method to display number
    public void display() {
        System.out.println("Number: " + number);
        if (isEven()) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}

// Main class
public class Q1 {
    public static void main(String[] args) {
        // Check if command-line argument is provided
        if (args.length < 1) {
            System.out.println("Please provide a number as command-line argument.");
            return;
        }

        try {
            int num = Integer.parseInt(args[0]); // Convert argument to integer
            MyNumber myNum = new MyNumber(num); // Create object
            myNum.display(); // Display details
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter an integer.");
        }
    }
}
