package Assignment_3.lvl2;
import java.util.Scanner;

public class powerofnumwhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        // Check for positive integers
        if (number < 0 || power < 0) {
            System.out.println("Please enter positive integers only.");
        } else {
            int result = 1;
            int i = 1;  // counter

            // Calculate power using while loop
            while (i <= power) {
                result *= number; // result = result * number
                i++;
            }

            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

        sc.close();
    }
}

