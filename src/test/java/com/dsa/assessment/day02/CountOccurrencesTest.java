package com.dsa.assessment.day02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 02 - CountOccurrences Tests")
class CountOccurrencesTest {

    private CountOccurrences countOccurrences;

    @BeforeEach
    void setUp() {
        countOccurrences = new CountOccurrences();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should count occurrences in sorted array")
        void shouldCountOccurrences() {
            int[] input = {1, 2, 2, 2, 3, 4};
            assertEquals(3, countOccurrences.count(input, 2));
        }

        @Test
        @DisplayName("Should return 1 for single occurrence")
        void shouldReturnOneForSingleOccurrence() {
            int[] input = {1, 2, 3, 4};
            assertEquals(1, countOccurrences.count(input, 3));
        }

        @Test
        @DisplayName("Should count all same elements")
        void shouldCountAllSameElements() {
            int[] input = {5, 5, 5, 5};
            assertEquals(4, countOccurrences.count(input, 5));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should return zero for non-existent")
        void shouldReturnZeroForNonExistent() {
            int[] input = {1, 2, 3, 4};
            assertEquals(0, countOccurrences.count(input, 5));
        }

        @Test
        @DisplayName("Should handle null array")
        void shouldHandleNullArray() {
            assertEquals(0, countOccurrences.count(null, 5));
        }

        @Test
        @DisplayName("Should handle empty array")
        void shouldHandleEmptyArray() {
            assertEquals(0, countOccurrences.count(new int[]{}, 5));
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
            countOccurrences.count(input, 2);
            assertArrayEquals(original, input);
        }
    }
}
