package com.dsa.assessment.day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 04 - LinkedListMiddle Tests")
class LinkedListMiddleTest {

    private LinkedListMiddle linkedlistmiddle;

    @BeforeEach
    void setUp() {
        linkedlistmiddle = new LinkedListMiddle();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            ListNode head = ListNode.fromArray(new int[]{1, 2, 3, 4, 5});
            ListNode result = linkedlistmiddle.findMiddle(head);
            assertEquals(3, result.val);
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            ListNode head = ListNode.fromArray(new int[]{1, 2, 3, 4});
            ListNode result = linkedlistmiddle.findMiddle(head);
            assertEquals(3, result.val);
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            ListNode head = ListNode.fromArray(new int[]{1, 2, 3});
            ListNode result = linkedlistmiddle.findMiddle(head);
            assertEquals(2, result.val);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> linkedlistmiddle.findMiddle(null));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> linkedlistmiddle.findMiddle(ListNode.fromArray(new int[]{})));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            ListNode head = ListNode.fromArray(new int[]{1});
            ListNode result = linkedlistmiddle.findMiddle(head);
            assertEquals(1, result.val);
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> linkedlistmiddle.findMiddle(ListNode.fromArray(new int[]{1, 2, 3, 4, 5, 6, 7})));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> linkedlistmiddle.findMiddle(null));
        }
    }
}
