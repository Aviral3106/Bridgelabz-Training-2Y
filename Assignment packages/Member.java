package library.members;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String memberId;
    private String name;
    private String email;
    private String phoneNumber;
    private List<String> issuedBooks;
    private int maxBooksAllowed;
    
    public Member(String memberId, String name, String email, String phoneNumber) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.issuedBooks = new ArrayList<>();
        this.maxBooksAllowed = 5; // Default limit
    }
    
    // Getter methods
    public String getMemberId() {
        return memberId;
    }
    
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public List<String> getIssuedBooks() {
        return new ArrayList<>(issuedBooks); // Return copy to maintain encapsulation
    }
    
    public int getMaxBooksAllowed() {
        return maxBooksAllowed;
    }
    
    public int getCurrentBooksCount() {
        return issuedBooks.size();
    }
    
    // Setter methods
    public void setName(String name) {
        this.name = name;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public void setMaxBooksAllowed(int maxBooksAllowed) {
        this.maxBooksAllowed = maxBooksAllowed;
    }
    
    // Business methods
    public boolean canIssueMoreBooks() {
        return issuedBooks.size() < maxBooksAllowed;
    }
    
    public void issueBook(String bookId) {
        if (canIssueMoreBooks()) {
            issuedBooks.add(bookId);
        } else {
            System.out.println("Cannot issue more books. Limit reached!");
        }
    }
    
    public void returnBook(String bookId) {
        issuedBooks.remove(bookId);
    }
    
    public void displayMemberDetails() {
        System.out.println("=== Member Details ===");
        System.out.println("Member ID: " + memberId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Books Issued: " + issuedBooks.size() + "/" + maxBooksAllowed);
        if (!issuedBooks.isEmpty()) {
            System.out.println("Issued Book IDs: " + issuedBooks);
        }
    }
    
    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + memberId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", issuedBooks=" + issuedBooks.size() +
                '}';
    }
}
