import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a HashMap to store employee name and salary
        HashMap<String, Double> employeeMap = new HashMap<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        // Input employee details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine(); // Consume newline

            employeeMap.put(name, salary);
        }

        // Display HashMap contents
        System.out.println("\nEmployee Details (Name -> Salary):");
        for (Map.Entry<String, Double> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        sc.close();
    }
}
