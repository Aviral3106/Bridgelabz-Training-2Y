package Assignment_6.lvl3;
import java.util.ArrayList;
import java.util.Scanner;

// Class representing each item in the cart
class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate total cost of this item
    double getTotalPrice() {
        return price * quantity;
    }

    // Method to display item details
    public String toString() {
        return itemName + " - Rs." + price + " x " + quantity + " = Rs." + getTotalPrice();
    }
}

// Class for Shopping Cart
class ShoppingCart {
    ArrayList<CartItem> cart = new ArrayList<>();

    // Add item to the cart
    void addItem(String itemName, double price, int quantity) {
        CartItem item = new CartItem(itemName, price, quantity);
        cart.add(item);
        System.out.println(itemName + " added to cart!");
    }

    // Remove item by name
    void removeItem(String itemName) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).itemName.equalsIgnoreCase(itemName)) {
                System.out.println(itemName + " removed from cart!");
                cart.remove(i);
                return;
            }
        }
        System.out.println("Item not found in cart.");
    }

    // Display total cost
    void displayTotalCost() {
        double total = 0;
        for (CartItem item : cart) {
            total += item.getTotalPrice();
        }
        System.out.println("Total Cost = Rs." + total);
    }

    // Display all items
    void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            System.out.println("Items in Cart:");
            for (CartItem item : cart) {
                System.out.println(item);
            }
        }
    }
}

// Main class
public class Shoppingcart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("\n--- Shopping Cart Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Cart");
            System.out.println("4. Display Total Cost");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();
                    cart.addItem(name, price, qty);
                    break;

                case 2:
                    System.out.print("Enter item name to remove: ");
                    String removeName = sc.nextLine();
                    cart.removeItem(removeName);
                    break;

                case 3:
                    cart.displayCart();
                    break;

                case 4:
                    cart.displayTotalCost();
                    break;

                case 5:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}


