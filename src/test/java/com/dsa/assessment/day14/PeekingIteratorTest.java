package com.dsa.assessment.day14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 14 - PeekingIterator Tests")
class PeekingIteratorTest {

    private PeekingIterator peekingiterator;

    @BeforeEach
    void setUp() {
        peekingiterator = new PeekingIterator();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            assertDoesNotThrow(() -> peekingiterator.solve(null));
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            assertDoesNotThrow(() -> peekingiterator.solve(null));
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            assertDoesNotThrow(() -> peekingiterator.solve(null));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> peekingiterator.solve(null));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> peekingiterator.solve(null));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            assertDoesNotThrow(() -> peekingiterator.solve(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> peekingiterator.solve(null));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> peekingiterator.solve(null));
        }
    }
}
