package Assignment_4;
import java.util.Scanner;

public class tablerange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number to print its multiplication table (from 6 to 9): ");
        int number = sc.nextInt();

        // Define array to store results from 6 to 9 (4 elements)
        int[] multiplicationResult = new int[4];

        // Generate multiplication table for 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;  // store results
        }

        // Display results
        System.out.println("\n--- Multiplication Table of " + number + " (from 6 to 9) ---");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        sc.close();
    }
}

