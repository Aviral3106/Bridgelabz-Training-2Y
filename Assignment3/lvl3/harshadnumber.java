package Assignment_3.lvl3;
import java.util.Scanner;

public class harshadnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int originalNumber = number; // Keep original for later check
        int sum = 0;

        // While loop to access each digit
        while (number > 0) {
            int digit = number % 10;   // get last digit
            sum += digit;              // add digit to sum
            number = number / 10;      // remove last digit
        }

        // Check if divisible by sum
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is NOT a Harshad Number.");
        }

        sc.close();
    }
}

