package com.dsa.assessment.day02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 02 - LinearSearch Tests")
class LinearSearchTest {

    private LinearSearch linearSearch;

    @BeforeEach
    void setUp() {
        linearSearch = new LinearSearch();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should find element at first position")
        void shouldFindAtFirstPosition() {
            int[] input = {5, 3, 8, 1, 9};
            assertEquals(0, linearSearch.search(input, 5));
        }

        @Test
        @DisplayName("Should find element at last position")
        void shouldFindAtLastPosition() {
            int[] input = {5, 3, 8, 1, 9};
            assertEquals(4, linearSearch.search(input, 9));
        }

        @Test
        @DisplayName("Should find element in middle")
        void shouldFindInMiddle() {
            int[] input = {5, 3, 8, 1, 9};
            assertEquals(2, linearSearch.search(input, 8));
        }

        @Test
        @DisplayName("Should return -1 for non-existent element")
        void shouldReturnMinusOneForNonExistent() {
            int[] input = {5, 3, 8, 1, 9};
            assertEquals(-1, linearSearch.search(input, 7));
        }

        @Test
        @DisplayName("Should handle empty array")
        void shouldHandleEmptyArray() {
            assertEquals(-1, linearSearch.search(new int[]{}, 5));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null array")
        void shouldHandleNullArray() {
            assertEquals(-1, linearSearch.search(null, 5));
        }

        @Test
        @DisplayName("Should find first occurrence of duplicates")
        void shouldFindFirstOccurrenceOfDuplicates() {
            int[] input = {1, 2, 3, 2, 1};
            assertEquals(1, linearSearch.search(input, 2));
        }

        @Test
        @DisplayName("Should find negative number")
        void shouldFindNegativeNumber() {
            int[] input = {1, -2, 3};
            assertEquals(1, linearSearch.search(input, -2));
        }

        @Test
        @DisplayName("Should find zero")
        void shouldFindZero() {
            int[] input = {1, 0, -1};
            assertEquals(1, linearSearch.search(input, 0));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not modify original array")
        void shouldNotModifyOriginalArray() {
            int[] input = {5, 3, 8, 1, 9};
            int[] original = input.clone();
            linearSearch.search(input, 8);
            assertArrayEquals(original, input);
        }
    }
}
