package com.dsa.assessment.day02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 02 - LastOccurrence Tests")
class LastOccurrenceTest {

    private LastOccurrence lastOccurrence;

    @BeforeEach
    void setUp() {
        lastOccurrence = new LastOccurrence();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should find last occurrence")
        void shouldFindLastOccurrence() {
            int[] input = {1, 2, 2, 2, 3, 4};
            assertEquals(3, lastOccurrence.findLast(input, 2));
        }

        @Test
        @DisplayName("Should handle single occurrence")
        void shouldHandleSingleOccurrence() {
            int[] input = {1, 2, 3, 4, 5};
            assertEquals(2, lastOccurrence.findLast(input, 3));
        }

        @Test
        @DisplayName("Should find at end with duplicates")
        void shouldFindAtEndWithDuplicates() {
            int[] input = {1, 2, 3, 3, 3};
            assertEquals(4, lastOccurrence.findLast(input, 3));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should return -1 for non-existent")
        void shouldReturnMinusOneForNonExistent() {
            int[] input = {1, 2, 3, 4};
            assertEquals(-1, lastOccurrence.findLast(input, 5));
        }

        @Test
        @DisplayName("Should handle null array")
        void shouldHandleNullArray() {
            assertEquals(-1, lastOccurrence.findLast(null, 5));
        }

        @Test
        @DisplayName("Should handle empty array")
        void shouldHandleEmptyArray() {
            assertEquals(-1, lastOccurrence.findLast(new int[]{}, 5));
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
            lastOccurrence.findLast(input, 2);
            assertArrayEquals(original, input);
        }
    }
}
