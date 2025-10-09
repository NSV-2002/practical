import java.util.Scanner;

// Abstract class Shape
abstract class Shape {
    abstract double area();    // Abstract method for area
    abstract double volume();  // Abstract method for volume
}

// Cylinder class derived from Shape
class Cylinder extends Shape {
    double radius;
    double height;

    // Constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Override area() to calculate surface area
    @Override
    double area() {
        // Surface area = 2πr(h + r)
        return 2 * Math.PI * radius * (height + radius);
    }

    // Override volume() to calculate volume
    @Override
    double volume() {
        // Volume = πr^2h
        return Math.PI * radius * radius * height;
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

        System.out.printf("Cylinder Surface Area: %.2f%n", cylinder.area());
        System.out.printf("Cylinder Volume: %.2f%n", cylinder.volume());

        sc.close();
    }
}
