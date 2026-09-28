package com.ronituohino.palindrome.SpecialWord;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.*;

@Execution(ExecutionMode.CONCURRENT)
class TestPalindromeChecker {
    @Test
    void radarIsPalindrome() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        assertTrue(palindromeChecker.isValid("radar"));
    }

    @Test
    void carIsNotPalindrome() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        assertFalse(palindromeChecker.isValid("car"));
    }

    @Test
    void saippuakauppiasIsPalindrome() {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        assertTrue(palindromeChecker.isValid("saippuakauppias"));
    }
}
