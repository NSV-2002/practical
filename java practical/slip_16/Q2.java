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

// Subclass Programmer
class Programmer extends Employee {
    String progLanguage;

    // Constructor
    public Programmer(String name, double salary, String progLanguage) {
        super(name, salary); // Call superclass constructor
        this.progLanguage = progLanguage;
    }

    // Display method
    @Override
    public void display() {
        super.display(); // Display name and salary
        System.out.println("Programming Language: " + progLanguage);
    }
}

// Main class
public class Q2 {
    public static void main(String[] args) {
        // Create a Programmer object
        Programmer prog = new Programmer("Alice", 85000, "Java");

        // Display details
        System.out.println("Programmer Details:");
        prog.display();
    }
}
