package com.dsa.assessment.day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 04 - LinkedListReverse Tests")
class LinkedListReverseTest {

    private LinkedListReverse linkedlistreverse;

    @BeforeEach
    void setUp() {
        linkedlistreverse = new LinkedListReverse();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            ListNode result = linkedlistreverse.reverse(ListNode.fromArray(new int[]{1, 2, 3}));
            assertArrayEquals(new int[]{3, 2, 1}, result.toArray());
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            ListNode result = linkedlistreverse.reverse(ListNode.fromArray(new int[]{1, 2, 3, 4, 5}));
            assertArrayEquals(new int[]{5, 4, 3, 2, 1}, result.toArray());
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            ListNode result = linkedlistreverse.reverse(ListNode.fromArray(new int[]{1, 2}));
            assertArrayEquals(new int[]{2, 1}, result.toArray());
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> linkedlistreverse.reverse(null));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> linkedlistreverse.reverse(ListNode.fromArray(new int[]{})));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            ListNode result = linkedlistreverse.reverse(ListNode.fromArray(new int[]{1}));
            assertArrayEquals(new int[]{1}, result.toArray());
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> linkedlistreverse.reverse(ListNode.fromArray(new int[]{4, 5, 6, 7})));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> linkedlistreverse.reverse(ListNode.fromArray(new int[]{0, 0, 0})));
        }
    }
}
