package Assignment_3.lvl3;
import java.util.Scanner;

public class countdigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get an integer input for the 'number' variable
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Handle negative numbers by taking absolute value
        number = Math.abs(number);

        // Special case: if number is 0, it has 1 digit
        if (number == 0) {
            System.out.println("The number of digits: 1");
            return;
        }

        // Create an integer variable 'count' with value 0
        int count = 0;

        // Use a loop to iterate until number is not equal to 0
        while (number != 0) {
            // Remove the last digit from number
            number = number / 10;

            // Increase count by 1
            count++;
        }

        // Finally display the count
        System.out.println("The number of digits: " + count);

        sc.close();
    }
}

