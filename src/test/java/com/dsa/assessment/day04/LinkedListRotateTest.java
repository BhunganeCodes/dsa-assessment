package com.dsa.assessment.day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 04 - LinkedListRotate Tests")
class LinkedListRotateTest {

    private LinkedListRotate linkedlistrotate;

    @BeforeEach
    void setUp() {
        linkedlistrotate = new LinkedListRotate();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            ListNode result = linkedlistrotate.rotateRight(ListNode.fromArray(new int[]{1, 2, 3, 4, 5}), 2);
            assertArrayEquals(new int[]{4, 5, 1, 2, 3}, result.toArray());
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            ListNode result = linkedlistrotate.rotateRight(ListNode.fromArray(new int[]{1, 2, 3}), 7);
            assertArrayEquals(new int[]{3, 1, 2}, result.toArray());
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            ListNode result = linkedlistrotate.rotateRight(ListNode.fromArray(new int[]{1, 2, 3, 4}), 1);
            assertArrayEquals(new int[]{4, 1, 2, 3}, result.toArray());
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> linkedlistrotate.rotateRight(null, 2));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> linkedlistrotate.rotateRight(ListNode.fromArray(new int[]{}), 3));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            ListNode result = linkedlistrotate.rotateRight(ListNode.fromArray(new int[]{1}), 5);
            assertArrayEquals(new int[]{1}, result.toArray());
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> linkedlistrotate.rotateRight(ListNode.fromArray(new int[]{1, 2, 3}), 10));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> linkedlistrotate.rotateRight(ListNode.fromArray(new int[]{1, 2}), 1));
        }
    }
}
