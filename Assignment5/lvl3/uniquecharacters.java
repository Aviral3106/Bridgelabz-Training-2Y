package Assignment_5.lvl3;
import java.util.Scanner;

public class uniquecharacters {

    // Method to find length of string without using length()
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // will throw exception when out of range
                count++;
            }
        } catch (Exception e) {
            // end of string reached
        }
        return count;
    }

    // Method to find unique characters
    public static char[] findUniqueChars(String text) {
        int n = getLength(text);
        char[] temp = new char[n]; // temporary array to store unique chars
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            // check with already stored unique characters
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == current) {
                    isUnique = false;
                    break;
                }
            }

            // if unique, store in temp
            if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // create final array with exact size
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    // Method to display result
    public static void display(char[] uniqueChars) {
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] uniqueChars = findUniqueChars(input);
        display(uniqueChars);
    }
}

