package Assignment_4.lvl2;
import java.util.Scanner;

public class digitslargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Array to store digits
        int maxDigit = 10;  // max allowed digits
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and store in array
        while (number != 0) {
            int digit = number % 10;   // get last digit
            digits[index] = digit;
            index++;

            if (index == maxDigit) {   // stop if array full
                System.out.println("Reached max digit limit (" + maxDigit + "). Extra digits ignored.");
                break;
            }

            number /= 10; // remove last digit
        }

        // Initialize largest and second largest
        int largest = -1;
        int secondLargest = -1;

        // Find largest and second largest
        for (int i = 0; i < index; i++) {
            int d = digits[i];
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        // Display results
        System.out.println("\n--- Digits Stored ---");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\n\nLargest digit = " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit = " + secondLargest);
        } else {
            System.out.println("Second largest digit does not exist (all digits same or only one digit).");
        }

        sc.close();
    }
}

