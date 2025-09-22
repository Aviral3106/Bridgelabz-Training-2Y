package Assignment_9;

//Sample Program 2: Library Management System
class Book {
 // Static variable shared across all books
 static String libraryName = "Central Library";

 // Final variable for unique ISBN (cannot be changed once assigned)
 private final String isbn;

 // Instance variables
 private String title;
 private String author;

 // Constructor using 'this' to resolve ambiguity
 public Book(String title, String author, String isbn) {
     this.title = title;     // 'this' resolves ambiguity
     this.author = author;
     this.isbn = isbn;
 }

 // Static method to display library name
 public static void displayLibraryName() {
     System.out.println("Library Name: " + libraryName);
 }

 // Method to display book details
 public void displayBookDetails() {
     if (this instanceof Book) {   // Using instanceof
         System.out.println("Library    : " + libraryName);
         System.out.println("Title      : " + title);
         System.out.println("Author     : " + author);
         System.out.println("ISBN       : " + isbn);
     } else {
         System.out.println("Invalid Book Object!");
     }
 }

 // Method to return ISBN
 public String getIsbn() {
     if (this instanceof Book) {
         return this.isbn;
     } else {
         return "Invalid Object";
     }
 }
}

//Driver class
class Main2 {
 public static void main(String[] args) {
     // Display library name
     Book.displayLibraryName();

     // Create book objects
     Book b1 = new Book("The Alchemist", "Paulo Coelho", "ISBN101");
     Book b2 = new Book("1984", "George Orwell", "ISBN102");

     // Display book details
     b1.displayBookDetails();
     System.out.println("----------------------");
     b2.displayBookDetails();

     // Return ISBN
     System.out.println("ISBN of Book 1: " + b1.getIsbn());
     System.out.println("ISBN of Book 2: " + b2.getIsbn());
 }
}



