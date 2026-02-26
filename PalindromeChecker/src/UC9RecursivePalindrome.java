public class UC9RecursivePalindrome {

    // Recursive method to check palindrome
    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true; // Base case: all characters checked
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String input = "level"; // hardcoded input

        if (isPalindrome(input, 0, input.length() - 1)) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}