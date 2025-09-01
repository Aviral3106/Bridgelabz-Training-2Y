package Assignment_4.lvl2;
import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for a number
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // Step 2: Handle negative numbers
        if (number < 0) {
            number = -number;
        }

        // Step 3: Extract digits into an array
        String numStr = Long.toString(number);
        int len = numStr.length();
        int[] digits = new int[len];

        for (int i = 0; i < len; i++) {
            digits[i] = numStr.charAt(i) - '0'; // convert char -> digit
        }

        // Step 4: Frequency array for digits 0–9
        int[] frequency = new int[10];
        for (int d : digits) {
            frequency[d]++;
        }

        // Step 5: Display frequencies
        System.out.println("\nDigit frequencies in " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " → " + frequency[i] + " times");
            }
        }

        sc.close();
    }
}
