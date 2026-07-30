package com.dsa.assessment.day02;

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

@DisplayName("Day 02 - BinarySearch Tests")
class BinarySearchTest {

    private BinarySearch binarysearch;

    @BeforeEach
    void setUp() {
        binarysearch = new BinarySearch();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should find element in sorted array")
        void shouldFindElementInSortedArray() {
            int[] input = {1, 3, 5, 7, 9, 11};
            assertThat(${class_name,,}.search(input, 7)).isEqualTo(3);
        }

        @Test
        @DisplayName("Should find first element")
        void shouldFindFirstElement() {
            int[] input = {1, 3, 5, 7, 9};
            assertThat(${class_name,,}.search(input, 1)).isEqualTo(0);
        }

        @Test
        @DisplayName("Should find last element")
        void shouldFindLastElement() {
            int[] input = {1, 3, 5, 7, 9};
            assertThat(${class_name,,}.search(input, 9)).isEqualTo(4);
        }

        @Test
        @DisplayName("Should return -1 for non-existent")
        void shouldReturnMinusOneForNonExistent() {
            int[] input = {1, 3, 5, 7, 9};
            assertThat(${class_name,,}.search(input, 4)).isEqualTo(-1);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> binarysearch.search(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> binarysearch.search(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> binarysearch.search(null));
        }
    }
}
