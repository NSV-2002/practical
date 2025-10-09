import java.util.Scanner;

// Employee class
class Employee {
    int id;
    String name;
    double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

// Main class
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        Employee[] employees = new Employee[n];

        // Input employee details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employees[i] = new Employee(id, name, salary);
        }

        // Find employee with maximum salary
        double maxSalary = employees[0].salary;
        String maxSalaryName = employees[0].name;

        for (int i = 1; i < employees.length; i++) {
            if (employees[i].salary > maxSalary) {
                maxSalary = employees[i].salary;
                maxSalaryName = employees[i].name;
            }
        }

        // Display result
        System.out.println("\nEmployee with maximum salary: " + maxSalaryName);

        sc.close();
    }
}
