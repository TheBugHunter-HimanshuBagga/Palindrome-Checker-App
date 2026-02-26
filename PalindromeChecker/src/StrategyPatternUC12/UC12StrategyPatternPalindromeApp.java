package StrategyPatternUC12;

public class UC12StrategyPatternPalindromeApp {

    public static void main(String[] args) {

        String testString = "A man a plan a canal Panama";

        // Using String Reverse strategy
        PalindromeContext context = new PalindromeContext(new StringReverseStrategy());
        System.out.println("Using String Reverse: " + context.executeStrategy(testString));

        // Using Stack strategy
        context.setStrategy(new StackBasedStrategy());
        System.out.println("Using Stack: " + context.executeStrategy(testString));

        // You can add more strategies later (Deque, LinkedList, etc.)
    }
}