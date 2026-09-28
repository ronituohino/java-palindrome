package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        PalindromeChecker pc = new PalindromeChecker(word);
        if (pc.isPalindrome()) {
            IO.println("The word is a palindrome.");
        } else {
            IO.println("The word is NOT a palindrome.");
        }
    }
}
