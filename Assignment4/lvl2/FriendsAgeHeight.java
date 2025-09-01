package Assignment_4.lvl2;
import java.util.Scanner;

public class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Names of friends
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input ages and heights
        System.out.println("Enter the age and height (in cm) of Amar, Akbar, and Anthony:");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + "'s Age: ");
            ages[i] = sc.nextInt();

            System.out.print(names[i] + "'s Height (cm): ");
            heights[i] = sc.nextDouble();
        }

        // Find youngest (min age)
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Find tallest (max height)
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("\n--- Results ---");
        System.out.println("The youngest friend is " + names[youngestIndex] + " with age " + ages[youngestIndex]);
        System.out.println("The tallest friend is " + names[tallestIndex] + " with height " + heights[tallestIndex] + " cm");

        sc.close();
    }
}

