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

@DisplayName("Day 03 - QuickSortWithMedianPivot Tests")
class QuickSortWithMedianPivotTest {

    private QuickSortWithMedianPivot quicksortwithmedianpivot;

    @BeforeEach
    void setUp() {
        quicksortwithmedianpivot = new QuickSortWithMedianPivot();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should sort using median of three pivot")
        void shouldSortWithMedianPivot() {
            int[] input = {9, 3, 7, 1, 8, 2, 5, 4, 6};
            assertThat(${class_name,,}.sort(input)).containsExactly(1, 2, 3, 4, 5, 6, 7, 8, 9);
        }

        @Test
        @DisplayName("Should handle sorted input efficiently")
        void shouldHandleSortedInput() {
            int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            assertThat(${class_name,,}.sort(input)).containsExactly(1, 2, 3, 4, 5, 6, 7, 8, 9);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> quicksortwithmedianpivot.sort(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> quicksortwithmedianpivot.sort(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> quicksortwithmedianpivot.sort(null));
        }
    }
}
