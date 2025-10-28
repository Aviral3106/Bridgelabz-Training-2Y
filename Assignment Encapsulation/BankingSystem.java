package Assignment_encapsulation;
//Interface: Loanable
interface Loanable {
 void applyForLoan(double amount);
 boolean calculateLoanEligibility();
}

//Abstract class: BankAccount
abstract class BankAccount implements Loanable {
 // Encapsulation: private fields
 private String accountNumber;
 private String holderName;
 private double balance;

 // Constructor
 public BankAccount(String accountNumber, String holderName, double balance) {
     this.accountNumber = accountNumber;
     this.holderName = holderName;
     this.balance = balance;
 }

 // Getters and Setters
 public String getAccountNumber() {
     return accountNumber;
 }

 public String getHolderName() {
     return holderName;
 }

 public double getBalance() {
     return balance;
 }

 protected void setBalance(double balance) {
     this.balance = balance;
 }

 // Deposit method (concrete)
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("₹" + amount + " deposited successfully. New balance: ₹" + balance);
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }

 // Withdraw method (concrete)
 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("₹" + amount + " withdrawn successfully. Remaining balance: ₹" + balance);
     } else {
         System.out.println("Insufficient balance or invalid amount.");
     }
 }

 // Abstract method
 public abstract double calculateInterest();

 // Display account details
 public void displayAccountDetails() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Holder Name: " + holderName);
     System.out.println("Balance: ₹" + balance);
 }
}

//Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
 private double interestRate;

 public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
     super(accountNumber, holderName, balance);
     this.interestRate = interestRate;
 }

 @Override
 public double calculateInterest() {
     return getBalance() * (interestRate / 100);
 }

 @Override
 public void applyForLoan(double amount) {
     System.out.println("Applying for loan of ₹" + amount + " from Savings Account...");
     if (calculateLoanEligibility()) {
         System.out.println("Loan approved based on savings history.");
     } else {
         System.out.println("Loan not approved. Maintain higher balance for eligibility.");
     }
 }

 @Override
 public boolean calculateLoanEligibility() {
     return getBalance() >= 20000;
 }
}

//Subclass: CurrentAccount
class CurrentAccount extends BankAccount {
 private double overdraftLimit;

 public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
     super(accountNumber, holderName, balance);
     this.overdraftLimit = overdraftLimit;
 }

 @Override
 public double calculateInterest() {
     // Current accounts usually have no or very low interest
     return getBalance() * 0.02; // 2% simple interest
 }

 @Override
 public void applyForLoan(double amount) {
     System.out.println("Applying for business loan of ₹" + amount + " from Current Account...");
     if (calculateLoanEligibility()) {
         System.out.println("Loan approved under business category.");
     } else {
         System.out.println("Loan not approved. Low turnover or balance.");
     }
 }

 @Override
 public boolean calculateLoanEligibility() {
     return getBalance() >= 50000 || overdraftLimit >= 20000;
 }
}

//Main Class: Demonstrate Polymorphism
public class BankingSystem {
 // Method to process accounts polymorphically
 public static void processAccount(BankAccount account) {
     System.out.println("\n--- Account Details ---");
     account.displayAccountDetails();

     double interest = account.calculateInterest();
     System.out.println("Calculated Interest: ₹" + interest);

     // Apply for loan
     account.applyForLoan(50000);
 }

 public static void main(String[] args) {
     // Create different account types
     BankAccount acc1 = new SavingsAccount("SAV12345", "Amit Sharma", 25000, 5.0);
     BankAccount acc2 = new CurrentAccount("CUR67890", "Priya Verma", 40000, 30000);

     // Demonstrate encapsulation and polymorphism
     acc1.deposit(5000);
     acc2.withdraw(10000);

     // Process accounts dynamically
     BankAccount[] accounts = {acc1, acc2};

     System.out.println("\n=== Banking System ===");
     for (BankAccount acc : accounts) {
         processAccount(acc);
         System.out.println("-----------------------------------");
     }
 }
}

