package com.dsa.assessment.day02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 02 - BinarySearchRecursive Tests")
class BinarySearchRecursiveTest {

    private BinarySearchRecursive binarySearchRecursive;

    @BeforeEach
    void setUp() {
        binarySearchRecursive = new BinarySearchRecursive();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should find element recursively")
        void shouldFindElementRecursively() {
            int[] input = {1, 3, 5, 7, 9};
            assertEquals(2, binarySearchRecursive.search(input, 5, 0, 4));
        }

        @Test
        @DisplayName("Should return -1 for non-existent")
        void shouldReturnMinusOneForNonExistent() {
            int[] input = {1, 3, 5, 7, 9};
            assertEquals(-1, binarySearchRecursive.search(input, 6, 0, 4));
        }

        @Test
        @DisplayName("Should find first element")
        void shouldFindFirstElement() {
            int[] input = {1, 3, 5, 7};
            assertEquals(0, binarySearchRecursive.search(input, 1, 0, 3));
        }

        @Test
        @DisplayName("Should find last element")
        void shouldFindLastElement() {
            int[] input = {1, 3, 5, 7};
            assertEquals(3, binarySearchRecursive.search(input, 7, 0, 3));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null array")
        void shouldHandleNullArray() {
            assertEquals(-1, binarySearchRecursive.search(null, 5, 0, 0));
        }

        @Test
        @DisplayName("Should handle invalid range")
        void shouldHandleInvalidRange() {
            int[] input = {1, 3, 5, 7};
            assertEquals(-1, binarySearchRecursive.search(input, 5, 5, 10));
        }

        @Test
        @DisplayName("Should handle single element found")
        void shouldHandleSingleElementFound() {
            int[] input = {5};
            assertEquals(0, binarySearchRecursive.search(input, 5, 0, 0));
        }

        @Test
        @DisplayName("Should handle single element not found")
        void shouldHandleSingleElementNotFound() {
            int[] input = {5};
            assertEquals(-1, binarySearchRecursive.search(input, 3, 0, 0));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not modify original array")
        void shouldNotModifyOriginalArray() {
            int[] input = {1, 3, 5, 7};
            int[] original = input.clone();
            binarySearchRecursive.search(input, 5, 0, 3);
            assertArrayEquals(original, input);
        }
    }
}
