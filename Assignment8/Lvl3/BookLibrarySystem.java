package Assignment_8.Lvl3;

//Base class Book
class Book {
 public String ISBN;       // accessible everywhere
 protected String title;   // accessible in same package and subclasses
 private String author;    // accessible only inside Book class

 // Constructor
 public Book(String ISBN, String title, String author) {
     this.ISBN = ISBN;
     this.title = title;
     this.author = author;
 }

 // Getter and Setter for author (private → needs public methods)
 public String getAuthor() {
     return author;
 }

 public void setAuthor(String author) {
     this.author = author;
 }

 // Method to display book details
 public void displayDetails() {
     System.out.println("ISBN: " + ISBN);
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
     System.out.println("----------------------");
 }
}

//Subclass EBook
class EBook extends Book {
 private double fileSizeMB;

 public EBook(String ISBN, String title, String author, double fileSizeMB) {
     super(ISBN, title, author);
     this.fileSizeMB = fileSizeMB;
 }

 // Method to display EBook details (uses ISBN and title)
 public void displayEBookDetails() {
     System.out.println("EBook ISBN: " + ISBN);     // public → accessible
     System.out.println("EBook Title: " + title);   // protected → accessible in subclass
     System.out.println("Author (via getter): " + getAuthor()); // private → must use getter
     System.out.println("File Size: " + fileSizeMB + " MB");
     System.out.println("----------------------");
 }
}

//Main class
public class BookLibrarySystem {
 public static void main(String[] args) {
     // Normal Book
     Book b1 = new Book("978-0134685991", "Effective Java", "Joshua Bloch");
     b1.displayDetails();

     // Update author using setter
     b1.setAuthor("J. Bloch");
     System.out.println("Updated Author: " + b1.getAuthor());

     // EBook
     EBook eb1 = new EBook("978-1491950357", "Java: The Complete Reference", "Herbert Schildt", 15.2);
     eb1.displayEBookDetails();

     // Update author of ebook
     eb1.setAuthor("H. Schildt");
     System.out.println("Updated Author of EBook: " + eb1.getAuthor());
 }
}

