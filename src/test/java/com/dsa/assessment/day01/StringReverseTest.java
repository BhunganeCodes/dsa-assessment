package com.dsa.assessment.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 01 - StringReverse Tests")
class StringReverseTest {

    private StringReverse stringReverse;

    @BeforeEach
    void setUp() {
        stringReverse = new StringReverse();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should reverse string")
        void shouldReverseString() {
            assertEquals("olleh", stringReverse.reverse("hello"));
        }

        @Test
        @DisplayName("Should handle empty string")
        void shouldHandleEmptyString() {
            assertEquals("", stringReverse.reverse(""));
        }

        @Test
        @DisplayName("Should handle single character")
        void shouldHandleSingleCharacter() {
            assertEquals("a", stringReverse.reverse("a"));
        }

        @Test
        @DisplayName("Should handle string with spaces")
        void shouldHandleStringWithSpaces() {
            assertEquals("dlrow olleh", stringReverse.reverse("hello world"));
        }

        @ParameterizedTest
        @ValueSource(strings = {"racecar", "madam", "level", "a", ""})
        @DisplayName("Should return same for palindrome")
        void shouldReturnSameForPalindrome(String input) {
            assertEquals(input, stringReverse.reverse(input));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertNull(stringReverse.reverse(null));
        }

        @Test
        @DisplayName("Should handle special characters")
        void shouldHandleSpecialCharacters() {
            assertEquals("!@#", stringReverse.reverse("#@!"));
        }

        @Test
        @DisplayName("Should handle numbers in string")
        void shouldHandleNumbersInString() {
            assertEquals("321", stringReverse.reverse("123"));
        }

        @Test
        @DisplayName("Should handle unicode characters")
        void shouldHandleUnicodeCharacters() {
            assertEquals("¡¡¡", stringReverse.reverse("¡¡¡"));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not modify original string (strings are immutable)")
        void shouldNotModifyOriginalString() {
            String original = "hello";
            stringReverse.reverse(original);
            assertEquals("hello", original);
        }
    }
}
