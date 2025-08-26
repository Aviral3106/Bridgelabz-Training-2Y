package Assignment_3.lvl3;
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get an integer input and store it in the 'number' variable
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Define 'sum' and initialize it to zero
        int sum = 0;

        // Define 'originalNumber' and assign it the input 'number'
        int originalNumber = number;

        // Use a while loop till 'originalNumber' is not equal to zero
        while (originalNumber != 0) {
            // Find each digit: remainder of modulus operation originalNumber % 10
            int digit = originalNumber % 10;

            // Find the cube of the digit and add it to 'sum'
            sum += digit * digit * digit;

            // Remove the last digit: quotient of division originalNumber / 10
            originalNumber = originalNumber / 10;
        }

        // Finally, check if 'number' and 'sum' are the same
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }

        sc.close();
    }
}

