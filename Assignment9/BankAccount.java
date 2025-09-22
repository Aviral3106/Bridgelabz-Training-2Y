package Assignment_9;
//Sample Program 1: Bank Account System
class BankAccount {
 // Static variable shared across all accounts
 static String bankName = "National Bank";

 // Static variable to count total accounts
 private static int totalAccounts = 0;

 // Final variable for account number
 private final int accountNumber;

 // Instance variable
 private String accountHolderName;

 // Constructor using 'this' to resolve ambiguity
 public BankAccount(int accountNumber, String accountHolderName) {
     this.accountNumber = accountNumber;  // 'this' resolves ambiguity
     this.accountHolderName = accountHolderName;
     totalAccounts++;  // Increment total accounts whenever new account is created
 }

 // Static method to display total accounts
 public static void getTotalAccounts() {
     System.out.println("Total Accounts in " + bankName + ": " + totalAccounts);
 }

 // Method to display account details
 public void displayAccountDetails() {
     // Using instanceof to check before displaying details
     if (this instanceof BankAccount) {
         System.out.println("Bank Name       : " + bankName);
         System.out.println("Account Number  : " + accountNumber);
         System.out.println("Account Holder  : " + accountHolderName);
     } else {
         System.out.println("Invalid Account Object!");
     }
 }
}

//Driver class
 class Main {
 public static void main(String[] args) {
     // Create account objects
     BankAccount acc1 = new BankAccount(101, "Alice");
     BankAccount acc2 = new BankAccount(102, "Bob");

     // Display details
     acc1.displayAccountDetails();
     System.out.println("----------------------");
     acc2.displayAccountDetails();

     // Show total accounts
     BankAccount.getTotalAccounts();
 }
}


