import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept user name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Convert name to uppercase
        String upperName = name.toUpperCase();

        // Display greeting message
        System.out.println("Hello, " + upperName + ", nice to meet you!");

        sc.close();
    }
}
