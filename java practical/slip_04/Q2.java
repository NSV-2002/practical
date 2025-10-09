import java.util.Scanner;

// Product class
class Product {
    int id;
    String name;
    double price;

    // Constructor
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

// Main class
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5];

        // Input details of 5 products
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            products[i] = new Product(id, name, price);
        }

        // Find product with minimum price
        double minPrice = products[0].price;
        String minProductName = products[0].name;

        for (int i = 1; i < products.length; i++) {
            if (products[i].price < minPrice) {
                minPrice = products[i].price;
                minProductName = products[i].name;
            }
        }

        // Display result
        System.out.println("\nProduct with minimum price: " + minProductName);

        sc.close();
    }
}
