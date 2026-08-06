package com.dsa.assessment.day03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 03 - SortByFrequency Tests")
class SortByFrequencyTest {

    private SortByFrequency sortbyfrequency;

    @BeforeEach
    void setUp() {
        sortbyfrequency = new SortByFrequency();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            assertArrayEquals(new int[]{3, 1, 1, 2, 2, 2}, sortbyfrequency.sortByFrequency(new int[]{1, 1, 2, 2, 2, 3}));
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            assertArrayEquals(new int[]{1, 3, 3, 2, 2}, sortbyfrequency.sortByFrequency(new int[]{2, 3, 1, 3, 2}));
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            assertArrayEquals(new int[]{5, -1, 4, -6, 4, -6, 1, 1, 1}, sortbyfrequency.sortByFrequency(new int[]{-1, 1, -6, 4, 5, -6, 1, 4, 1}));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> sortbyfrequency.sortByFrequency(null));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> sortbyfrequency.sortByFrequency(new int[0]));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            assertArrayEquals(new int[]{7, 7, 7}, sortbyfrequency.sortByFrequency(new int[]{7, 7, 7}));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> sortbyfrequency.sortByFrequency(new int[]{1, 2, 1, 2}));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> sortbyfrequency.sortByFrequency(new int[]{5}));
        }
    }
}
