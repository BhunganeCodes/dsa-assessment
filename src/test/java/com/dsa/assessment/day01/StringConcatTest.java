package com.dsa.assessment.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 01 - StringConcat Tests")
class StringConcatTest {

    private StringConcat stringConcat;

    @BeforeEach
    void setUp() {
        stringConcat = new StringConcat();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should concatenate strings")
        void shouldConcatenateStrings() {
            String[] input = {"Hello", " ", "World"};
            assertEquals("Hello World", stringConcat.concat(input));
        }

        @Test
        @DisplayName("Should handle empty array")
        void shouldHandleEmptyArray() {
            assertEquals("", stringConcat.concat(new String[]{}));
        }

        @Test
        @DisplayName("Should handle single string")
        void shouldHandleSingleString() {
            String[] input = {"Hello"};
            assertEquals("Hello", stringConcat.concat(input));
        }

        @Test
        @DisplayName("Should concatenate multiple strings")
        void shouldConcatenateMultipleStrings() {
            String[] input = {"a", "b", "c", "d"};
            assertEquals("abcd", stringConcat.concat(input));
        }

        @Test
        @DisplayName("Should handle empty strings in array")
        void shouldHandleEmptyStringsInArray() {
            String[] input = {"a", "", "b", ""};
            assertEquals("ab", stringConcat.concat(input));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null array")
        void shouldHandleNullArray() {
            assertEquals("", stringConcat.concat(null));
        }

        @Test
        @DisplayName("Should handle null elements in array")
        void shouldHandleNullElementsInArray() {
            String[] input = {"a", null, "b"};
            assertDoesNotThrow(() -> stringConcat.concat(input));
        }

        @Test
        @DisplayName("Should handle special characters")
        void shouldHandleSpecialCharacters() {
            String[] input = {"!", "@", "#"};
            assertEquals("!@#", stringConcat.concat(input));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw exception for empty array")
        void shouldNotThrowForEmptyArray() {
            assertDoesNotThrow(() -> stringConcat.concat(new String[]{}));
        }
    }
}
