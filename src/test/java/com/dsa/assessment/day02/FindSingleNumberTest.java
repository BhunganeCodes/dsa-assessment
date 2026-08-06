package com.dsa.assessment.day02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 02 - FindSingleNumber Tests")
class FindSingleNumberTest {

    private FindSingleNumber findsinglenumber;

    @BeforeEach
    void setUp() {
        findsinglenumber = new FindSingleNumber();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            assertEquals(4, findsinglenumber.findSingle(new int[]{4, 1, 2, 1, 2}));
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            assertEquals(1, findsinglenumber.findSingle(new int[]{2, 2, 1}));
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            assertEquals(5, findsinglenumber.findSingle(new int[]{7, 3, 7, 5, 3}));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> findsinglenumber.findSingle(null));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> findsinglenumber.findSingle(new int[]{}));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            assertEquals(1, findsinglenumber.findSingle(new int[]{1}));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> findsinglenumber.findSingle(new int[]{1, 2, 1}));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> findsinglenumber.findSingle(new int[]{2, 2, 3, 3, 4}));
        }
    }
}
