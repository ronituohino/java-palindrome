package com.ronituohino.palindrome.SpecialWord;

public class PalindromeChecker implements Checker {
    @Override
    public boolean isValid(String input) {
        String trimmedInput = input.trim();
        for (int a = 0; a < trimmedInput.length(); a++) {
            int b = trimmedInput.length() - 1 - a;
            if (a <= b) {
                char c1 = trimmedInput.charAt(a);
                char c2 = trimmedInput.charAt(b);
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
