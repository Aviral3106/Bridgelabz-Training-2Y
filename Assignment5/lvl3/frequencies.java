package Assignment_5.lvl3;
import java.util.Scanner;

public class frequencies {

    // Method to find frequency of characters
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];  // ASCII frequency array

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            freq[c]++;
        }

        // Count how many unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        // Store characters and frequencies in 2D array
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (freq[c] > 0) {
                result[index][0] = String.valueOf(c);
                result[index][1] = String.valueOf(freq[c]);
                freq[c] = 0; // Mark as processed
                index++;
            }
        }

        return result;
    }

    // Method to display results
    public static void display(String[][] arr) {
        System.out.println("\nCharacter | Frequency");
        System.out.println("---------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("    " + arr[i][0] + "      |     " + arr[i][1]);
        }
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] freqTable = findFrequency(input);

        display(freqTable);
    }
}

