package com.ronituohino.palindrome.SpecialWord;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.*;

@Execution(ExecutionMode.CONCURRENT)
public class TestCharacterCounter {
    @Test
    public void abracadabraHasCorrectCharacters() {
        CharacterCounter cc = new CharacterCounter("abracadabra");
        assertEquals(5, cc.count.get('a'));
        assertEquals(2, cc.count.get('b'));
        assertEquals(1, cc.count.get('c'));
        assertNull(cc.count.get('f'));
    }

    @Test
    public void anagramsHaveSameCharacterCount() {
        CharacterCounter cc1 = new CharacterCounter("silent");
        CharacterCounter cc2 = new CharacterCounter("listen");
        assertEquals(cc1, cc2);
    }

    @Test
    public void petsHaveDifferentCharacterCount() {
        CharacterCounter cc1 = new CharacterCounter("car");
        CharacterCounter cc2 = new CharacterCounter("cat");
        assertNotEquals(cc1, cc2);
    }
}
