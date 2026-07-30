package com.dsa.assessment.day03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 03 - MergeSort Tests")
class MergeSortTest {

    private MergeSort mergesort;

    @BeforeEach
    void setUp() {
        mergesort = new MergeSort();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should sort using merge sort")
        void shouldSortUsingMergeSort() {
            int[] input = {38, 27, 43, 3, 9, 82, 10};
            assertThat(${class_name,,}.sort(input)).containsExactly(3, 9, 10, 27, 38, 43, 82);
        }

        @Test
        @DisplayName("Should handle duplicates")
        void shouldHandleDuplicates() {
            int[] input = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
            assertThat(${class_name,,}.sort(input)).containsExactly(1, 1, 2, 3, 3, 4, 5, 5, 6, 9);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> mergesort.sort(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> mergesort.sort(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> mergesort.sort(null));
        }
    }
}
