package com.dsa.assessment.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 01 - StringPalindrome Tests")
class StringPalindromeTest {

    private StringPalindrome stringPalindrome;

    @BeforeEach
    void setUp() {
        stringPalindrome = new StringPalindrome();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should return true for palindrome")
        void shouldReturnTrueForPalindrome() {
            assertTrue(stringPalindrome.isPalindrome("racecar"));
        }

        @Test
        @DisplayName("Should return false for non-palindrome")
        void shouldReturnFalseForNonPalindrome() {
            assertFalse(stringPalindrome.isPalindrome("hello"));
        }

        @Test
        @DisplayName("Should handle empty string")
        void shouldHandleEmptyString() {
            assertTrue(stringPalindrome.isPalindrome(""));
        }

        @Test
        @DisplayName("Should handle single character")
        void shouldHandleSingleCharacter() {
            assertTrue(stringPalindrome.isPalindrome("a"));
        }

        @ParameterizedTest
        @ValueSource(strings = {"madam", "level", "rotor", "civic", "radar"})
        @DisplayName("Should return true for known palindromes")
        void shouldReturnTrueForKnownPalindromes(String input) {
            assertTrue(stringPalindrome.isPalindrome(input));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should be case insensitive")
        void shouldBeCaseInsensitive() {
            assertTrue(stringPalindrome.isPalindrome("RaceCar"));
        }

        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertFalse(stringPalindrome.isPalindrome(null));
        }

        @Test
        @DisplayName("Should handle string with spaces")
        void shouldHandleStringWithSpaces() {
            assertFalse(stringPalindrome.isPalindrome("race car"));
        }

        @Test
        @DisplayName("Should handle two same characters")
        void shouldHandleTwoSameCharacters() {
            assertTrue(stringPalindrome.isPalindrome("aa"));
        }

        @Test
        @DisplayName("Should handle two different characters")
        void shouldHandleTwoDifferentCharacters() {
            assertFalse(stringPalindrome.isPalindrome("ab"));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should return false for almost palindrome")
        void shouldReturnFalseForAlmostPalindrome() {
            assertFalse(stringPalindrome.isPalindrome("racecat"));
        }
    }
}
