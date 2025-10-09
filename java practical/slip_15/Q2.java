// Superclass Employee
class Employee {
    String name;
    double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Subclass Developer
class Developer extends Employee {
    String projectName;

    // Constructor
    public Developer(String name, double salary, String projectName) {
        super(name, salary); // Call superclass constructor
        this.projectName = projectName;
    }

    // Display method
    @Override
    public void display() {
        super.display(); // Display name and salary
        System.out.println("Project Name: " + projectName);
    }
}

// Main class
public class Q2 {
    public static void main(String[] args) {
        // Create a Developer object
        Developer dev = new Developer("Alice", 75000, "Inventory Management");

        // Display details
        System.out.println("Developer Details:");
        dev.display();
    }
}
