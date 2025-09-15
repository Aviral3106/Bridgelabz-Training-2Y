
class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    // deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully!");
    }

    // withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // display balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.accountHolder = "Rahul";
        acc.accountNumber = 12345;
        acc.balance = 1000;

        acc.displayBalance();
        acc.deposit(500);
        acc.withdraw(300);
        acc.withdraw(1500); // insufficient
        acc.displayBalance();
    }
}
