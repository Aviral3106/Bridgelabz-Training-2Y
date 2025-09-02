package Assignment_5.lvl1;
import java.util.Scanner;

public class numberformatdemo {

    // Method to generate NumberFormatException (without handling)
    public static void generateException(String text) {
        // Try converting text to integer directly
        int number = Integer.parseInt(text); 
        System.out.println("Converted Number: " + number);
    }

    // Method to handle NumberFormatException with try-catch
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text); 
            System.out.println("Converted Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("⚠️ Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("⚠️ Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input string from user
        System.out.print("Enter a string (try entering letters like 'abc'): ");
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

