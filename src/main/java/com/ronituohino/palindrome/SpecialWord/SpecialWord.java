package com.ronituohino.palindrome.SpecialWord;

import java.io.FileNotFoundException;

public class SpecialWord {
    Checker[] checkers;
    public SpecialWord() throws Exception {
        checkers = new Checker[]{new AnagramChecker(), new PalindromeChecker()};
    }

    public boolean isSpecialWord(String word) {
        for (Checker checker : checkers) {
            if(checker.isValid(word)) {
                return true;
            }
        }
        return false;
    }
}
