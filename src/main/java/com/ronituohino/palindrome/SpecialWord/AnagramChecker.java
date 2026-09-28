package com.ronituohino.palindrome.SpecialWord;

import java.io.*;
import java.util.List;

public class AnagramChecker implements Checker {
    List<String> words;

    public AnagramChecker() throws FileNotFoundException {
        InputStream inputStream = ClassLoader.getSystemResourceAsStream("dictionary.txt");
        InputStreamReader reader = new InputStreamReader(inputStream);

        try {
            words = reader.readAllLines();
        } catch (IOException | OutOfMemoryError _) {
            throw new FileNotFoundException("dictionary.txt not available");
        }
    }

    @Override
    public boolean isValid(String input) {
        String trimmedInput = input.trim();
        CharacterCounter cc1 = new CharacterCounter(trimmedInput);

        for (String word : words) {
            if (word.length() == trimmedInput.length() && !word.equals(trimmedInput)) {
                CharacterCounter cc2 = new CharacterCounter(word);
                if (cc1.equals(cc2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
