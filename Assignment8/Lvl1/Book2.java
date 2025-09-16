package Assignment_8.Lvl1;

class Book2 {
    // Attributes
    private String title;
    private String author;
    private double price;
    private boolean available;

    // Default Constructor
    public Book2() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        this.available = true; // default: book is available
    }

    // Parameterized Constructor
    public Book2(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("You have successfully borrowed \"" + title + "\" by " + author + ".");
        } else {
            System.out.println("Sorry, \"" + title + "\" is not available right now.");
        }
    }

    // Method to return a book
    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println("You have returned \"" + title + "\".");
        } else {
            System.out.println("\"" + title + "\" was not borrowed.");
        }
    }

    // Display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (available ? "Available" : "Not Available"));
        System.out.println("----------------------");
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a book
        Book2 b1 = new Book2("The Great Gatsby", "F. Scott Fitzgerald", 399.99, true);

        b1.displayDetails();

        // Borrow the book
        b1.borrowBook();
        b1.displayDetails();

        // Try borrowing again
        b1.borrowBook();

        // Return the book
        b1.returnBook();
        b1.displayDetails();
    }
}

