package com.dsa.assessment.day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 04 - LinkedListSplit Tests")
class LinkedListSplitTest {

    private LinkedListSplit linkedlistsplit;

    @BeforeEach
    void setUp() {
        linkedlistsplit = new LinkedListSplit();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            ListNode[] result = linkedlistsplit.splitList(ListNode.fromArray(new int[]{1, 2, 3, 4, 5}));
            assertNotNull(result);
            assertArrayEquals(new int[]{1, 2, 3}, result[0].toArray());
            assertArrayEquals(new int[]{4, 5}, result[1].toArray());
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            ListNode[] result = linkedlistsplit.splitList(ListNode.fromArray(new int[]{1, 2, 3, 4}));
            assertNotNull(result);
            assertArrayEquals(new int[]{1, 2}, result[0].toArray());
            assertArrayEquals(new int[]{3, 4}, result[1].toArray());
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            ListNode[] result = linkedlistsplit.splitList(ListNode.fromArray(new int[]{1, 2}));
            assertNotNull(result);
            assertArrayEquals(new int[]{1}, result[0].toArray());
            assertArrayEquals(new int[]{2}, result[1].toArray());
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> linkedlistsplit.splitList(null));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> linkedlistsplit.splitList(ListNode.fromArray(new int[]{})));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            ListNode[] result = linkedlistsplit.splitList(ListNode.fromArray(new int[]{1}));
            assertNotNull(result);
            assertArrayEquals(new int[]{1}, result[0].toArray());
            assertNull(result[1]);
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> linkedlistsplit.splitList(ListNode.fromArray(new int[]{1, 2, 3, 4, 5, 6})));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> linkedlistsplit.splitList(ListNode.fromArray(new int[]{1, 2, 3, 4, 5, 6, 7})));
        }
    }
}
