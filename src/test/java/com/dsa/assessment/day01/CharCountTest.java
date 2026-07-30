package com.dsa.assessment.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 01 - CharCount Tests")
class CharCountTest {

    private CharCount charCount;

    @BeforeEach
    void setUp() {
        charCount = new CharCount();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should count character occurrences")
        void shouldCountCharacterOccurrences() {
            assertEquals(3, charCount.countChar("hello world", 'l'));
        }

        @Test
        @DisplayName("Should return zero for non-existent character")
        void shouldReturnZeroForNonExistent() {
            assertEquals(0, charCount.countChar("hello", 'z'));
        }

        @Test
        @DisplayName("Should handle empty string")
        void shouldHandleEmptyString() {
            assertEquals(0, charCount.countChar("", 'a'));
        }

        @Test
        @DisplayName("Should count all same characters")
        void shouldCountAllSameCharacters() {
            assertEquals(5, charCount.countChar("aaaaa", 'a'));
        }

        @Test
        @DisplayName("Should be case sensitive")
        void shouldBeCaseSensitive() {
            assertEquals(1, charCount.countChar("Hello", 'H'));
            assertEquals(0, charCount.countChar("Hello", 'h'));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null string")
        void shouldHandleNullString() {
            assertEquals(0, charCount.countChar(null, 'a'));
        }

        @Test
        @DisplayName("Should handle special characters")
        void shouldHandleSpecialCharacters() {
            assertEquals(3, charCount.countChar("a!b!c!", '!'));
        }

        @Test
        @DisplayName("Should handle spaces")
        void shouldHandleSpaces() {
            assertEquals(2, charCount.countChar("a b c", ' '));
        }

        @Test
        @DisplayName("Should handle unicode characters")
        void shouldHandleUnicodeCharacters() {
            assertEquals(2, charCount.countChar("caféé", 'é'));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw exception for null input")
        void shouldNotThrowForNullInput() {
            assertDoesNotThrow(() -> charCount.countChar(null, 'a'));
        }
    }
}
