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

@DisplayName("Day 03 - SelectionSort Tests")
class SelectionSortTest {

    private SelectionSort selectionsort;

    @BeforeEach
    void setUp() {
        selectionsort = new SelectionSort();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should sort using selection sort")
        void shouldSortUsingSelectionSort() {
            int[] input = {64, 25, 12, 22, 11};
            assertThat(${class_name,,}.sort(input)).containsExactly(11, 12, 22, 25, 64);
        }

        @Test
        @DisplayName("Should handle reverse sorted")
        void shouldHandleReverseSorted() {
            int[] input = {5, 4, 3, 2, 1};
            assertThat(${class_name,,}.sort(input)).containsExactly(1, 2, 3, 4, 5);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> selectionsort.sort(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> selectionsort.sort(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> selectionsort.sort(null));
        }
    }
}
