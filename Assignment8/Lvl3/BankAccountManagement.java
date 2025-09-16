package Assignment_8.Lvl3;

//Base class BankAccount
class BankAccount {
 public String accountNumber;     // accessible everywhere
 protected String accountHolder;  // accessible in same package & subclasses
 private double balance;          // accessible only inside BankAccount

 // Constructor
 public BankAccount(String accountNumber, String accountHolder, double balance) {
     this.accountNumber = accountNumber;
     this.accountHolder = accountHolder;
     this.balance = balance;
 }

 // Getter for balance
 public double getBalance() {
     return balance;
 }

 // Deposit money
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited: " + amount);
     } else {
         System.out.println("Invalid deposit amount!");
     }
 }

 // Withdraw money
 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn: " + amount);
     } else {
         System.out.println("Invalid or Insufficient funds!");
     }
 }

 // Display account details
 public void displayDetails() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Account Holder: " + accountHolder);
     System.out.println("Balance: " + balance);
     System.out.println("----------------------");
 }
}

//Subclass SavingsAccount
class SavingsAccount extends BankAccount {
 private double interestRate;

 public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
     super(accountNumber, accountHolder, balance);
     this.interestRate = interestRate;
 }

 // Method to show subclass access
 public void displaySavingsDetails() {
     System.out.println("Savings Account Number: " + accountNumber);   // public → accessible
     System.out.println("Account Holder: " + accountHolder);           // protected → accessible in subclass
     System.out.println("Balance (via getter): " + getBalance());      // private → use getter
     System.out.println("Interest Rate: " + interestRate + "%");
     System.out.println("----------------------");
 }
}

//Main class
public class BankAccountManagement {
 public static void main(String[] args) {
     // Base class usage
     BankAccount acc1 = new BankAccount("BA101", "Alice", 5000.0);
     acc1.displayDetails();

     acc1.deposit(2000);
     acc1.withdraw(1500);
     System.out.println("Updated Balance of Alice: " + acc1.getBalance());

     // Subclass usage
     SavingsAccount savAcc = new SavingsAccount("SA201", "Bob", 8000.0, 4.5);
     savAcc.displaySavingsDetails();

     savAcc.deposit(1000);
     savAcc.withdraw(500);
     System.out.println("Updated Balance of Bob: " + savAcc.getBalance());
 }
}

