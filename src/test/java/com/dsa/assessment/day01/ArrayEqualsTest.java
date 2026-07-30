package com.dsa.assessment.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 01 - ArrayEquals Tests")
class ArrayEqualsTest {

    private ArrayEquals arrayEquals;

    @BeforeEach
    void setUp() {
        arrayEquals = new ArrayEquals();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should return true for equal arrays")
        void shouldReturnTrueForEqualArrays() {
            int[] arr1 = {1, 2, 3};
            int[] arr2 = {1, 2, 3};
            assertTrue(arrayEquals.equals(arr1, arr2));
        }

        @Test
        @DisplayName("Should return false for different arrays")
        void shouldReturnFalseForDifferentArrays() {
            int[] arr1 = {1, 2, 3};
            int[] arr2 = {1, 2, 4};
            assertFalse(arrayEquals.equals(arr1, arr2));
        }

        @Test
        @DisplayName("Should return true for empty arrays")
        void shouldReturnTrueForEmptyArrays() {
            assertTrue(arrayEquals.equals(new int[]{}, new int[]{}));
        }

        @Test
        @DisplayName("Should return false for different lengths")
        void shouldReturnFalseForDifferentLengths() {
            int[] arr1 = {1, 2};
            int[] arr2 = {1, 2, 3};
            assertFalse(arrayEquals.equals(arr1, arr2));
        }

        @Test
        @DisplayName("Should return true for same reference")
        void shouldReturnTrueForSameReference() {
            int[] arr = {1, 2, 3};
            assertTrue(arrayEquals.equals(arr, arr));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should return true for both null")
        void shouldReturnTrueForBothNull() {
            assertTrue(arrayEquals.equals(null, null));
        }

        @Test
        @DisplayName("Should return false if one is null")
        void shouldReturnFalseIfOneIsNull() {
            assertFalse(arrayEquals.equals(null, new int[]{1, 2, 3}));
            assertFalse(arrayEquals.equals(new int[]{1, 2, 3}, null));
        }

        @Test
        @DisplayName("Should handle negative numbers")
        void shouldHandleNegativeNumbers() {
            int[] arr1 = {-1, -2, -3};
            int[] arr2 = {-1, -2, -3};
            assertTrue(arrayEquals.equals(arr1, arr2));
        }

        @Test
        @DisplayName("Should handle single element")
        void shouldHandleSingleElement() {
            assertTrue(arrayEquals.equals(new int[]{42}, new int[]{42}));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not modify either array")
        void shouldNotModifyEitherArray() {
            int[] arr1 = {1, 2, 3};
            int[] arr2 = {1, 2, 3};
            int[] original1 = arr1.clone();
            int[] original2 = arr2.clone();
            arrayEquals.equals(arr1, arr2);
            assertArrayEquals(original1, arr1);
            assertArrayEquals(original2, arr2);
        }
    }
}
