package Assignment_5.lvl3;
import java.util.Scanner;

public class frequencynestedloops {

    // Method to find frequency of characters using nested loops
    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray(); // Convert string to char array
        int n = chars.length;
        int[] freq = new int[n]; // frequency array

        // Outer loop: for each character
        for (int i = 0; i < n; i++) {
            freq[i] = 1; // initialize frequency to 1

            // Skip already counted characters
            if (chars[i] == '0') {
                continue;
            }

            // Inner loop: check for duplicates
            for (int j = i + 1; j < n; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;      // increment frequency
                    chars[j] = '0'; // mark as counted
                }
            }
        }

        // Create a result array to store "char - frequency"
        String[] result = new String[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') { // ignore duplicates
                result[index] = chars[i] + " - " + freq[i];
                index++;
            }
        }

        // Trim array to valid size
        String[] finalResult = new String[index];
        for (int i = 0; i < index; i++) {
            finalResult[i] = result[i];
        }

        return finalResult;
    }

    // Method to display result
    public static void display(String[] arr) {
        System.out.println("\nCharacter | Frequency");
        System.out.println("---------------------");
        for (String s : arr) {
            String[] parts = s.split(" - ");
            System.out.println("    " + parts[0] + "      |     " + parts[1]);
        }
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[] frequencies = findFrequency(input);

        display(frequencies);
    }
}

