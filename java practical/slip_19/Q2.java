import java.util.Scanner;

// Abstract class Order
abstract class Order {
    int id;
    String description;

    // Abstract methods to accept and display details
    abstract void accept();
    abstract void display();
}

// Subclass PurchaseOrder
class PurchaseOrder extends Order {
    String customerName;
    static int count = 0; // To keep track of objects created

    // Scanner for input
    Scanner sc = new Scanner(System.in);

    // Accept details
    @Override
    void accept() {
        System.out.print("Enter Order ID: ");
        id = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Description: ");
        description = sc.nextLine();
        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();
        count++;
    }

    // Display details
    @Override
    void display() {
        System.out.println("\nOrder ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Total Orders Created: " + count);
        System.out.println("-----------------------------------");
    }
}

// Main class
public class Q2 {
    public static void main(String[] args) {
        // Create 3 PurchaseOrder objects
        PurchaseOrder[] orders = new PurchaseOrder[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Purchase Order " + (i + 1) + ":");
            orders[i] = new PurchaseOrder();
            orders[i].accept();
        }

        // Display details of all orders
        System.out.println("\nDetails of All Purchase Orders:");
        for (PurchaseOrder order : orders) {
            order.display();
        }
    }
}
