package Assignment_6.lvl3;
import java.util.Arrays;

public class randomnumbers{

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            // Generate random number between 1000 and 9999
            arr[i] = (int) (Math.random() * 9000) + 1000;
        }
        return arr;
    }

    // Method to find average, min, and max
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        double sum = 0;

        for (int n : numbers) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        double avg = sum / numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        // Generate 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Display numbers
        System.out.println("Generated Numbers: " + Arrays.toString(randomNumbers));

        // Compute average, min, max
        double[] results = findAverageMinMax(randomNumbers);

        // Display results
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}

