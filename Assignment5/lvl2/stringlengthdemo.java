package Assignment_5.lvl2;
import java.util.Scanner;

public class stringlengthdemo {

    // Method to calculate length without using length()
    public static int manualLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // try accessing character
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // when index exceeds string length, exit loop
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input string
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Get length using user-defined method
        int manualLen = manualLength(text);

        // Get length using built-in length()
        int builtInLen = text.length();

        // Display results
        System.out.println("\nManual Length: " + manualLen);
        System.out.println("Built-in Length: " + builtInLen);

        sc.close();
    }
}

