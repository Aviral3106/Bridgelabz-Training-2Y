package Assignment_3.lvl1;
import java.util.Scanner;

public class rocketcountdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for countdown start
        System.out.print("Enter the countdown starting number: ");
        int counter = sc.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrement
        }

        System.out.println("🚀 Launch!");
        sc.close();
    }
}

