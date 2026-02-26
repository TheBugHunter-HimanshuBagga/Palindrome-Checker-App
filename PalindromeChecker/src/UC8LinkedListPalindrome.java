import java.util.LinkedList;

public class UC8LinkedListPalindrome {

    public static void main(String[] args) {
        String input = "madam"; // hardcoded input
        System.out.println("'" + input + "' -> " + isPalindrome(input));
    }

    public static boolean isPalindrome(String s) {
        // Normalize: remove non-alphanumeric characters and lowercase
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        LinkedList<Character> list = new LinkedList<>();
        for (char c : s.toCharArray()) {
            list.add(c);
        }

        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                return false;
            }
        }

        return true;
    }
}