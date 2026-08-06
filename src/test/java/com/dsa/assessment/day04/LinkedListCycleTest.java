package com.dsa.assessment.day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 04 - LinkedListCycle Tests")
class LinkedListCycleTest {

    private LinkedListCycle linkedlistcycle;

    @BeforeEach
    void setUp() {
        linkedlistcycle = new LinkedListCycle();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            ListNode head = ListNode.fromArray(new int[]{1, 2, 3});
            head.next.next.next = head;
            assertTrue(linkedlistcycle.hasCycle(head));
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            ListNode head = ListNode.fromArray(new int[]{1, 2, 3});
            assertFalse(linkedlistcycle.hasCycle(head));
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            ListNode head = ListNode.fromArray(new int[]{1, 2});
            head.next.next = head;
            assertTrue(linkedlistcycle.hasCycle(head));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> linkedlistcycle.hasCycle(null));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> linkedlistcycle.hasCycle(ListNode.fromArray(new int[]{})));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            ListNode head = ListNode.fromArray(new int[]{1});
            assertFalse(linkedlistcycle.hasCycle(head));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> linkedlistcycle.hasCycle(ListNode.fromArray(new int[]{1, 2, 3, 4, 5})));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> linkedlistcycle.hasCycle(null));
        }
    }
}
