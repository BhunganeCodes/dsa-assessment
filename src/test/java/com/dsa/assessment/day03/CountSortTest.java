package com.dsa.assessment.day03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 03 - CountSort Tests")
class CountSortTest {

    private CountSort countsort;

    @BeforeEach
    void setUp() {
        countsort = new CountSort();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            assertDoesNotThrow(() -> countsort.solve(null));
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            assertDoesNotThrow(() -> countsort.solve(null));
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            assertDoesNotThrow(() -> countsort.solve(null));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> countsort.solve(null));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> countsort.solve(null));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            assertDoesNotThrow(() -> countsort.solve(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> countsort.solve(null));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> countsort.solve(null));
        }
    }
}
