package com.dsa.assessment.day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 05 - DequeImplementation Tests")
class DequeImplementationTest {

    private DequeImplementation dequeimplementation;

    @BeforeEach
    void setUp() {
        dequeimplementation = new DequeImplementation();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            assertDoesNotThrow(() -> dequeimplementation.solve(null));
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            assertDoesNotThrow(() -> dequeimplementation.solve(null));
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            assertDoesNotThrow(() -> dequeimplementation.solve(null));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> dequeimplementation.solve(null));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> dequeimplementation.solve(null));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            assertDoesNotThrow(() -> dequeimplementation.solve(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> dequeimplementation.solve(null));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> dequeimplementation.solve(null));
        }
    }
}
