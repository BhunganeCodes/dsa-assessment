package com.dsa.assessment.day03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 03 - WaveArray Tests")
class WaveArrayTest {

    private WaveArray wavearray;

    @BeforeEach
    void setUp() {
        wavearray = new WaveArray();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            int[] result = wavearray.waveSort(new int[]{10, 90, 49, 2, 1, 5, 23});
            for (int i = 0; i + 1 < result.length; i += 2) {
                assertTrue(result[i] >= result[i + 1]);
            }
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            int[] result = wavearray.waveSort(new int[]{3, 6, 5, 10, 7, 20});
            for (int i = 0; i + 1 < result.length; i += 2) {
                assertTrue(result[i] >= result[i + 1]);
            }
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            int[] result = wavearray.waveSort(new int[]{2, 1, 4, 3, 6, 5});
            for (int i = 0; i + 1 < result.length; i += 2) {
                assertTrue(result[i] >= result[i + 1]);
            }
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> wavearray.waveSort(null));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> wavearray.waveSort(new int[0]));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            assertDoesNotThrow(() -> wavearray.waveSort(new int[]{5}));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> wavearray.waveSort(new int[]{1, 2, 3, 4}));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> wavearray.waveSort(new int[]{9, 8, 7, 6, 5}));
        }
    }
}
