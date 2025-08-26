package Assignment_3.lvl1;
import java.util.Scanner;

public class factorialfor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if natural number (positive integer)
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int factorial = 1;

            // For loop to calculate factorial
            for (int i = 1; i <= number; i++) {
                factorial *= i;  // multiply factorial by i
            }

            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        sc.close();
    }
}

