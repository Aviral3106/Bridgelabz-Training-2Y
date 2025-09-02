package Assignment_5.lvl2;
import java.util.Scanner;

public class splitwordswithlength {

    // Method to find string length without using length()
    public static int manualLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // if out of bound, throws exception
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // stop counting
        }
        return count;
    }

    // Method to split text into words manually
    public static String[] manualSplit(String text) {
        int len = manualLength(text);

        // Count spaces -> number of words = spaces + 1
        int spaceCount = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        String[] words = new String[spaceCount + 1];
        int start = 0, wordIdx = 0;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIdx++] = extractWord(text, start, i);
                start = i + 1;
            }
        }

        // Last word after last space
        words[wordIdx] = extractWord(text, start, len);

        return words;
    }

    // Helper: Extract substring manually
    private static String extractWord(String text, int start, int end) {
        String word = "";
        for (int i = start; i < end; i++) {
            word += text.charAt(i);
        }
        return word;
    }

    // Method to create a 2D array: word + its length
    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];  // word
            result[i][1] = String.valueOf(manualLength(words[i])); // length as String
        }
        return result;
    }

    // Display in tabular format
    public static void displayTable(String[][] wordTable) {
        System.out.printf("%-15s %-10s%n", "Word", "Length");
        System.out.println("-------------------------");

        for (int i = 0; i < wordTable.length; i++) {
            String word = wordTable[i][0];
            int length = Integer.parseInt(wordTable[i][1]); // convert back to int
            System.out.printf("%-15s %-10d%n", word, length);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input text
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Split into words
        String[] words = manualSplit(text);

        // Create word-length table
        String[][] wordTable = wordsWithLength(words);

        // Display
        displayTable(wordTable);

        sc.close();
    }
}

