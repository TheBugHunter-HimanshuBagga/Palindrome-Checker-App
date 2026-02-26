package StrategyPatternUC12;

public class StringReverseStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String input) {
        String normalized = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(normalized).reverse().toString();
        return normalized.equals(reversed);
    }
}
