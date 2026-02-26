import java.util.Scanner;

public class UC1PalindromeApp {
    public static boolean isPalindrome(String input) {
        // Convert to lowercase and remove non-alphanumeric characters
        String cleaned = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word or sentence: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}
