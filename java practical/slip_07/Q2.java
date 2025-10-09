import java.util.Scanner;

// Student class
class Student {
    int rollNo;
    String name;
    double percentage;

    // Default constructor
    public Student() {
        this.rollNo = 0;
        this.name = "Unknown";
        this.percentage = 0.0;
    }

    // Parameterized constructor
    public Student(int rollNo, String name, double percentage) {
        this.rollNo = rollNo;       // 'this' refers to current object
        this.name = name;
        this.percentage = percentage;
    }

    // Display method
    public void display() {
        System.out.println("Roll No: " + this.rollNo + ", Name: " + this.name + ", Percentage: " + this.percentage);
    }
}

// Main class
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];

        // Input details of 5 students
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            int rollNo = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Percentage: ");
            double percentage = sc.nextDouble();

            students[i] = new Student(rollNo, name, percentage);
        }

        // Display all students
        System.out.println("\nStudent Details:");
        for (Student s : students) {
            s.display();
        }

        sc.close();
    }
}
