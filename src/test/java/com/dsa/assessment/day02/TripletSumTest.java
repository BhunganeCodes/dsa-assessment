package com.dsa.assessment.day02;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 02 - TripletSum Tests")
class TripletSumTest {

    private TripletSum tripletsum;

    @BeforeEach
    void setUp() {
        tripletsum = new TripletSum();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            List<int[]> result = tripletsum.findTriplets(new int[]{-1, 0, 1, 2, -1, -4}, 0);
            assertNotNull(result);
            assertEquals(2, result.size());
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            List<int[]> result = tripletsum.findTriplets(new int[]{1, 2, 3}, 6);
            assertNotNull(result);
            assertEquals(1, result.size());
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            List<int[]> result = tripletsum.findTriplets(new int[]{-2, 0, 1, 1, 2}, 0);
            assertNotNull(result);
            assertEquals(2, result.size());
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> tripletsum.findTriplets(null, 0));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> tripletsum.findTriplets(new int[]{}, 0));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            List<int[]> result = tripletsum.findTriplets(new int[]{1}, 1);
            assertNotNull(result);
            assertEquals(0, result.size());
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> tripletsum.findTriplets(new int[]{1, 2, 3, 4, 5}, 9));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> tripletsum.findTriplets(new int[]{-1, 0, 1}, 0));
        }
    }
}
