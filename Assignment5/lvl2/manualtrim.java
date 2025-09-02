package Assignment_5.lvl2;
import java.util.Scanner;

public class manualtrim {

    // Method to find start and end indices ignoring leading/trailing spaces
    public static int[] trimIndices(String text) {
        int start = 0, end = text.length() - 1;

        // Trim leading spaces
        while (start < text.length() && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= 0 && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring manually using charAt
    public static String makeSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string with spaces: ");
        String text = sc.nextLine();

        // Custom trim
        int[] indices = trimIndices(text);
        String customTrimmed = "";
        if (indices[0] <= indices[1]) { // Valid substring
            customTrimmed = makeSubstring(text, indices[0], indices[1]);
        }

        // Built-in trim
        String builtInTrimmed = text.trim();

        // Compare results
        boolean isSame = compareStrings(customTrimmed, builtInTrimmed);

        // Display
        System.out.println("\nCustom Trimmed String: \"" + customTrimmed + "\"");
        System.out.println("Built-in Trimmed String: \"" + builtInTrimmed + "\"");
        System.out.println("Are both same? " + isSame);

        sc.close();
    }
}
