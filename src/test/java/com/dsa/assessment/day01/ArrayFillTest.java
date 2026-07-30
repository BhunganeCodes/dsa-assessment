package com.dsa.assessment.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 01 - ArrayFill Tests")
class ArrayFillTest {

    private ArrayFill arrayFill;

    @BeforeEach
    void setUp() {
        arrayFill = new ArrayFill();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should fill array with value")
        void shouldFillArrayWithValue() {
            int[] result = arrayFill.fill(5, 10);
            assertArrayEquals(new int[]{10, 10, 10, 10, 10}, result);
        }

        @Test
        @DisplayName("Should handle zero size")
        void shouldHandleZeroSize() {
            assertArrayEquals(new int[]{}, arrayFill.fill(0, 10));
        }

        @Test
        @DisplayName("Should fill with zero")
        void shouldFillWithZero() {
            int[] result = arrayFill.fill(3, 0);
            assertArrayEquals(new int[]{0, 0, 0}, result);
        }

        @Test
        @DisplayName("Should fill with negative value")
        void shouldFillWithNegativeValue() {
            int[] result = arrayFill.fill(4, -5);
            assertArrayEquals(new int[]{-5, -5, -5, -5}, result);
        }

        @Test
        @DisplayName("Should fill single element")
        void shouldFillSingleElement() {
            int[] result = arrayFill.fill(1, 100);
            assertArrayEquals(new int[]{100}, result);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle large size")
        void shouldHandleLargeSize() {
            int[] result = arrayFill.fill(1000, 1);
            assertEquals(1000, result.length);
            for (int val : result) {
                assertEquals(1, val);
            }
        }

        @Test
        @DisplayName("Should fill with Integer.MAX_VALUE")
        void shouldFillWithMaxValue() {
            int[] result = arrayFill.fill(3, Integer.MAX_VALUE);
            for (int val : result) {
                assertEquals(Integer.MAX_VALUE, val);
            }
        }

        @Test
        @DisplayName("Should fill with Integer.MIN_VALUE")
        void shouldFillWithMinValue() {
            int[] result = arrayFill.fill(3, Integer.MIN_VALUE);
            for (int val : result) {
                assertEquals(Integer.MIN_VALUE, val);
            }
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for negative size")
        void shouldThrowExceptionForNegativeSize() {
            assertThrows(IllegalArgumentException.class, () -> arrayFill.fill(-1, 10));
        }
    }
}
