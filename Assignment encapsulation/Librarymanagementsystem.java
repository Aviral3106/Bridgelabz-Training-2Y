package Assignment_encapsulation;

interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

// Abstract class
abstract class LibraryItem implements Reservable {
    private String itemId;
    private String title;
    private String author;
    private boolean isReserved;
    private String borrowerName;

    // Constructor
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isReserved = false;
    }

    // Getters (Encapsulation)
    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    // Abstract method
    public abstract int getLoanDuration();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    // Interface methods
    @Override
    public void reserveItem(String borrowerName) {
        if (!isReserved) {
            this.isReserved = true;
            this.borrowerName = borrowerName;
            System.out.println(title + " has been reserved by " + borrowerName);
        } else {
            System.out.println(title + " is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

// Subclass 1
class Book extends LibraryItem {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 14 days for books
    }
}

// Subclass 2
class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 7 days for magazines
    }
}

// Subclass 3
class DVD extends LibraryItem {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 5; // 5 days for DVDs
    }
}

// Main Class
public class Librarymanagementsystem {
    public static void main(String[] args) {
        LibraryItem item1 = new Book("B101", "Java Programming", "James Gosling");
        LibraryItem item2 = new Magazine("M201", "National Geographic", "Various");
        LibraryItem item3 = new DVD("D301", "Inception", "Christopher Nolan");

        LibraryItem[] items = { item1, item2, item3 };

        System.out.println("=== Library Management System ===\n");
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            System.out.println("Available: " + (item.checkAvailability() ? "Yes" : "No"));
            System.out.println("----------------------------------");
        }

        System.out.println("\n--- Reservation Example ---");
        item1.reserveItem("Amit Sharma");
        item2.reserveItem("Priya Singh");
        item1.reserveItem("Rahul Verma"); // already reserved example
    }
}


