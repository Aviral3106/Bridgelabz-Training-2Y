package Assignment_5.lvl3;
import java.util.Scanner;

public class palindromecheck {

    // Logic 1: Iterative method
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false; // not palindrome
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true; // base case
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false; // not palindrome
        }
        return isPalindromeRecursive(text, start + 1, end - 1); // recursive call
    }

    // Method to reverse string using charAt
    public static char[] reverseString(String text) {
        int n = text.length();
        char[] reversed = new char[n];

        for (int i = 0; i < n; i++) {
            reversed[i] = text.charAt(n - 1 - i);
        }
        return reversed;
    }

    // Logic 3: Array method
    public static boolean isPalindromeArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        // Normalize input (optional: ignore spaces and case)
        String text = input.replaceAll("\\s+", "").toLowerCase();

        System.out.println("\n--- Palindrome Check Results ---");
        System.out.println("Logic 1 (Iterative): " + isPalindromeIterative(text));
        System.out.println("Logic 2 (Recursive): " + isPalindromeRecursive(text, 0, text.length() - 1));
        System.out.println("Logic 3 (Array): " + isPalindromeArray(text));
    }
}

