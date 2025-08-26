package Assignment_3.lvl1;
import java.util.Scanner;

public class factorialwhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check for positive integer
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int factorial = 1;
            int i = 1;

            // While loop to calculate factorial
            while (i <= number) {
                factorial *= i;  // multiply factorial by i
                i++;             // increment i
            }

            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        sc.close();
    }
}

