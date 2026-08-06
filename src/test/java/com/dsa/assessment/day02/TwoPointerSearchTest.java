package com.dsa.assessment.day02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 02 - TwoPointerSearch Tests")
class TwoPointerSearchTest {

    private TwoPointerSearch twopointersearch;

    @BeforeEach
    void setUp() {
        twopointersearch = new TwoPointerSearch();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            assertTrue(twopointersearch.hasPairWithSum(new int[]{1, 2, 3, 8, 10}, 11));
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            assertTrue(twopointersearch.hasPairWithSum(new int[]{1, 2, 3, 8, 10}, 18));
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            assertFalse(twopointersearch.hasPairWithSum(new int[]{1, 2, 3, 8, 10}, 100));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> twopointersearch.hasPairWithSum(null, 11));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> twopointersearch.hasPairWithSum(new int[]{}, 11));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            assertFalse(twopointersearch.hasPairWithSum(new int[]{5}, 10));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> twopointersearch.hasPairWithSum(new int[]{1, 3, 5, 7}, 6));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> twopointersearch.hasPairWithSum(new int[]{1, 2, 3}, 7));
        }
    }
}
