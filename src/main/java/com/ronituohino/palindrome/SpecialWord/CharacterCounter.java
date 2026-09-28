package com.ronituohino.palindrome.SpecialWord;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
    public HashMap<Character, Integer> count;
    public CharacterCounter(String word) {
        count = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!count.containsKey(c)) {
                count.put(c, 1);
            } else {
                count.put(c, count.get(c) + 1);
            }
        }
    }

    @Override
    public boolean equals(Object other) {
        if(this == other) {
            return true;
        }
        if(!(other instanceof CharacterCounter cc)) {
            return false;
        }

        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();

            Integer result = cc.count.get(key);
            if(result == null) {
                return false;
            }
            if(!result.equals(value)) {
                return false;
            }
        }

        return true;
    }
}
