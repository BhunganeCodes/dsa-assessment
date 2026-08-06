package com.dsa.assessment.day03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 03 - DutchNationalFlag Tests")
class DutchNationalFlagTest {

    private DutchNationalFlag dutchnationalflag;

    @BeforeEach
    void setUp() {
        dutchnationalflag = new DutchNationalFlag();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, dutchnationalflag.sort012(new int[]{2, 0, 1, 2, 0, 1}));
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            assertArrayEquals(new int[]{0, 1, 2}, dutchnationalflag.sort012(new int[]{0, 1, 2}));
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            assertArrayEquals(new int[]{0, 0, 1, 1, 1, 2, 2, 2}, dutchnationalflag.sort012(new int[]{2, 1, 0, 2, 1, 0, 2, 1}));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> dutchnationalflag.sort012(null));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> dutchnationalflag.sort012(new int[]{}));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            assertArrayEquals(new int[]{2, 2, 2}, dutchnationalflag.sort012(new int[]{2, 2, 2}));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> dutchnationalflag.sort012(new int[]{0, 2, 1, 0, 1, 2, 0}));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> dutchnationalflag.sort012(new int[]{1, 2, 0, 1, 0, 2}));
        }
    }
}
