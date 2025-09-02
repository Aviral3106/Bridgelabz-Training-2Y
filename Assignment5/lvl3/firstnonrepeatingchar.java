package Assignment_5.lvl3;
import java.util.Scanner;

public class firstnonrepeatingchar {

    // Method to find first non-repeating character
    public static char findFirstNonRepeating(String text) {
        int[] freq = new int[256]; // ASCII characters
        
        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            freq[c]++;
        }
        
        // Find first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (freq[c] == 1) {
                return c;
            }
        }
        
        return '\0'; // if no non-repeating character found
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        char result = findFirstNonRepeating(input);
        
        if (result == '\0') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("The first non-repeating character is: " + result);
        }
    }
}

