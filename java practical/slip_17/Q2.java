// Student class
class Student {
    int rollno;
    String name;
    static int count = 0; // Static variable to keep track of objects

    // Default constructor
    public Student() {
        count++;
    }

    // Parameterized constructor
    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
        count++; // Increment count whenever a new object is created
    }

    // Method to display student details
    public void display() {
        System.out.println("Roll No: " + rollno + ", Name: " + name);
        System.out.println("Total Students Created: " + count);
    }
}

// Main class
public class Q2 {
    public static void main(String[] args) {
        // Create Student objects using parameterized constructor
        Student s1 = new Student(101, "Alice");
        s1.display();

        Student s2 = new Student(102, "Bob");
        s2.display();

        Student s3 = new Student(103, "Charlie");
        s3.display();
    }
}
