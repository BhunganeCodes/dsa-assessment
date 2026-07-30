package com.dsa.assessment.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 01 - ArrayMin Tests")
class ArrayMinTest {

    private ArrayMin arrayMin;

    @BeforeEach
    void setUp() {
        arrayMin = new ArrayMin();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should find minimum in array")
        void shouldFindMinimumInArray() {
            int[] input = {3, 7, 2, 9, 1};
            assertEquals(1, arrayMin.findMin(input));
        }

        @Test
        @DisplayName("Should handle negative numbers")
        void shouldHandleNegativeNumbers() {
            int[] input = {-5, -2, -8, -1};
            assertEquals(-8, arrayMin.findMin(input));
        }

        @Test
        @DisplayName("Should handle single element")
        void shouldHandleSingleElement() {
            int[] input = {100};
            assertEquals(100, arrayMin.findMin(input));
        }

        @Test
        @DisplayName("Should find min at first position")
        void shouldFindMinAtFirstPosition() {
            int[] input = {1, 50, 100, 200};
            assertEquals(1, arrayMin.findMin(input));
        }

        @Test
        @DisplayName("Should find min at last position")
        void shouldFindMinAtLastPosition() {
            int[] input = {200, 100, 50, 1};
            assertEquals(1, arrayMin.findMin(input));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> arrayMin.findMin(null));
        }

        @Test
        @DisplayName("Should handle empty array")
        void shouldHandleEmptyArray() {
            assertDoesNotThrow(() -> arrayMin.findMin(new int[]{}));
        }

        @Test
        @DisplayName("Should handle duplicate min values")
        void shouldHandleDuplicateMinValues() {
            int[] input = {5, 5, 5, 5};
            assertEquals(5, arrayMin.findMin(input));
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
            arrayMin.findMin(input);
            assertArrayEquals(original, input);
        }
    }
}
