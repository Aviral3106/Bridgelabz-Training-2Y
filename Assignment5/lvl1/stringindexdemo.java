package Assignment_5.lvl1;
import java.util.Scanner;

public class stringindexdemo {

    // Method to generate StringIndexOutOfBoundsException (without handling)
    public static void generateException(String text) {
        // Accessing index beyond string length
        System.out.println("Character at position " + text.length() + ": " + text.charAt(text.length()));
    }

    // Method to handle StringIndexOutOfBoundsException with try-catch
    public static void handleException(String text) {
        try {
            System.out.println("Character at position " + text.length() + ": " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("⚠️ Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input string from user
        System.out.print("Enter a string: ");
        String text = sc.next();

        // First call the method that generates the exception
        System.out.println("\n---- Generating Exception ----");
        try {
            generateException(text);
        } catch (Exception e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        // Now call the method that handles the exception
        System.out.println("\n---- Handling Exception ----");
        handleException(text);

        sc.close();
    }
}

