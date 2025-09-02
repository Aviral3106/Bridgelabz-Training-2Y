package Assignment_5.lvl3;
import java.util.Scanner;

public class BMIcalculator {

    // a. Method to take user input of weight & height (in kg & cm)
    public static double[][] takeInput(int n) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[n][2]; // col[0]=weight, col[1]=height(cm)

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }
        return data;
    }

    // b. Method to calculate BMI and status for each person
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0; // convert cm to m
        double bmi = weight / (heightM * heightM);
        bmi = Math.round(bmi * 100.0) / 100.0; // round to 2 decimals

        String status;
        if (bmi <= 18.4) status = "Underweight";
        else if (bmi <= 24.9) status = "Normal";
        else if (bmi <= 39.9) status = "Overweight";
        else status = "Obese";

        return new String[]{String.valueOf(bmi), status};
    }

    // c. Method to prepare result table (Height, Weight, BMI, Status)
    public static String[][] prepareResults(double[][] input) {
        int n = input.length;
        String[][] results = new String[n][4]; // weight, height, BMI, status

        for (int i = 0; i < n; i++) {
            double weight = input[i][0];
            double height = input[i][1];

            String[] bmiData = calculateBMI(weight, height);

            results[i][0] = String.valueOf(weight);
            results[i][1] = String.valueOf(height);
            results[i][2] = bmiData[0];
            results[i][3] = bmiData[1];
        }
        return results;
    }

    // d. Method to display results in tabular format
    public static void displayResults(String[][] results) {
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        System.out.println("-------------------------------------------------------------");

        for (String[] row : results) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", row[0], row[1], row[2], row[3]);
        }
        System.out.println("-------------------------------------------------------------");
    }

    // e. Main function
    public static void main(String[] args) {
        int n = 10; // Team of 10 members
        double[][] input = takeInput(n);
        String[][] results = prepareResults(input);
        displayResults(results);
    }
}

