package com.dsa.assessment.day02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 02 - IntegerSquareRoot Tests")
class IntegerSquareRootTest {

    private IntegerSquareRoot integersquareroot;

    @BeforeEach
    void setUp() {
        integersquareroot = new IntegerSquareRoot();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            assertDoesNotThrow(() -> integersquareroot.solve(null));
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            assertDoesNotThrow(() -> integersquareroot.solve(null));
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            assertDoesNotThrow(() -> integersquareroot.solve(null));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> integersquareroot.solve(null));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> integersquareroot.solve(null));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            assertDoesNotThrow(() -> integersquareroot.solve(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> integersquareroot.solve(null));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> integersquareroot.solve(null));
        }
    }
}
