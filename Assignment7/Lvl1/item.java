
class item {
    int itemCode;
    String itemName;
    double price;

    // method to calculate total cost
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public void displayItem(int quantity) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotalCost(quantity));
    }

    public static void main(String[] args) {
        item item = new item();
        item.itemCode = 101;
        item.itemName = "Laptop";
        item.price = 55000;

        item.displayItem(2); // Example: buying 2 laptops
    }
}
