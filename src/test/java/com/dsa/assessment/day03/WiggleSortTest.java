package com.dsa.assessment.day03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 03 - WiggleSort Tests")
class WiggleSortTest {

    private WiggleSort wigglesort;

    @BeforeEach
    void setUp() {
        wigglesort = new WiggleSort();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            int[] result = wigglesort.wiggleSort(new int[]{3, 5, 2, 1, 6, 4});
            for (int i = 0; i + 1 < result.length; i += 2) {
                assertTrue(result[i] <= result[i + 1]);
            }
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            int[] result = wigglesort.wiggleSort(new int[]{1, 5, 1, 1, 6, 4});
            for (int i = 0; i + 1 < result.length; i += 2) {
                assertTrue(result[i] <= result[i + 1]);
            }
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            int[] result = wigglesort.wiggleSort(new int[]{10, 90, 49, 2, 1, 5, 23});
            for (int i = 0; i + 1 < result.length; i += 2) {
                assertTrue(result[i] <= result[i + 1]);
            }
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> wigglesort.wiggleSort(null));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> wigglesort.wiggleSort(new int[0]));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            int[] result = wigglesort.wiggleSort(new int[]{4, 4, 4});
            for (int i = 0; i + 1 < result.length; i += 2) {
                assertTrue(result[i] <= result[i + 1]);
            }
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> wigglesort.wiggleSort(new int[]{2, 1}));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> wigglesort.wiggleSort(new int[]{1}));
        }
    }
}
