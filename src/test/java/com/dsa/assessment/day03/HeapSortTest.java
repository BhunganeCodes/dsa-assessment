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

@DisplayName("Day 03 - HeapSort Tests")
class HeapSortTest {

    private HeapSort heapsort;

    @BeforeEach
    void setUp() {
        heapsort = new HeapSort();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should sort using heap sort")
        void shouldSortUsingHeapSort() {
            int[] input = {12, 11, 13, 5, 6, 7};
            assertThat(${class_name,,}.sort(input)).containsExactly(5, 6, 7, 11, 12, 13);
        }

        @Test
        @DisplayName("Should handle large array")
        void shouldHandleLargeArray() {
            int[] input = {100, 50, 75, 25, 125, 0};
            assertThat(${class_name,,}.sort(input)).containsExactly(0, 25, 50, 75, 100, 125);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> heapsort.sort(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> heapsort.sort(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> heapsort.sort(null));
        }
    }
}
