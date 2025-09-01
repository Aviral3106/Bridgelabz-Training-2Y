package Assignment_4;
import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number to print its multiplication table: ");
        int number = sc.nextInt();

        // Define array to store results from 1 to 10
        int[] table = new int[10];

        // Store results in the array
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Display the multiplication table
        System.out.println("\n--- Multiplication Table of " + number + " ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        sc.close();
    }
}
