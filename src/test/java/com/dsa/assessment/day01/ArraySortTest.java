package com.dsa.assessment.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 01 - ArraySort Tests")
class ArraySortTest {

    private ArraySort arraySort;

    @BeforeEach
    void setUp() {
        arraySort = new ArraySort();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should sort array ascending")
        void shouldSortArrayAscending() {
            int[] input = {5, 2, 8, 1, 9};
            int[] expected = {1, 2, 5, 8, 9};
            assertArrayEquals(expected, arraySort.sort(input));
        }

        @Test
        @DisplayName("Should handle empty array")
        void shouldHandleEmptyArray() {
            assertArrayEquals(new int[]{}, arraySort.sort(new int[]{}));
        }

        @Test
        @DisplayName("Should handle already sorted")
        void shouldHandleAlreadySorted() {
            int[] input = {1, 2, 3};
            int[] expected = {1, 2, 3};
            assertArrayEquals(expected, arraySort.sort(input));
        }

        @Test
        @DisplayName("Should handle reverse sorted")
        void shouldHandleReverseSorted() {
            int[] input = {3, 2, 1};
            int[] expected = {1, 2, 3};
            assertArrayEquals(expected, arraySort.sort(input));
        }

        @Test
        @DisplayName("Should handle duplicates")
        void shouldHandleDuplicates() {
            int[] input = {3, 1, 2, 1, 3};
            int[] expected = {1, 1, 2, 3, 3};
            assertArrayEquals(expected, arraySort.sort(input));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertNull(arraySort.sort(null));
        }

        @Test
        @DisplayName("Should handle single element")
        void shouldHandleSingleElement() {
            int[] input = {42};
            assertArrayEquals(new int[]{42}, arraySort.sort(input));
        }

        @Test
        @DisplayName("Should handle negative numbers")
        void shouldHandleNegativeNumbers() {
            int[] input = {-3, -1, -2};
            int[] expected = {-3, -2, -1};
            assertArrayEquals(expected, arraySort.sort(input));
        }

        @Test
        @DisplayName("Should handle two elements")
        void shouldHandleTwoElements() {
            int[] input = {2, 1};
            int[] expected = {1, 2};
            assertArrayEquals(expected, arraySort.sort(input));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw exception for empty array")
        void shouldNotThrowForEmptyArray() {
            assertDoesNotThrow(() -> arraySort.sort(new int[]{}));
        }
    }
}
