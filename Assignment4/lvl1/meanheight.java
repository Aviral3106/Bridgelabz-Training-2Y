package Assignment_4;
import java.util.Scanner;

public class meanheight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] heights = new double[11];  // array of size 11
        double sum = 0.0;

        // Taking input
        System.out.println("Enter the heights of 11 players (in cm):");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i];  // add to sum directly
        }

        // Calculate mean
        double mean = sum / heights.length;

        // Display result
        System.out.println("\nMean height of the football team = " + mean + " cm");

        sc.close();
    }
}

