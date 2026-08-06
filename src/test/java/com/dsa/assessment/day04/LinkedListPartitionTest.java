package com.dsa.assessment.day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 04 - LinkedListPartition Tests")
class LinkedListPartitionTest {

    private LinkedListPartition linkedlistpartition;

    @BeforeEach
    void setUp() {
        linkedlistpartition = new LinkedListPartition();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            ListNode head = ListNode.fromArray(new int[]{1, 4, 3, 2, 5, 2});
            ListNode result = linkedlistpartition.partition(head, 3);
            assertArrayEquals(new int[]{1, 2, 2, 4, 3, 5}, result.toArray());
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            ListNode head = ListNode.fromArray(new int[]{3, 1, 2});
            ListNode result = linkedlistpartition.partition(head, 2);
            assertArrayEquals(new int[]{1, 3, 2}, result.toArray());
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            ListNode head = ListNode.fromArray(new int[]{2, 1});
            ListNode result = linkedlistpartition.partition(head, 2);
            assertArrayEquals(new int[]{1, 2}, result.toArray());
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> linkedlistpartition.partition(null, 3));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> linkedlistpartition.partition(ListNode.fromArray(new int[]{}), 3));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            ListNode head = ListNode.fromArray(new int[]{1});
            ListNode result = linkedlistpartition.partition(head, 2);
            assertArrayEquals(new int[]{1}, result.toArray());
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> linkedlistpartition.partition(ListNode.fromArray(new int[]{1, 4, 3, 2, 5, 2}), 3));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> linkedlistpartition.partition(null, 1));
        }
    }
}
