package com.dsa.assessment.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 01 - ArrayIndexOf Tests")
class ArrayIndexOfTest {

    private ArrayIndexOf arrayIndexOf;

    @BeforeEach
    void setUp() {
        arrayIndexOf = new ArrayIndexOf();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should return index of element")
        void shouldReturnIndexOfElement() {
            int[] input = {10, 20, 30, 40};
            assertEquals(2, arrayIndexOf.indexOf(input, 30));
        }

        @Test
        @DisplayName("Should return -1 for non-existent")
        void shouldReturnMinusOneForNonExistent() {
            int[] input = {10, 20, 30};
            assertEquals(-1, arrayIndexOf.indexOf(input, 50));
        }

        @Test
        @DisplayName("Should return first occurrence")
        void shouldReturnFirstOccurrence() {
            int[] input = {1, 2, 3, 2, 1};
            assertEquals(1, arrayIndexOf.indexOf(input, 2));
        }

        @Test
        @DisplayName("Should find at index 0")
        void shouldFindAtIndexZero() {
            int[] input = {5, 10, 15};
            assertEquals(0, arrayIndexOf.indexOf(input, 5));
        }

        @Test
        @DisplayName("Should find at last index")
        void shouldFindAtLastIndex() {
            int[] input = {5, 10, 15};
            assertEquals(2, arrayIndexOf.indexOf(input, 15));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should return -1 for null array")
        void shouldReturnMinusOneForNullArray() {
            assertEquals(-1, arrayIndexOf.indexOf(null, 5));
        }

        @Test
        @DisplayName("Should return -1 for empty array")
        void shouldReturnMinusOneForEmptyArray() {
            assertEquals(-1, arrayIndexOf.indexOf(new int[]{}, 5));
        }

        @Test
        @DisplayName("Should find negative number")
        void shouldFindNegativeNumber() {
            int[] input = {1, -2, 3};
            assertEquals(1, arrayIndexOf.indexOf(input, -2));
        }

        @Test
        @DisplayName("Should find zero")
        void shouldFindZero() {
            int[] input = {1, 0, -1};
            assertEquals(1, arrayIndexOf.indexOf(input, 0));
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
            arrayIndexOf.indexOf(input, 2);
            assertArrayEquals(original, input);
        }
    }
}
