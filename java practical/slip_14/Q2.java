import java.util.Scanner;

// Interface Operation
interface Operation {
    double PI = 3.142; // Constant

    double area();   // Method to calculate area
    double volume(); // Method to calculate volume
}

// Cylinder class implementing Operation
class Cylinder implements Operation {
    double radius;
    double height;

    // Constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Override area() method (Surface area of cylinder)
    @Override
    public double area() {
        return 2 * PI * radius * (radius + height);
    }

    // Override volume() method (Volume of cylinder)
    @Override
    public double volume() {
        return PI * radius * radius * height;
    }
}

// Main class
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of cylinder: ");
        double r = sc.nextDouble();
        System.out.print("Enter height of cylinder: ");
        double h = sc.nextDouble();

        Cylinder cylinder = new Cylinder(r, h);

        System.out.printf("Surface Area of Cylinder: %.2f%n", cylinder.area());
        System.out.printf("Volume of Cylinder: %.2f%n", cylinder.volume());

        sc.close();
    }
}
