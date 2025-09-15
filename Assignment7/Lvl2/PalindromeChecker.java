
class PalindromeChecker {
    String text;

    // method to check palindrome
    public boolean isPalindrome() {
        String cleanText = text.replaceAll("\\s+", "").toLowerCase();
        int left = 0, right = cleanText.length() - 1;
        while (left < right) {
            if (cleanText.charAt(left) != cleanText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // method to display result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a Palindrome.");
        } else {
            System.out.println(text + " is NOT a Palindrome.");
        }
    }

    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker();
        p1.text = "madam";
        p1.displayResult();

        PalindromeChecker p2 = new PalindromeChecker();
        p2.text = "hello";
        p2.displayResult();
    }
}
