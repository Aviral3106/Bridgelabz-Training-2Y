package Assignment_3.lvl2;
import java.util.Scanner;

public class oddevennumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Check for natural number
        if (number <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
        } else {
            // Iterate from 1 to number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an Even number");
                } else {
                    System.out.println(i + " is an Odd number");
                }
            }
        }

        sc.close();
    }
}

