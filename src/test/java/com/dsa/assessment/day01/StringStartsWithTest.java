package com.dsa.assessment.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 01 - StringStartsWith Tests")
class StringStartsWithTest {

    private StringStartsWith stringStartsWith;

    @BeforeEach
    void setUp() {
        stringStartsWith = new StringStartsWith();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should return true for matching prefix")
        void shouldReturnTrueForMatchingPrefix() {
            assertTrue(stringStartsWith.startsWith("hello world", "hello"));
        }

        @Test
        @DisplayName("Should return false for non-matching prefix")
        void shouldReturnFalseForNonMatchingPrefix() {
            assertFalse(stringStartsWith.startsWith("hello world", "world"));
        }

        @Test
        @DisplayName("Should return true for empty prefix")
        void shouldReturnTrueForEmptyPrefix() {
            assertTrue(stringStartsWith.startsWith("hello", ""));
        }

        @Test
        @DisplayName("Should return true for full string match")
        void shouldReturnTrueForFullStringMatch() {
            assertTrue(stringStartsWith.startsWith("hello", "hello"));
        }

        @Test
        @DisplayName("Should return false for prefix longer than string")
        void shouldReturnFalseForPrefixLongerThanString() {
            assertFalse(stringStartsWith.startsWith("hi", "hello"));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null string")
        void shouldHandleNullString() {
            assertFalse(stringStartsWith.startsWith(null, "hello"));
        }

        @Test
        @DisplayName("Should handle null prefix")
        void shouldHandleNullPrefix() {
            assertFalse(stringStartsWith.startsWith("hello", null));
        }

        @Test
        @DisplayName("Should handle both null")
        void shouldHandleBothNull() {
            assertFalse(stringStartsWith.startsWith(null, null));
        }

        @Test
        @DisplayName("Should be case sensitive")
        void shouldBeCaseSensitive() {
            assertFalse(stringStartsWith.startsWith("Hello", "hello"));
        }

        @Test
        @DisplayName("Should handle empty string with empty prefix")
        void shouldHandleEmptyStringWithEmptyPrefix() {
            assertTrue(stringStartsWith.startsWith("", ""));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw exception for null inputs")
        void shouldNotThrowForNullInputs() {
            assertDoesNotThrow(() -> stringStartsWith.startsWith(null, null));
        }
    }
}
