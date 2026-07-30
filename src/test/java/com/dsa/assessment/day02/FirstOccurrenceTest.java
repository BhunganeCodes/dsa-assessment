package com.dsa.assessment.day02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 02 - FirstOccurrence Tests")
class FirstOccurrenceTest {

    private FirstOccurrence firstOccurrence;

    @BeforeEach
    void setUp() {
        firstOccurrence = new FirstOccurrence();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should find first occurrence")
        void shouldFindFirstOccurrence() {
            int[] input = {1, 2, 2, 2, 3, 4};
            assertEquals(1, firstOccurrence.findFirst(input, 2));
        }

        @Test
        @DisplayName("Should handle single occurrence")
        void shouldHandleSingleOccurrence() {
            int[] input = {1, 2, 3, 4, 5};
            assertEquals(2, firstOccurrence.findFirst(input, 3));
        }

        @Test
        @DisplayName("Should find at start with duplicates")
        void shouldFindAtStartWithDuplicates() {
            int[] input = {1, 1, 1, 2, 3};
            assertEquals(0, firstOccurrence.findFirst(input, 1));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should return -1 for non-existent")
        void shouldReturnMinusOneForNonExistent() {
            int[] input = {1, 2, 3, 4};
            assertEquals(-1, firstOccurrence.findFirst(input, 5));
        }

        @Test
        @DisplayName("Should handle null array")
        void shouldHandleNullArray() {
            assertEquals(-1, firstOccurrence.findFirst(null, 5));
        }

        @Test
        @DisplayName("Should handle empty array")
        void shouldHandleEmptyArray() {
            assertEquals(-1, firstOccurrence.findFirst(new int[]{}, 5));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not modify original array")
        void shouldNotModifyOriginalArray() {
            int[] input = {1, 2, 2, 2, 3};
            int[] original = input.clone();
            firstOccurrence.findFirst(input, 2);
            assertArrayEquals(original, input);
        }
    }
}
