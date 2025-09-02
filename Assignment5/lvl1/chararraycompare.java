package Assignment_5.lvl1;
import java.util.Scanner;

public class chararraycompare {

    // User-defined method to convert String to char array (without using toCharArray)
    public static char[] manualToCharArray(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i); // extract each character
        }
        return chars;
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    // Helper method to print char array nicely
    public static void printCharArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take string input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Convert manually
        char[] manualChars = manualToCharArray(text);

        // Convert using built-in method
        char[] builtInChars = text.toCharArray();

        // Compare both arrays
        boolean result = compareCharArrays(manualChars, builtInChars);

        // Display results
        System.out.print("\nManual Char Array: ");
        printCharArray(manualChars);

        System.out.print("Built-in Char Array: ");
        printCharArray(builtInChars);

        System.out.println("Comparison Result: " + result);

        sc.close();
    }
}

