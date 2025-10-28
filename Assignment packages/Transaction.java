package library.transactions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private String transactionId;
    private String memberId;
    private String bookId;
    private LocalDate issueDate;
    private LocalDate dueDate;
    private LocalDate returnDate;
    private TransactionType type;
    private double fineAmount;
    
    public enum TransactionType {
        ISSUE, RETURN, RENEW
    }
    
    // Constructor for issue transaction
    public Transaction(String transactionId, String memberId, String bookId, TransactionType type) {
        this.transactionId = transactionId;
        this.memberId = memberId;
        this.bookId = bookId;
        this.type = type;
        this.issueDate = LocalDate.now();
        this.dueDate = issueDate.plusDays(14); // 14 days loan period
        this.returnDate = null;
        this.fineAmount = 0.0;
    }
    
    // Getter methods
    public String getTransactionId() {
        return transactionId;
    }
    
    public String getMemberId() {
        return memberId;
    }
    
    public String getBookId() {
        return bookId;
    }
    
    public LocalDate getIssueDate() {
        return issueDate;
    }
    
    public LocalDate getDueDate() {
        return dueDate;
    }
    
    public LocalDate getReturnDate() {
        return returnDate;
    }
    
    public TransactionType getType() {
        return type;
    }
    
    public double getFineAmount() {
        return fineAmount;
    }
    
    // Setter methods
    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
        calculateFine();
    }
    
    public void setType(TransactionType type) {
        this.type = type;
    }
    
    // Business methods
    public boolean isOverdue() {
        if (returnDate != null) {
            return returnDate.isAfter(dueDate);
        }
        return LocalDate.now().isAfter(dueDate);
    }
    
    public void calculateFine() {
        if (returnDate != null && returnDate.isAfter(dueDate)) {
            long daysOverdue = java.time.temporal.ChronoUnit.DAYS.between(dueDate, returnDate);
            fineAmount = daysOverdue * 2.0; // $2 per day fine
        } else {
            fineAmount = 0.0;
        }
    }
    
    public void processReturn() {
        this.returnDate = LocalDate.now();
        this.type = TransactionType.RETURN;
        calculateFine();
    }
    
    public void displayTransactionDetails() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("=== Transaction Details ===");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Member ID: " + memberId);
        System.out.println("Book ID: " + bookId);
        System.out.println("Type: " + type);
        System.out.println("Issue Date: " + issueDate.format(formatter));
        System.out.println("Due Date: " + dueDate.format(formatter));
        if (returnDate != null) {
            System.out.println("Return Date: " + returnDate.format(formatter));
        }
        System.out.println("Fine Amount: $" + fineAmount);
        System.out.println("Status: " + (returnDate != null ? "Completed" : "Active"));
    }
    
    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", memberId='" + memberId + '\'' +
                ", bookId='" + bookId + '\'' +
                ", type=" + type +
                ", fineAmount=" + fineAmount +
                '}';
    }
}
