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

@DisplayName("Day 03 - BubbleSort Tests")
class BubbleSortTest {

    private BubbleSort bubblesort;

    @BeforeEach
    void setUp() {
        bubblesort = new BubbleSort();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should sort using bubble sort")
        void shouldSortUsingBubbleSort() {
            int[] input = {64, 34, 25, 12, 22, 11, 90};
            assertThat(${class_name,,}.sort(input)).containsExactly(11, 12, 22, 25, 34, 64, 90);
        }

        @Test
        @DisplayName("Should handle already sorted")
        void shouldHandleAlreadySorted() {
            int[] input = {1, 2, 3, 4, 5};
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
            assertDoesNotThrow(() -> bubblesort.sort(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> bubblesort.sort(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> bubblesort.sort(null));
        }
    }
}
