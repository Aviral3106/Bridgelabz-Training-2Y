package Assignment_4.lvl2;
import java.util.Scanner;

public class BMIcalci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step a: Take input for number of persons
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        // Step b: Create arrays
        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Step c: Input weight and height
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));
            System.out.print("Enter weight (kg): ");
            weights[i] = sc.nextDouble();
            System.out.print("Enter height (meters): ");
            heights[i] = sc.nextDouble();
        }

        // Step d: Calculate BMI and determine status
        for (int i = 0; i < n; i++) {
            bmi[i] = weights[i] / (heights[i] * heights[i]);

            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Step e: Display results
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ": ");
            System.out.println("Height = " + heights[i] + " m");
            System.out.println("Weight = " + weights[i] + " kg");
            System.out.printf("BMI = %.2f\n", bmi[i]);
            System.out.println("Status = " + status[i]);
            System.out.println("----------------------");
        }

        sc.close();
    }
}

