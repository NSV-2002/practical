// Point class
class Point {
    int x, y;

    // Default constructor
    public Point() {
        x = 0;
        y = 0;
    }

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Display method
    public void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }
}

// Subclass ColorPoint
class ColorPoint extends Point {
    String color;

    // Default constructor
    public ColorPoint() {
        super(); // Call default constructor of Point
        color = "undefined";
    }

    // Parameterized constructor
    public ColorPoint(int x, int y, String color) {
        super(x, y); // Call parameterized constructor of Point
        this.color = color;
    }

    // Display method
    @Override
    public void display() {
        System.out.println("ColorPoint coordinates: (" + x + ", " + y + "), Color: " + color);
    }
}

// Main class
public class PointDemo {
    public static void main(String[] args) {
        // Using Point class
        Point p1 = new Point();           // Default
        Point p2 = new Point(5, 10);     // Parameterized

        p1.display();
        p2.display();

        // Using ColorPoint class
        ColorPoint cp1 = new ColorPoint();                 // Default
        ColorPoint cp2 = new ColorPoint(7, 14, "Red");    // Parameterized

        cp1.display();
        cp2.display();
    }
}
