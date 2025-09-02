package Assignment_5.lvl1;
import java.util.Scanner;

public class arrayindexdemo {

    // Method to generate ArrayIndexOutOfBoundsException (without handling)
    public static void generateException(String[] names) {
        // Access index beyond array length
        System.out.println("Accessing invalid index: " + names[names.length]);
    }

    // Method to handle ArrayIndexOutOfBoundsException with try-catch
    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing invalid index: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("⚠️ Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("⚠️ Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size
        System.out.print("Enter number of names: ");
        int size = sc.nextInt();
        sc.nextLine(); // consume newline

        // Take names input
        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        // First call the method that generates the exception
        System.out.println("\n---- Generating Exception ----");
        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        // Now call the method that handles the exception
        System.out.println("\n---- Handling Exception ----");
        handleException(names);

        sc.close();
    }
}

