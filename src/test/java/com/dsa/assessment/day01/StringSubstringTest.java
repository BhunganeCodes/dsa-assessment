package com.dsa.assessment.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 01 - StringSubstring Tests")
class StringSubstringTest {

    private StringSubstring stringSubstring;

    @BeforeEach
    void setUp() {
        stringSubstring = new StringSubstring();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should return substring")
        void shouldReturnSubstring() {
            assertEquals("hello", stringSubstring.substring("hello world", 0, 5));
        }

        @Test
        @DisplayName("Should handle full string")
        void shouldHandleFullString() {
            assertEquals("hello", stringSubstring.substring("hello", 0, 5));
        }

        @Test
        @DisplayName("Should handle middle substring")
        void shouldHandleMiddleSubstring() {
            assertEquals("lo wo", stringSubstring.substring("hello world", 3, 8));
        }

        @Test
        @DisplayName("Should handle single character substring")
        void shouldHandleSingleCharacterSubstring() {
            assertEquals("h", stringSubstring.substring("hello", 0, 1));
        }

        @Test
        @DisplayName("Should handle empty substring")
        void shouldHandleEmptySubstring() {
            assertEquals("", stringSubstring.substring("hello", 2, 2));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertNull(stringSubstring.substring(null, 0, 5));
        }

        @Test
        @DisplayName("Should handle equal start and end")
        void shouldHandleEqualStartAndEnd() {
            assertEquals("", stringSubstring.substring("hello", 2, 2));
        }

        @Test
        @DisplayName("Should handle substring at end")
        void shouldHandleSubstringAtEnd() {
            assertEquals("world", stringSubstring.substring("hello world", 6, 11));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid indices")
        void shouldThrowExceptionForInvalidIndices() {
            assertThrows(StringIndexOutOfBoundsException.class,
                () -> stringSubstring.substring("hello", -1, 5));
        }

        @Test
        @DisplayName("Should throw exception for end greater than length")
        void shouldThrowExceptionForEndGreaterThanLength() {
            assertThrows(StringIndexOutOfBoundsException.class,
                () -> stringSubstring.substring("hello", 0, 10));
        }
    }
}
