package Assignment_5.lvl1;
import java.util.Scanner;

public class substringcompare {

    // Method to create substring manually using charAt()
    public static String manualSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i); // build substring character by character
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input string
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Take start and end index
        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Create substring manually
        String manualSub = manualSubstring(text, start, end);

        // Create substring using built-in method
        String builtInSub = text.substring(start, end);

        // Compare both substrings
        boolean result = compareStrings(manualSub, builtInSub);

        // Display results
        System.out.println("\nManual Substring: " + manualSub);
        System.out.println("Built-in Substring: " + builtInSub);
        System.out.println("Comparison Result: " + result);

        sc.close();
    }
}

