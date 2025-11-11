package Assignment_lambdaexpression;
import java.util.*;

class Product {
    private String name;
    private double price;
    private double rating;
    private double discount;

    public Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public double getRating() { return rating; }
    public double getDiscount() { return discount; }

    @Override
    public String toString() {
        return String.format("%s [Price: %.2f, Rating: %.1f, Discount: %.0f%%]",
                name, price, rating, discount);
    }
}

public class Ecommercesorting {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 60000, 4.6, 10));
        products.add(new Product("Smartphone", 25000, 4.8, 20));
        products.add(new Product("Headphones", 3000, 4.2, 15));
        products.add(new Product("TV", 40000, 4.5, 25));

        System.out.println("Sorted by Price (Low to High):");
        products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        products.forEach(System.out::println);

        System.out.println("\nSorted by Rating (High to Low):");
        products.sort((p1, p2) -> Double.compare(p2.getRating(), p1.getRating()));
        products.forEach(System.out::println);

        System.out.println("\nSorted by Discount (High to Low):");
        products.sort((p1, p2) -> Double.compare(p2.getDiscount(), p1.getDiscount()));
        products.forEach(System.out::println);
    }
}


