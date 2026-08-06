package com.dsa.assessment.day03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 03 - InsertionSort Tests")
class InsertionSortTest {

    private InsertionSort insertionsort;

    @BeforeEach
    void setUp() {
        insertionsort = new InsertionSort();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            assertArrayEquals(new int[]{1, 2, 3}, insertionsort.sort(new int[]{3, 1, 2}));
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            assertArrayEquals(new int[]{1, 2, 5, 8, 9}, insertionsort.sort(new int[]{5, 2, 8, 1, 9}));
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            assertArrayEquals(new int[]{1, 3, 5, 7, 9, 11}, insertionsort.sort(new int[]{7, 1, 9, 3, 11, 5}));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> insertionsort.sort(null));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> insertionsort.sort(new int[]{}));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            assertArrayEquals(new int[]{6, 6, 6}, insertionsort.sort(new int[]{6, 6, 6}));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> insertionsort.sort(new int[]{4, 2, 9, 1, 6}));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> insertionsort.sort(new int[]{3, -2, 8, 0, 5}));
        }
    }
}
