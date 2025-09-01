package Assignment_4.lvl2;
import java.util.Scanner;

public class BMIcalci2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for number of persons
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        // Step 2: Create 2D array [n][3] → weight, height, BMI
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        // Step 3: Take input for weight and height
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            // Weight validation
            double weight;
            do {
                System.out.print("Enter weight (kg): ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("❌ Please enter a positive value for weight!");
                }
            } while (weight <= 0);

            // Height validation
            double height;
            do {
                System.out.print("Enter height (m): ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("❌ Please enter a positive value for height!");
                }
            } while (height <= 0);

            // Store weight and height
            personData[i][0] = weight;
            personData[i][1] = height;

            // Step 4: Calculate BMI
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            // Step 5: Determine weight status
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Step 6: Display results
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Weight = " + personData[i][0] + " kg");
            System.out.println("Height = " + personData[i][1] + " m");
            System.out.printf("BMI = %.2f\n", personData[i][2]);
            System.out.println("Status = " + weightStatus[i]);
            System.out.println("----------------------");
        }

        sc.close();
    }
}
