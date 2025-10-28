// Question 5: Real-Life Scenario - Library Management System
// Main program importing all packages and simulating library operations

import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;
import library.transactions.Transaction.TransactionType;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        System.out.println("=== Question 5: Library Management System ===");
        
        // 1. Adding new books
        System.out.println("\n1. Adding New Books:");
        Book book1 = new Book("B001", "Java: The Complete Reference", "Herbert Schildt", 
                             "978-1260440232", "Programming");
        Book book2 = new Book("B002", "Effective Java", "Joshua Bloch", 
                             "978-0134685991", "Programming");
        Book book3 = new Book("B003", "Clean Code", "Robert C. Martin", 
                             "978-0132350884", "Software Engineering");
        
        book1.displayBookDetails();
        System.out.println();
        book2.displayBookDetails();
        System.out.println();
        book3.displayBookDetails();
        
        // 2. Registering new members
        System.out.println("\n\n2. Registering New Members:");
        Member member1 = new Member("M001", "Akshit Jaiswal", "akshit@email.com", "9876543210");
        Member member2 = new Member("M002", "Priya Singh", "priya@email.com", "9876543211");
        
        member1.displayMemberDetails();
        System.out.println();
        member2.displayMemberDetails();
        
        // 3. Issuing books to members
        System.out.println("\n\n3. Issuing Books to Members:");
        
        // Check if member can issue books
        if (member1.canIssueMoreBooks() && book1.isAvailable()) {
            // Create transaction for issuing book
            Transaction transaction1 = new Transaction("T001", member1.getMemberId(), 
                                                     book1.getBookId(), TransactionType.ISSUE);
            
            // Update book and member status
            book1.setAvailable(false);
            member1.issueBook(book1.getBookId());
            
            System.out.println("Book issued successfully!");
            transaction1.displayTransactionDetails();
            System.out.println();
            
            // Display updated member details
            System.out.println("Updated Member Details:");
            member1.displayMemberDetails();
        }
        
        System.out.println("\n" + "=".repeat(50));
        
        // Issue second book to same member
        if (member1.canIssueMoreBooks() && book2.isAvailable()) {
            Transaction transaction2 = new Transaction("T002", member1.getMemberId(), 
                                                     book2.getBookId(), TransactionType.ISSUE);
            
            book2.setAvailable(false);
            member1.issueBook(book2.getBookId());
            
            System.out.println("Second book issued successfully!");
            transaction2.displayTransactionDetails();
            System.out.println();
            
            System.out.println("Updated Member Details:");
            member1.displayMemberDetails();
        }
        
        // Issue book to second member
        System.out.println("\n" + "=".repeat(50));
        if (member2.canIssueMoreBooks() && book3.isAvailable()) {
            Transaction transaction3 = new Transaction("T003", member2.getMemberId(), 
                                                     book3.getBookId(), TransactionType.ISSUE);
            
            book3.setAvailable(false);
            member2.issueBook(book3.getBookId());
            
            System.out.println("Book issued to second member!");
            transaction3.displayTransactionDetails();
            System.out.println();
            
            System.out.println("Updated Member Details:");
            member2.displayMemberDetails();
        }
        
        System.out.println("\n=== Library System Summary ===");
        System.out.println("Total Books in System: 3");
        System.out.println("Total Members: 2");
        System.out.println("Active Transactions: 3");
        System.out.println("\nBooks Available:");
        System.out.println("- " + book1.getTitle() + ": " + (book1.isAvailable() ? "Available" : "Issued"));
        System.out.println("- " + book2.getTitle() + ": " + (book2.isAvailable() ? "Available" : "Issued"));
        System.out.println("- " + book3.getTitle() + ": " + (book3.isAvailable() ? "Available" : "Issued"));
        
        System.out.println("\n=== Package Organization Benefits ===");
        System.out.println("1. library.books - Manages book-related operations");
        System.out.println("2. library.members - Handles member information and limits");
        System.out.println("3. library.transactions - Tracks issue/return with fine calculation");
        System.out.println("4. Clear separation of concerns");
        System.out.println("5. Easy to maintain and extend");
        System.out.println("6. Reusable components");
    }
}
