package Assignment_5.lvl1;
import java.util.Scanner;

public class uppercasecompare {

    // Method to manually convert text to uppercase using ASCII logic
    public static String manualToUpper(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // If character is lowercase (a-z), convert to uppercase
            if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
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
        String manualUpper = manualToUpper(text);

        // Built-in conversion
        String builtInUpper = text.toUpperCase();

        // Compare
        boolean result = compareStrings(manualUpper, builtInUpper);

        // Display results
        System.out.println("\nManual Uppercase: " + manualUpper);
        System.out.println("Built-in Uppercase: " + builtInUpper);
        System.out.println("Comparison Result: " + result);

        sc.close();
    }
}

