package Assignment_5.lvl1;
import java.util.Scanner;

public class lowercasecompare {

    // Method to manually convert text to lowercase using ASCII logic
    public static String manualToLower(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // If character is uppercase (A-Z), convert to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32);
            } else {
                result += ch; // keep other characters unchanged
            }
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

        // Take complete text input
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Manual conversion
        String manualLower = manualToLower(text);

        // Built-in conversion
        String builtInLower = text.toLowerCase();

        // Compare results
        boolean result = compareStrings(manualLower, builtInLower);

        // Display results
        System.out.println("\nManual Lowercase: " + manualLower);
        System.out.println("Built-in Lowercase: " + builtInLower);
        System.out.println("Comparison Result: " + result);

        sc.close();
    }
}

