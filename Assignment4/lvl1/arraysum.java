package Assignment_4;
import java.util.Scanner;

public class arraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];  // array of max 10 elements
        double total = 0.0;                 // sum variable
        int index = 0;                      // index for array

        System.out.println("Enter up to 10 positive numbers (0 or negative number to stop):");

        // Infinite loop to take input
        while (true) {
            System.out.print("Enter number " + (index + 1) + ": ");
            double value = sc.nextDouble();

            // Break if user enters 0 or negative
            if (value <= 0) {
                break;
            }

            // Break if array is full
            if (index == 10) {
                System.out.println("Array limit reached (10 numbers).");
                break;
            }

            // Store value in array
            numbers[index] = value;
            index++;
        }

        // Calculate sum and display stored numbers
        System.out.println("\n--- Numbers Entered ---");
        for (int i = 0; i < index; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
            total += numbers[i];
        }

        System.out.println("\nTotal sum of numbers = " + total);

        sc.close();
    }
}

