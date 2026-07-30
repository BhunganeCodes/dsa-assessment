package com.dsa.assessment.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 01 - ArraySum Tests")
class ArraySumTest {

    private ArraySum arraySum;

    @BeforeEach
    void setUp() {
        arraySum = new ArraySum();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should return sum of positive numbers")
        void shouldReturnSumOfPositiveNumbers() {
            int[] input = {1, 2, 3, 4, 5};
            assertEquals(15, arraySum.sum(input));
        }

        @Test
        @DisplayName("Should return sum with negative numbers")
        void shouldReturnSumWithNegativeNumbers() {
            int[] input = {-1, 2, -3, 4, -5};
            assertEquals(-3, arraySum.sum(input));
        }

        @Test
        @DisplayName("Should return zero for empty array")
        void shouldReturnZeroForEmptyArray() {
            int[] input = {};
            assertEquals(0, arraySum.sum(input));
        }

        @Test
        @DisplayName("Should return single element")
        void shouldReturnSingleElement() {
            int[] input = {42};
            assertEquals(42, arraySum.sum(input));
        }

        @ParameterizedTest
        @CsvSource({
            "1, 2, 3, 6",
            "10, 20, 30, 60",
            "100, 200, 300, 600"
        })
        @DisplayName("Should calculate sum for various inputs")
        void shouldCalculateSumForVariousInputs(int a, int b, int c, int expected) {
            assertEquals(expected, arraySum.sum(new int[]{a, b, c}));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertEquals(0, arraySum.sum(null));
        }

        @Test
        @DisplayName("Should handle zero values")
        void shouldHandleZeroValues() {
            int[] input = {0, 0, 0, 0};
            assertEquals(0, arraySum.sum(input));
        }

        @Test
        @DisplayName("Should handle large numbers")
        void shouldHandleLargeNumbers() {
            int[] input = {Integer.MAX_VALUE, 0, 0};
            assertEquals(Integer.MAX_VALUE, arraySum.sum(input));
        }

        @Test
        @DisplayName("Should handle single negative number")
        void shouldHandleSingleNegativeNumber() {
            int[] input = {-100};
            assertEquals(-100, arraySum.sum(input));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw exception for null input")
        void shouldNotThrowForNullInput() {
            assertDoesNotThrow(() -> arraySum.sum(null));
        }

        @Test
        @DisplayName("Should not throw exception for empty array")
        void shouldNotThrowForEmptyArray() {
            assertDoesNotThrow(() -> arraySum.sum(new int[]{}));
        }
    }
}
