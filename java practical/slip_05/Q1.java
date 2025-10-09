import java.util.Scanner;

// User-defined exception
class ZeroNumberException extends Exception {
    public ZeroNumberException(String message) {
        super(message);
    }
}

public class Q1 {
    
    // Method to calculate factorial
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        try {
            if (num == 0) {
                throw new ZeroNumberException("Number is 0");
            } else if (num < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                long result = factorial(num);
                System.out.println("Factorial of " + num + " is: " + result);
            }
        } catch (ZeroNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
