import java.util.Scanner;

// Interface Operation
interface Operation {
    double PI = 3.142; // Constant

    double area();   // Method to calculate area
    double volume(); // Method to calculate volume
}

// Circle class implementing Operation
class Circle implements Operation {
    double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override area() method
    @Override
    public double area() {
        return PI * radius * radius;
    }

    // Override volume() method
    @Override
    public double volume() {
        // Assuming volume of sphere for demonstration
        return (4.0 / 3) * PI * radius * radius * radius;
    }
}

// Main class
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();

        Circle circle = new Circle(r);

        System.out.printf("Area of Circle: %.2f%n", circle.area());
        System.out.printf("Volume (Sphere of same radius): %.2f%n", circle.volume());

        sc.close();
    }
}
