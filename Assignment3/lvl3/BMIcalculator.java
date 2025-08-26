package Assignment_3.lvl3;
import java.util.Scanner;

public class BMIcalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take user input
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        // Convert height from cm to meters
        double heightM = heightCm / 100;

        // b. Calculate BMI
        double bmi = weight / (heightM * heightM);

        // c. Determine BMI Status
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Output
        System.out.printf("\nYour BMI is: %.2f\n", bmi);
        System.out.println("Weight Status: " + status);

        sc.close();
    }
}

