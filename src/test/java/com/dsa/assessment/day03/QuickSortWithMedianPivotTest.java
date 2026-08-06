package com.dsa.assessment.day03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

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
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            assertArrayEquals(new int[]{1, 2, 5, 8, 9}, quicksortwithmedianpivot.sort(new int[]{5, 2, 8, 1, 9}));
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            assertArrayEquals(new int[]{1, 2, 3}, quicksortwithmedianpivot.sort(new int[]{3, 1, 2}));
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            assertArrayEquals(new int[]{1, 3, 5, 7, 9}, quicksortwithmedianpivot.sort(new int[]{9, 7, 5, 3, 1}));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> quicksortwithmedianpivot.sort(null));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> quicksortwithmedianpivot.sort(new int[0]));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            assertArrayEquals(new int[]{4, 4, 4}, quicksortwithmedianpivot.sort(new int[]{4, 4, 4}));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> quicksortwithmedianpivot.sort(new int[]{2, 1}));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> quicksortwithmedianpivot.sort(new int[]{1}));
        }
    }
}
