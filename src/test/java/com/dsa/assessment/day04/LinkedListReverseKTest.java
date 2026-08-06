package com.dsa.assessment.day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 04 - LinkedListReverseK Tests")
class LinkedListReverseKTest {

    private LinkedListReverseK linkedlistreversek;

    @BeforeEach
    void setUp() {
        linkedlistreversek = new LinkedListReverseK();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            ListNode result = linkedlistreversek.reverseKGroup(ListNode.fromArray(new int[]{1, 2, 3, 4, 5}), 2);
            assertArrayEquals(new int[]{2, 1, 4, 3, 5}, result.toArray());
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            ListNode result = linkedlistreversek.reverseKGroup(ListNode.fromArray(new int[]{1, 2, 3, 4}), 2);
            assertArrayEquals(new int[]{2, 1, 4, 3}, result.toArray());
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            ListNode result = linkedlistreversek.reverseKGroup(ListNode.fromArray(new int[]{1, 2, 3, 4, 5}), 3);
            assertArrayEquals(new int[]{3, 2, 1, 4, 5}, result.toArray());
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> linkedlistreversek.reverseKGroup(null, 2));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> linkedlistreversek.reverseKGroup(ListNode.fromArray(new int[]{}), 2));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            ListNode result = linkedlistreversek.reverseKGroup(ListNode.fromArray(new int[]{1, 2, 3}), 1);
            assertArrayEquals(new int[]{1, 2, 3}, result.toArray());
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> linkedlistreversek.reverseKGroup(ListNode.fromArray(new int[]{1, 2, 3, 4, 5}), 5));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> linkedlistreversek.reverseKGroup(ListNode.fromArray(new int[]{1, 2}), 3));
        }
    }
}
