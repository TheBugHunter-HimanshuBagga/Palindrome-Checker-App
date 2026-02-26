public class UC3PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "level";   // you can change this

        // Reverse using StringBuilder
        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed)) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}