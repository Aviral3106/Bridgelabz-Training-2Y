package Assignment_5.lvl2;
import java.util.Scanner;

public class shortestlongestword {

    // Method to find string length without using length()
    public static int manualLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // throws exception when out of bound
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

        // Count spaces → number of words = spaces + 1
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

        // Last word
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

    // Method to create 2D array → word + its length
    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(manualLength(words[i]));
        }
        return result;
    }

    // Method to find shortest and longest word indexes
    public static int[] findShortestLongest(String[][] wordTable) {
        int minIndex = 0, maxIndex = 0;

        for (int i = 1; i < wordTable.length; i++) {
            int len = Integer.parseInt(wordTable[i][1]);
            int minLen = Integer.parseInt(wordTable[minIndex][1]);
            int maxLen = Integer.parseInt(wordTable[maxIndex][1]);

            if (len < minLen) {
                minIndex = i;
            }
            if (len > maxLen) {
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    // Display table of words
    public static void displayTable(String[][] wordTable) {
        System.out.printf("%-15s %-10s%n", "Word", "Length");
        System.out.println("-------------------------");

        for (int i = 0; i < wordTable.length; i++) {
            String word = wordTable[i][0];
            int length = Integer.parseInt(wordTable[i][1]);
            System.out.printf("%-15s %-10d%n", word, length);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Split
        String[] words = manualSplit(text);

        // Word + Length 2D array
        String[][] wordTable = wordsWithLength(words);

        // Display words with lengths
        displayTable(wordTable);

        // Find shortest & longest
        int[] results = findShortestLongest(wordTable);

        // Show results
        System.out.println("\nShortest word: " + wordTable[results[0]][0] +
                " (Length = " + wordTable[results[0]][1] + ")");
        System.out.println("Longest word : " + wordTable[results[1]][0] +
                " (Length = " + wordTable[results[1]][1] + ")");

        sc.close();
    }
}
