package com.dsa.assessment.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 01 - ArrayMax Tests")
class ArrayMaxTest {

    private ArrayMax arrayMax;

    @BeforeEach
    void setUp() {
        arrayMax = new ArrayMax();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should find maximum in array")
        void shouldFindMaximumInArray() {
            int[] input = {3, 7, 2, 9, 1};
            assertEquals(9, arrayMax.findMax(input));
        }

        @Test
        @DisplayName("Should handle negative numbers")
        void shouldHandleNegativeNumbers() {
            int[] input = {-5, -2, -8, -1};
            assertEquals(-1, arrayMax.findMax(input));
        }

        @Test
        @DisplayName("Should handle single element")
        void shouldHandleSingleElement() {
            int[] input = {100};
            assertEquals(100, arrayMax.findMax(input));
        }

        @Test
        @DisplayName("Should find max at first position")
        void shouldFindMaxAtFirstPosition() {
            int[] input = {99, 1, 2, 3};
            assertEquals(99, arrayMax.findMax(input));
        }

        @Test
        @DisplayName("Should find max at last position")
        void shouldFindMaxAtLastPosition() {
            int[] input = {1, 2, 3, 99};
            assertEquals(99, arrayMax.findMax(input));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> arrayMax.findMax(null));
        }

        @Test
        @DisplayName("Should handle empty array")
        void shouldHandleEmptyArray() {
            assertDoesNotThrow(() -> arrayMax.findMax(new int[]{}));
        }

        @Test
        @DisplayName("Should handle duplicate max values")
        void shouldHandleDuplicateMaxValues() {
            int[] input = {5, 5, 5, 5};
            assertEquals(5, arrayMax.findMax(input));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not modify original array")
        void shouldNotModifyOriginalArray() {
            int[] input = {3, 7, 2, 9, 1};
            int[] original = input.clone();
            arrayMax.findMax(input);
            assertArrayEquals(original, input);
        }
    }
}
