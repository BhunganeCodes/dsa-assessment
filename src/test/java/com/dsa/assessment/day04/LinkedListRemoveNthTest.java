package com.dsa.assessment.day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 04 - LinkedListRemoveNth Tests")
class LinkedListRemoveNthTest {

    private LinkedListRemoveNth linkedlistremoventh;

    @BeforeEach
    void setUp() {
        linkedlistremoventh = new LinkedListRemoveNth();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            ListNode result = linkedlistremoventh.removeNthFromEnd(ListNode.fromArray(new int[]{1, 2, 3, 4, 5}), 2);
            assertArrayEquals(new int[]{1, 2, 3, 5}, result.toArray());
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            ListNode result = linkedlistremoventh.removeNthFromEnd(ListNode.fromArray(new int[]{1, 2, 3, 4, 5}), 1);
            assertArrayEquals(new int[]{1, 2, 3, 4}, result.toArray());
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            ListNode result = linkedlistremoventh.removeNthFromEnd(ListNode.fromArray(new int[]{1, 2, 3, 4, 5}), 5);
            assertArrayEquals(new int[]{2, 3, 4, 5}, result.toArray());
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> linkedlistremoventh.removeNthFromEnd(null, 2));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> linkedlistremoventh.removeNthFromEnd(ListNode.fromArray(new int[]{}), 1));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            ListNode result = linkedlistremoventh.removeNthFromEnd(ListNode.fromArray(new int[]{1}), 1);
            assertNull(result);
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> linkedlistremoventh.removeNthFromEnd(ListNode.fromArray(new int[]{1, 2}), 1));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> linkedlistremoventh.removeNthFromEnd(ListNode.fromArray(new int[]{1, 2, 3}), 3));
        }
    }
}
