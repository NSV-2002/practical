// Abstract class Shape
abstract class Shape {
    // Abstract methods
    abstract double area();
    abstract double volume();
}

// Sphere class derived from Shape
class Sphere extends Shape {
    double radius;

    // Constructor
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Override area method (surface area)
    @Override
    double area() {
        return 4 * Math.PI * radius * radius;
    }

    // Override volume method
    @Override
    double volume() {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }
}

// Main class
public class Q2 {
    public static void main(String[] args) {
        double radius = 5; // Example radius
        Sphere sphere = new Sphere(radius);

        System.out.printf("Sphere radius: %.2f%n", radius);
        System.out.printf("Surface Area: %.2f%n", sphere.area());
        System.out.printf("Volume: %.2f%n", sphere.volume());
    }
}
