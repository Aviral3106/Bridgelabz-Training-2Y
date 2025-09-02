package Assignment_5.lvl2;
import java.util.Scanner;

public class vowelconsonanttype {

    // Method to check type of character
    public static String checkCharType(char ch) {
        // If uppercase, convert to lowercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check vowels
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }

        // Check consonants
        if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }

        // Otherwise
        return "Not a Letter";
    }

    // Method to analyze string and return 2D array
    public static String[][] findCharTypes(String text) {
        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);       // character
            result[i][1] = checkCharType(ch);        // type
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void display2DArray(String[][] arr) {
        System.out.printf("%-10s%-15s\n", "Character", "Type");
        System.out.println("-------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-10s%-15s\n", arr[i][0], arr[i][1]);
        }
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Get character types
        String[][] result = findCharTypes(text);

        // Display result
        display2DArray(result);

        sc.close();
    }
}

