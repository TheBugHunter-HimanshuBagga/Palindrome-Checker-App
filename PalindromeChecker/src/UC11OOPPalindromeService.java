public class UC11OOPPalindromeService {

    // Service class to check palindrome
    static class PalindromeService {

        // Method to check string palindrome
        public boolean isPalindrome(String str) {
            str = str.replaceAll("\\s+", "").toLowerCase();
            int start = 0;
            int end = str.length() - 1;

            while (start < end) {
                if (str.charAt(start) != str.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        PalindromeService service = new PalindromeService();

        String[] testStrings = {
                "Madam",
                "Racecar",
                "Hello",
                "A man a plan a canal Panama"
        };

        for (String s : testStrings) {
            if (service.isPalindrome(s)) {
                System.out.println("\"" + s + "\" is a Palindrome");
            } else {
                System.out.println("\"" + s + "\" is NOT a Palindrome");
            }
        }
    }
}