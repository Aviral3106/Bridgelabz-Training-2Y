package Assignment_5.lvl1;
import java.util.Scanner;

public class illegalargumentdemo {

    // Method to generate IllegalArgumentException (without handling)
    public static void generateException(String text) {
        // Start index > End index → will throw IllegalArgumentException
        System.out.println("Substring: " + text.substring(5, 2));
    }

    // Method to handle IllegalArgumentException with try-catch
    public static void handleException(String text) {
        try {
            System.out.println("Substring: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("⚠️ Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("⚠️ Caught RuntimeException: " + e.getMessage());
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

