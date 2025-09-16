package Assignment_8.Lvl2;
class Product {
    // Instance variables
    private String productName;
    private double price;

    // Class variable (shared among all products)
    private static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // increment when a product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("----------------------");
    }

    // Class method to display total products
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
        System.out.println("======================");
    }

    // Main method for testing
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 55000.0);
        p1.displayProductDetails();

        Product p2 = new Product("Smartphone", 25000.0);
        p2.displayProductDetails();

        Product p3 = new Product("Headphones", 2000.0);
        p3.displayProductDetails();

        // Display total number of products created
        Product.displayTotalProducts();
    }
}

