package Assignment_encapsulation;
//Interface: Taxable
interface Taxable {
 double calculateTax();
 String getTaxDetails();
}

//Abstract class: Product
abstract class Product {
 // Encapsulation: private fields
 private int productId;
 private String name;
 private double price;

 // Constructor
 public Product(int productId, String name, double price) {
     this.productId = productId;
     this.name = name;
     this.price = price;
 }

 // Getters and Setters
 public int getProductId() {
     return productId;
 }

 public String getName() {
     return name;
 }

 public double getPrice() {
     return price;
 }

 public void setPrice(double price) {
     this.price = price;
 }

 // Abstract method for discount
 public abstract double calculateDiscount();

 // Display product details
 public void displayProductDetails() {
     System.out.println("Product ID: " + productId);
     System.out.println("Name: " + name);
     System.out.println("Price: ₹" + price);
 }
}

//Concrete subclass: Electronics
class Electronics extends Product implements Taxable {
 private double warrantyYears;

 public Electronics(int productId, String name, double price, double warrantyYears) {
     super(productId, name, price);
     this.warrantyYears = warrantyYears;
 }

 @Override
 public double calculateDiscount() {
     // 10% discount on electronics
     return getPrice() * 0.10;
 }

 @Override
 public double calculateTax() {
     // 18% GST on electronics
     return getPrice() * 0.18;
 }

 @Override
 public String getTaxDetails() {
     return "18% GST applied on Electronics.";
 }
}

//Concrete subclass: Clothing
class Clothing extends Product implements Taxable {
 private String size;

 public Clothing(int productId, String name, double price, String size) {
     super(productId, name, price);
     this.size = size;
 }

 @Override
 public double calculateDiscount() {
     // 20% discount on clothing
     return getPrice() * 0.20;
 }

 @Override
 public double calculateTax() {
     // 5% GST on clothing
     return getPrice() * 0.05;
 }

 @Override
 public String getTaxDetails() {
     return "5% GST applied on Clothing.";
 }
}

//Concrete subclass: Groceries
class Groceries extends Product {
 private double weightInKg;

 public Groceries(int productId, String name, double price, double weightInKg) {
     super(productId, name, price);
     this.weightInKg = weightInKg;
 }

 @Override
 public double calculateDiscount() {
     // 5% discount on groceries
     return getPrice() * 0.05;
 }

 // Groceries are non-taxable (so no Taxable interface)
}

//Main class to demonstrate polymorphism
public class Ecommerceplatform {
 // Method to display final price using polymorphism
 public static void displayFinalPrice(Product product) {
     System.out.println("\n--- Product Details ---");
     product.displayProductDetails();

     double discount = product.calculateDiscount();
     double tax = 0;

     if (product instanceof Taxable) {
         Taxable t = (Taxable) product;
         tax = t.calculateTax();
         System.out.println(t.getTaxDetails());
     } else {
         System.out.println("No tax applicable on this product.");
     }

     double finalPrice = product.getPrice() + tax - discount;
     System.out.println("Discount: ₹" + discount);
     System.out.println("Tax: ₹" + tax);
     System.out.println("Final Price (after discount & tax): ₹" + finalPrice);
 }

 public static void main(String[] args) {
     Product p1 = new Electronics(101, "Smartphone", 25000, 2);
     Product p2 = new Clothing(202, "T-Shirt", 1000, "L");
     Product p3 = new Groceries(303, "Wheat Flour", 800, 5);

     Product[] products = {p1, p2, p3};

     System.out.println("=== E-Commerce Platform ===");
     for (Product p : products) {
         displayFinalPrice(p);
         System.out.println("----------------------------------");
     }
 }
}


