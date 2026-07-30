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

@DisplayName("Day 03 - RadixSort Tests")
class RadixSortTest {

    private RadixSort radixsort;

    @BeforeEach
    void setUp() {
        radixsort = new RadixSort();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should sort using radix sort")
        void shouldSortUsingRadixSort() {
            int[] input = {170, 45, 75, 90, 802, 24, 2, 66};
            assertThat(${class_name,,}.sort(input)).containsExactly(2, 24, 45, 66, 75, 90, 170, 802);
        }

        @Test
        @DisplayName("Should handle single digit numbers")
        void shouldHandleSingleDigitNumbers() {
            int[] input = {5, 1, 9, 3, 7};
            assertThat(${class_name,,}.sort(input)).containsExactly(1, 3, 5, 7, 9);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> radixsort.sort(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> radixsort.sort(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> radixsort.sort(null));
        }
    }
}
