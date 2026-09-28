package com.ronituohino.palindrome.SpecialWord;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.*;

@Execution(ExecutionMode.CONCURRENT)
public class TestAnagramChecker {
    @Test
    public void listenIsAnagram() {
        try {
            AnagramChecker anagramChecker = new AnagramChecker();
            assertTrue(anagramChecker.isValid("listen"));
        } catch (Exception e) {
            assert false;
        }
    }

    @Test
    public void computerIsNotAnagram() {
        try {
            AnagramChecker anagramChecker = new AnagramChecker();
            assertFalse(anagramChecker.isValid("computer"));
        } catch (Exception e) {
            assert false;
        }
    }
}
