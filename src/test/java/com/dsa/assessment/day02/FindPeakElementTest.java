package com.dsa.assessment.day02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 02 - FindPeakElement Tests")
class FindPeakElementTest {

    private FindPeakElement findpeakelement;

    @BeforeEach
    void setUp() {
        findpeakelement = new FindPeakElement();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            int[] array = new int[]{1, 2, 3, 1};
            int peak = findpeakelement.findPeak(array);
            assertEquals(3, array[peak]);
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            int[] array = new int[]{1, 2, 1, 3, 5, 6, 4};
            int peak = findpeakelement.findPeak(array);
            assertTrue(array[peak] == 3 || array[peak] == 6);
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            int[] array = new int[]{10, 2, 1};
            int peak = findpeakelement.findPeak(array);
            assertEquals(10, array[peak]);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> findpeakelement.findPeak(null));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> findpeakelement.findPeak(new int[]{}));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            assertEquals(0, findpeakelement.findPeak(new int[]{5}));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> findpeakelement.findPeak(new int[]{1, 2, 3, 4}));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> findpeakelement.findPeak(new int[]{4, 3, 2, 1}));
        }
    }
}
