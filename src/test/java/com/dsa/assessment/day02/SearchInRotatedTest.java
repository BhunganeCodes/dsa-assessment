package com.dsa.assessment.day02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 02 - SearchInRotated Tests")
class SearchInRotatedTest {

    private SearchInRotated searchinrotated;

    @BeforeEach
    void setUp() {
        searchinrotated = new SearchInRotated();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            assertEquals(4, searchinrotated.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            assertEquals(-1, searchinrotated.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            assertEquals(1, searchinrotated.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 5));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> searchinrotated.search(null, 3));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> searchinrotated.search(new int[]{}, 3));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            assertEquals(0, searchinrotated.search(new int[]{1}, 1));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> searchinrotated.search(new int[]{2, 1}, 1));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> searchinrotated.search(new int[]{6, 7, 1, 2, 3}, 8));
        }
    }
}
