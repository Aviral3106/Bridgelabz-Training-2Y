package Assignment_8.Lvl1;
class Book {
    // Attributes
    private String title;
    private String author;
    private double price;

    // Default Constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("----------------------");
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Using default constructor
        Book book1 = new Book();
        book1.displayDetails();

        // Using parameterized constructor
        Book book2 = new Book("The Alchemist", "Paulo Coelho", 499.99);
        book2.displayDetails();
    }
}