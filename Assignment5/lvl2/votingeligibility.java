package Assignment_5.lvl2;
import java.util.Scanner;
import java.util.Random;

public class votingeligibility {

    // Method to generate random 2-digit ages
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10; // random 2-digit age (10–99)
        }
        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);

            if (age < 0) {
                result[i][1] = "false"; // invalid negative age
            } else if (age >= 18) {
                result[i][1] = "true"; // eligible
            } else {
                result[i][1] = "false"; // underage
            }
        }
        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayResults(String[][] data) {
        System.out.println("\nAge\tCan Vote?");
        System.out.println("-------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number of students input
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Generate random ages
        int[] ages = generateAges(n);

        // Check eligibility
        String[][] eligibility = checkVotingEligibility(ages);

        // Display result
        displayResults(eligibility);

        sc.close();
    }
}

