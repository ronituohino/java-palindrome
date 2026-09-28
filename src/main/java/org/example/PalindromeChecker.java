package org.example;

public class PalindromeChecker {
    private final String input;

    public PalindromeChecker(String s) {
        input = s.trim();
    }

    public boolean isPalindrome() {
        for (int a = 0; a < input.length(); a++) {
            int b = input.length() - 1 - a;
            if (a <= b) {
                char c1 = input.charAt(a);
                char c2 = input.charAt(b);
                if (c1 != c2) {
                    return false;
                }
            } else {
                break;
            }
        }
        return true;
    }
}
