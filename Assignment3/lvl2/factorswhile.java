package Assignment_3.lvl2;
import java.util.Scanner;

public class factorswhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            System.out.println("Factors of " + number + " are:");
            int i = 1; // counter

            // while loop till counter < number
            while (i <= number) {
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++; // increment
            }
        }

        sc.close();
    }
}

