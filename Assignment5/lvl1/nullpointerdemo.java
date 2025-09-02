package Assignment_5.lvl1;
public class nullpointerdemo {

    // Method to generate NullPointerException (without handling)
    public static void generateException() {
        String text = null; // null reference
        // This will throw NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    // Method to handle NullPointerException with try-catch
    public static void handleException() {
        String text = null; // null reference

        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("⚠️ Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // First call the method that generates the exception
        System.out.println("---- Generating Exception ----");
        try {
            generateException();
        } catch (Exception e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        // Now call the method that handles the exception
        System.out.println("\n---- Handling Exception ----");
        handleException();
    }
}

