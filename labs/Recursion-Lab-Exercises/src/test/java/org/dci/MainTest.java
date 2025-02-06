package org.dci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void testCountDigits() {
        assertEquals(5, Main.countDigits(12345));
        assertEquals(1, Main.countDigits(7));
        assertEquals(9, Main.countDigits(987654321));

    }

    @Test
    void testIsPalindrome() {
        assertTrue(Main.isPalindrome("racecar"));
        assertFalse(Main.isPalindrome("hello"));
        assertTrue(Main.isPalindrome("madam"));
    }


    @Test
    void testsumOfDigits() {
        assertEquals(6, Main.sumOfDigits(123));
        assertEquals(30, Main.sumOfDigits(9876));
        assertEquals(5, Main.sumOfDigits(5));
    }

    @Test
    void testOccurrences() {
        assertEquals(3, Main.countOccurrences("banana", 'a'));
        assertEquals(2, Main.countOccurrences("recursion", 'r'));
        assertEquals(0, Main.countOccurrences("hello", 'z'));
    }

    @Test
    void testRemoveDuplicateCharacters() {
        assertEquals("abcd", Main.removeDuplicates("aaabbcddd"));
        Main.clearSet();
        assertEquals("helo", Main.removeDuplicates("hello"));
        Main.clearSet();
        assertEquals("abc", Main.removeDuplicates("aabbcc"));
    }

}