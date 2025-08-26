package Assignment_3.lvl1;
import java.util.Scanner;

public class sumuntilzero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;   // to store the sum
        double number;        // to store user input

        // Take first input
        System.out.print("Enter a number (0 to stop): ");
        number = sc.nextDouble();

        // While loop runs until number is 0
        while (number != 0) {
            total += number;  // add to total

            // ask for next input
            System.out.print("Enter a number (0 to stop): ");
            number = sc.nextDouble();
        }

        // Final total after loop ends
        System.out.println("The total sum is: " + total);

        sc.close();
    }
}
