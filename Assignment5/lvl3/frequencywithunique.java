package Assignment_5.lvl3;
import java.util.Scanner;

public class frequencywithunique {

    // Method to find unique characters in the text
    public static char[] uniqueCharacters(String text) {
        int n = text.length();
        char[] uniqueArr = new char[n]; // max possible size = length of text
        int uniqueCount = 0;

        // Outer loop to check each character
        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            boolean isUnique = true;

            // Check if 'c' is already stored in uniqueArr
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueArr[j] == c) {
                    isUnique = false;
                    break;
                }
            }

            // If not found before, add to uniqueArr
            if (isUnique) {
                uniqueArr[uniqueCount] = c;
                uniqueCount++;
            }
        }

        // Create exact-sized array for unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueArr[i];
        }

        return result;
    }

    // Method to find frequency of characters using unique characters
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256]; // ASCII frequency table

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            freq[c]++;
        }

        // Get unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // Store results in 2D String array
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return result;
    }

    // Display result
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


