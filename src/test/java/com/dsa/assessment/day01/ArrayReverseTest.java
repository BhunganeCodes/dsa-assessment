package com.dsa.assessment.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 01 - ArrayReverse Tests")
class ArrayReverseTest {

    private ArrayReverse arrayReverse;

    @BeforeEach
    void setUp() {
        arrayReverse = new ArrayReverse();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should reverse array")
        void shouldReverseArray() {
            int[] input = {1, 2, 3, 4, 5};
            int[] expected = {5, 4, 3, 2, 1};
            assertArrayEquals(expected, arrayReverse.reverse(input));
        }

        @Test
        @DisplayName("Should handle empty array")
        void shouldHandleEmptyArray() {
            int[] input = {};
            assertArrayEquals(new int[]{}, arrayReverse.reverse(input));
        }

        @Test
        @DisplayName("Should handle odd length array")
        void shouldHandleOddLengthArray() {
            int[] input = {1, 2, 3};
            int[] expected = {3, 2, 1};
            assertArrayEquals(expected, arrayReverse.reverse(input));
        }

        @Test
        @DisplayName("Should handle even length array")
        void shouldHandleEvenLengthArray() {
            int[] input = {1, 2, 3, 4};
            int[] expected = {4, 3, 2, 1};
            assertArrayEquals(expected, arrayReverse.reverse(input));
        }

        @Test
        @DisplayName("Should handle two elements")
        void shouldHandleTwoElements() {
            int[] input = {1, 2};
            int[] expected = {2, 1};
            assertArrayEquals(expected, arrayReverse.reverse(input));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertNull(arrayReverse.reverse(null));
        }

        @Test
        @DisplayName("Should handle negative numbers")
        void shouldHandleNegativeNumbers() {
            int[] input = {-1, -2, -3};
            int[] expected = {-3, -2, -1};
            assertArrayEquals(expected, arrayReverse.reverse(input));
        }

        @Test
        @DisplayName("Should handle single element")
        void shouldHandleSingleElement() {
            int[] input = {42};
            assertArrayEquals(new int[]{42}, arrayReverse.reverse(input));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should return new array not same reference")
        void shouldReturnNewArray() {
            int[] input = {1, 2, 3};
            int[] result = arrayReverse.reverse(input);
            assertNotSame(input, result);
        }
    }
}
