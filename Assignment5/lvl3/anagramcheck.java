package Assignment_5.lvl3;
import java.util.Scanner;

public class anagramcheck {

    // Method to check if two texts are anagrams
    public static boolean isAnagram(String text1, String text2) {
        // If lengths are not equal, they cannot be anagrams
        if (text1.length() != text2.length()) {
            return false;
        }

        // Arrays to store character frequencies (ASCII size = 256)
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        // Count frequencies for text1
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
        }

        // Count frequencies for text2
        for (int i = 0; i < text2.length(); i++) {
            freq2[text2.charAt(i)]++;
        }

        // Compare frequencies
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();

        // Normalize input (ignore spaces and case)
        text1 = text1.replaceAll("\\s+", "").toLowerCase();
        text2 = text2.replaceAll("\\s+", "").toLowerCase();

        if (isAnagram(text1, text2)) {
            System.out.println("\nThe two texts are Anagrams.");
        } else {
            System.out.println("\nThe two texts are NOT Anagrams.");
        }
    }
}

