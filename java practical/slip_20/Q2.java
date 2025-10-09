// Employee class
class Employee {
    int id;
    String name;
    String deptName;
    double salary;
    static int count = 0; // Static variable to keep track of objects

    // Default constructor
    public Employee() {
        count++;
    }

    // Parameterized constructor
    public Employee(int id, String name, String deptName, double salary) {
        this.id = id;
        this.name = name;
        this.deptName = deptName;
        this.salary = salary;
        count++; // Increment object count
    }

    // Method to display employee details
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + 
                           ", Department: " + deptName + ", Salary: " + salary);
        System.out.println("Total Employees Created: " + count);
        System.out.println("----------------------------------------");
    }
}

// Main class
public class Q2 {
    public static void main(String[] args) {
        // Create Employee objects using parameterized constructor
        Employee e1 = new Employee(101, "Alice", "IT", 75000);
        e1.display();

        Employee e2 = new Employee(102, "Bob", "HR", 65000);
        e2.display();

        Employee e3 = new Employee(103, "Charlie", "Finance", 80000);
        e3.display();
    }
}
