package Assignment_5.lvl1;
import java.util.Scanner;

public class stringcompare {
    
    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        // First check if lengths are equal
        if (str1.length() != str2.length()) {
            return false;
        }
        // Compare each character one by one
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // if mismatch found
            }
        }
        return true; // all characters matched
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // Compare using custom method
        boolean manualResult = compareStrings(str1, str2);

        // Compare using built-in equals()
        boolean builtInResult = str1.equals(str2);

        // Display results
        System.out.println("\nManual Comparison (charAt method): " + manualResult);
        System.out.println("Built-in equals() method: " + builtInResult);

        // Verify if both results are same
        if (manualResult == builtInResult) {
            System.out.println("✅ Both methods give the same result.");
        } else {
            System.out.println("❌ Results are different!");
        }

        sc.close();
    }
}

