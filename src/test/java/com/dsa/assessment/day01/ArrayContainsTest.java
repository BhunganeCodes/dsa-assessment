package com.dsa.assessment.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 01 - ArrayContains Tests")
class ArrayContainsTest {

    private ArrayContains arrayContains;

    @BeforeEach
    void setUp() {
        arrayContains = new ArrayContains();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should return true when element exists")
        void shouldReturnTrueWhenExists() {
            int[] input = {1, 2, 3, 4, 5};
            assertTrue(arrayContains.contains(input, 3));
        }

        @Test
        @DisplayName("Should return false when element not exists")
        void shouldReturnFalseWhenNotExists() {
            int[] input = {1, 2, 3, 4, 5};
            assertFalse(arrayContains.contains(input, 6));
        }

        @Test
        @DisplayName("Should find first element")
        void shouldFindFirstElement() {
            int[] input = {10, 20, 30};
            assertTrue(arrayContains.contains(input, 10));
        }

        @Test
        @DisplayName("Should find last element")
        void shouldFindLastElement() {
            int[] input = {10, 20, 30};
            assertTrue(arrayContains.contains(input, 30));
        }

        @Test
        @DisplayName("Should find negative number")
        void shouldFindNegativeNumber() {
            int[] input = {-5, 0, 5};
            assertTrue(arrayContains.contains(input, -5));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should return false for null array")
        void shouldReturnFalseForNullArray() {
            assertFalse(arrayContains.contains(null, 1));
        }

        @Test
        @DisplayName("Should return false for empty array")
        void shouldReturnFalseForEmptyArray() {
            assertFalse(arrayContains.contains(new int[]{}, 1));
        }

        @Test
        @DisplayName("Should find zero")
        void shouldFindZero() {
            int[] input = {1, 0, -1};
            assertTrue(arrayContains.contains(input, 0));
        }

        @Test
        @DisplayName("Should find in single element array")
        void shouldFindInSingleElementArray() {
            int[] input = {42};
            assertTrue(arrayContains.contains(input, 42));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not modify original array")
        void shouldNotModifyOriginalArray() {
            int[] input = {1, 2, 3};
            int[] original = input.clone();
            arrayContains.contains(input, 2);
            assertArrayEquals(original, input);
        }
    }
}
