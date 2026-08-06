package com.dsa.assessment.day02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 02 - SearchInsertPosition Tests")
class SearchInsertPositionTest {

    private SearchInsertPosition searchinsertposition;

    @BeforeEach
    void setUp() {
        searchinsertposition = new SearchInsertPosition();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            assertEquals(2, searchinsertposition.searchInsert(new int[]{1, 3, 5, 6}, 5));
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            assertEquals(1, searchinsertposition.searchInsert(new int[]{1, 3, 5, 6}, 2));
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            assertEquals(4, searchinsertposition.searchInsert(new int[]{1, 3, 5, 6}, 7));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> searchinsertposition.searchInsert(null, 5));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertEquals(0, searchinsertposition.searchInsert(new int[]{}, 5));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            assertEquals(0, searchinsertposition.searchInsert(new int[]{1, 3, 5, 6}, 0));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> searchinsertposition.searchInsert(new int[]{2, 4, 6, 8}, 7));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> searchinsertposition.searchInsert(new int[]{1}, 1));
        }
    }
}
