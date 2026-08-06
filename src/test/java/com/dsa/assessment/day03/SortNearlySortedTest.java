package com.dsa.assessment.day03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 03 - SortNearlySorted Tests")
class SortNearlySortedTest {

    private SortNearlySorted sortnearlysorted;

    @BeforeEach
    void setUp() {
        sortnearlysorted = new SortNearlySorted();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            assertArrayEquals(new int[]{2, 3, 5, 6, 8, 9, 10}, sortnearlysorted.sort(new int[]{6, 5, 3, 2, 8, 10, 9}, 3));
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            assertArrayEquals(new int[]{1, 2, 3}, sortnearlysorted.sort(new int[]{3, 2, 1}, 2));
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            assertArrayEquals(new int[]{2, 3, 6, 8, 12, 56}, sortnearlysorted.sort(new int[]{2, 6, 3, 12, 56, 8}, 3));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> sortnearlysorted.sort(null, 3));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> sortnearlysorted.sort(new int[0], 3));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            assertArrayEquals(new int[]{1, 2, 3}, sortnearlysorted.sort(new int[]{1, 2, 3}, 1));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> sortnearlysorted.sort(new int[]{5, 4, 3, 2, 1}, 2));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> sortnearlysorted.sort(new int[]{1}, 0));
        }
    }
}
