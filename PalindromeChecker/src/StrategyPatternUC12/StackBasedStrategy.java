package StrategyPatternUC12;

import java.util.Stack;

public class StackBasedStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String input) {
        String normalized = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : normalized.toCharArray()) stack.push(c);
        for (char c : normalized.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}