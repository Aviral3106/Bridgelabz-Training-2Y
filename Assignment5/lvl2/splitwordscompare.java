package Assignment_5.lvl2;
import java.util.Scanner;

public class splitwordscompare {

    // Method to find string length without using length()
    public static int manualLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // exit when index goes out of bounds
        }
        return count;
    }

    // Method to split text into words manually
    public static String[] manualSplit(String text) {
        int len = manualLength(text);

        // Step 1: Count spaces → number of words = spaces + 1
        int spaceCount = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        // Step 2: Store space indexes
        int[] spaceIndexes = new int[spaceCount];
        int idx = 0;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }

        // Step 3: Extract words
        String[] words = new String[spaceCount + 1];
        int start = 0;
        int wordIdx = 0;

        for (int i = 0; i < spaceCount; i++) {
            int end = spaceIndexes[i];
            words[wordIdx++] = extractWord(text, start, end);
            start = end + 1;
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

    // Method to compare two String arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    // Helper: print array
    public static void printArray(String[] arr) {
        for (String s : arr) {
            System.out.print(s + " | ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take full text input
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Manual split
        String[] manualWords = manualSplit(text);

        // Built-in split
        String[] builtInWords = text.split(" ");

        // Compare
        boolean result = compareArrays(manualWords, builtInWords);

        // Display results
        System.out.print("\nManual Split: ");
        printArray(manualWords);

        System.out.print("Built-in Split: ");
        printArray(builtInWords);

        System.out.println("Comparison Result: " + result);

        sc.close();
    }
}

