package com.dsa.assessment.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 01 - ArraySecondLargest Tests")
class ArraySecondLargestTest {

    private ArraySecondLargest arraySecondLargest;

    @BeforeEach
    void setUp() {
        arraySecondLargest = new ArraySecondLargest();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should find second largest")
        void shouldFindSecondLargest() {
            int[] input = {10, 20, 30, 40};
            assertEquals(30, arraySecondLargest.findSecondLargest(input));
        }

        @Test
        @DisplayName("Should handle duplicates")
        void shouldHandleDuplicates() {
            int[] input = {10, 10, 20, 20, 30};
            assertEquals(20, arraySecondLargest.findSecondLargest(input));
        }

        @Test
        @DisplayName("Should find second largest when not sorted")
        void shouldFindSecondLargestWhenNotSorted() {
            int[] input = {5, 1, 4, 2, 3};
            assertEquals(4, arraySecondLargest.findSecondLargest(input));
        }

        @Test
        @DisplayName("Should handle negative numbers")
        void shouldHandleNegativeNumbers() {
            int[] input = {-10, -20, -30, -5};
            assertEquals(-10, arraySecondLargest.findSecondLargest(input));
        }

        @Test
        @DisplayName("Should handle second largest at start")
        void shouldHandleSecondLargestAtStart() {
            int[] input = {30, 40, 10, 20};
            assertEquals(30, arraySecondLargest.findSecondLargest(input));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should throw exception for array with less than 2 elements")
        void shouldThrowForLessThanTwoElements() {
            assertThrows(IllegalArgumentException.class,
                () -> arraySecondLargest.findSecondLargest(new int[]{1}));
        }

        @Test
        @DisplayName("Should throw exception for null array")
        void shouldThrowForNullArray() {
            assertThrows(IllegalArgumentException.class,
                () -> arraySecondLargest.findSecondLargest(null));
        }

        @Test
        @DisplayName("Should throw exception when all elements are same")
        void shouldThrowWhenAllElementsSame() {
            assertThrows(IllegalArgumentException.class,
                () -> arraySecondLargest.findSecondLargest(new int[]{5, 5, 5}));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not modify original array")
        void shouldNotModifyOriginalArray() {
            int[] input = {10, 20, 30, 40};
            int[] original = input.clone();
            arraySecondLargest.findSecondLargest(input);
            assertArrayEquals(original, input);
        }
    }
}
