package com.dsa.assessment.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 01 - StringUpperCase Tests")
class StringUpperCaseTest {

    private StringUpperCase stringUpperCase;

    @BeforeEach
    void setUp() {
        stringUpperCase = new StringUpperCase();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should convert to uppercase")
        void shouldConvertToUpperCase() {
            assertEquals("HELLO", stringUpperCase.toUpper("hello"));
        }

        @Test
        @DisplayName("Should handle already uppercase")
        void shouldHandleAlreadyUppercase() {
            assertEquals("HELLO", stringUpperCase.toUpper("HELLO"));
        }

        @Test
        @DisplayName("Should handle mixed case")
        void shouldHandleMixedCase() {
            assertEquals("HELLO WORLD", stringUpperCase.toUpper("HeLLo WoRLd"));
        }

        @Test
        @DisplayName("Should handle empty string")
        void shouldHandleEmptyString() {
            assertEquals("", stringUpperCase.toUpper(""));
        }

        @Test
        @DisplayName("Should handle single character")
        void shouldHandleSingleCharacter() {
            assertEquals("A", stringUpperCase.toUpper("a"));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertNull(stringUpperCase.toUpper(null));
        }

        @Test
        @DisplayName("Should handle numbers (unchanged)")
        void shouldHandleNumbersUnchanged() {
            assertEquals("123", stringUpperCase.toUpper("123"));
        }

        @Test
        @DisplayName("Should handle special characters (unchanged)")
        void shouldHandleSpecialCharactersUnchanged() {
            assertEquals("!@#", stringUpperCase.toUpper("!@#"));
        }

        @Test
        @DisplayName("Should handle spaces")
        void shouldHandleSpaces() {
            assertEquals("A B C", stringUpperCase.toUpper("a b c"));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw exception for null input")
        void shouldNotThrowForNullInput() {
            assertDoesNotThrow(() -> stringUpperCase.toUpper(null));
        }
    }
}
