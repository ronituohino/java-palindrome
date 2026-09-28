import org.junit.jupiter.api.Test;
import com.ronituohino.palindrome.PalindromeChecker;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.*;

@Execution(ExecutionMode.CONCURRENT)
class TestPalindromeChecker {
    @Test
    void radarIsPalindrome() {
        PalindromeChecker palindromeChecker = new PalindromeChecker("radar");
        assertTrue(palindromeChecker.isPalindrome());
    }

    @Test
    void carIsNotPalindrome() {
        PalindromeChecker palindromeChecker = new PalindromeChecker("car");
        assertFalse(palindromeChecker.isPalindrome());
    }

    @Test
    void saippuakauppiasIsPalindrome() {
        PalindromeChecker palindromeChecker = new PalindromeChecker("saippuakauppias");
        assertTrue(palindromeChecker.isPalindrome());
    }
}
