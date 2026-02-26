import java.util.ArrayDeque;
import java.util.Deque;

public class UC7DequePalindrome {

    public static void main(String[] args) {
        String[] testStrings = {
                "racecar",
                "level",
                "A man a plan a canal Panama",
                "hello"
        };

        for (String s : testStrings) {
            System.out.println("'" + s + "' -> " + isPalindrome(s));
        }
    }

    public static boolean isPalindrome(String s) {
        // Normalize: remove non-alphanumeric and lowercase
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        Deque<Character> dq = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            dq.add(c);
        }

        while (dq.size() > 1) {
            if (!dq.pollFirst().equals(dq.pollLast())) {
                return false;
            }
        }
        return true;
    }
}