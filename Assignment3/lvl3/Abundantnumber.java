package Assignment_3.lvl3;
import java.util.Scanner;

public class Abundantnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int sum = 0;

        // Run loop to find divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {  // check divisor
                sum += i;          // add divisor to sum
            }
        }

        // Check if sum > number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is NOT an Abundant Number.");
        }

        sc.close();
    }
}

