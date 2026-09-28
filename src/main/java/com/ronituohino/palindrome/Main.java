package com.ronituohino.palindrome;

import com.ronituohino.palindrome.SpecialWord.PalindromeChecker;
import com.ronituohino.palindrome.SpecialWord.SpecialWord;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        try {
            SpecialWord specialWord = new SpecialWord();
            if (specialWord.isSpecialWord(word)) {
                IO.println("The word is very special!");
            } else {
                IO.println("The word is not special at all.");
            }
        }  catch (Exception e) {}
    }
}
