package com.dsa.assessment.day03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

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
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            assertArrayEquals(new int[]{1, 2, 3}, bubblesort.sort(new int[]{3, 1, 2}));
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            assertArrayEquals(new int[]{1, 2, 5, 8, 9}, bubblesort.sort(new int[]{5, 2, 8, 1, 9}));
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            assertArrayEquals(new int[]{1, 2, 3, 4, 5, 7}, bubblesort.sort(new int[]{7, 3, 1, 5, 2, 4}));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> bubblesort.sort(null));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> bubblesort.sort(new int[]{}));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            assertArrayEquals(new int[]{4, 4, 4}, bubblesort.sort(new int[]{4, 4, 4}));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> bubblesort.sort(new int[]{9, 7, 5, 3, 1}));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> bubblesort.sort(new int[]{2, -4, 0, 9, 1}));
        }
    }
}
