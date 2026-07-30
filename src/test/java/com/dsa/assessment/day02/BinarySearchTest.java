package com.dsa.assessment.day02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 02 - BinarySearch Tests")
class BinarySearchTest {

    private BinarySearch binarySearch;

    @BeforeEach
    void setUp() {
        binarySearch = new BinarySearch();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should find element in sorted array")
        void shouldFindElementInSortedArray() {
            int[] input = {1, 3, 5, 7, 9, 11};
            assertEquals(3, binarySearch.search(input, 7));
        }

        @Test
        @DisplayName("Should find first element")
        void shouldFindFirstElement() {
            int[] input = {1, 3, 5, 7, 9};
            assertEquals(0, binarySearch.search(input, 1));
        }

        @Test
        @DisplayName("Should find last element")
        void shouldFindLastElement() {
            int[] input = {1, 3, 5, 7, 9};
            assertEquals(4, binarySearch.search(input, 9));
        }

        @Test
        @DisplayName("Should return -1 for non-existent")
        void shouldReturnMinusOneForNonExistent() {
            int[] input = {1, 3, 5, 7, 9};
            assertEquals(-1, binarySearch.search(input, 4));
        }

        @Test
        @DisplayName("Should find in single element array")
        void shouldFindInSingleElementArray() {
            int[] input = {5};
            assertEquals(0, binarySearch.search(input, 5));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should return -1 for null array")
        void shouldReturnMinusOneForNullArray() {
            assertEquals(-1, binarySearch.search(null, 5));
        }

        @Test
        @DisplayName("Should return -1 for empty array")
        void shouldReturnMinusOneForEmptyArray() {
            assertEquals(-1, binarySearch.search(new int[]{}, 5));
        }

        @Test
        @DisplayName("Should find in two element array - first")
        void shouldFindInTwoElementArrayFirst() {
            int[] input = {1, 3};
            assertEquals(0, binarySearch.search(input, 1));
        }

        @Test
        @DisplayName("Should find in two element array - second")
        void shouldFindInTwoElementArraySecond() {
            int[] input = {1, 3};
            assertEquals(1, binarySearch.search(input, 3));
        }

        @Test
        @DisplayName("Should handle negative numbers")
        void shouldHandleNegativeNumbers() {
            int[] input = {-5, -3, -1, 0, 2};
            assertEquals(0, binarySearch.search(input, -5));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should return -1 for target smaller than all")
        void shouldReturnMinusOneForTargetSmallerThanAll() {
            int[] input = {1, 3, 5, 7};
            assertEquals(-1, binarySearch.search(input, 0));
        }

        @Test
        @DisplayName("Should return -1 for target larger than all")
        void shouldReturnMinusOneForTargetLargerThanAll() {
            int[] input = {1, 3, 5, 7};
            assertEquals(-1, binarySearch.search(input, 10));
        }

        @Test
        @DisplayName("Should not modify original array")
        void shouldNotModifyOriginalArray() {
            int[] input = {1, 3, 5, 7, 9};
            int[] original = input.clone();
            binarySearch.search(input, 5);
            assertArrayEquals(original, input);
        }
    }
}
