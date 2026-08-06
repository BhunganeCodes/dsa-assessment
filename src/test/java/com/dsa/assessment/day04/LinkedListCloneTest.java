package com.dsa.assessment.day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 04 - LinkedListClone Tests")
class LinkedListCloneTest {

    private LinkedListClone linkedlistclone;

    @BeforeEach
    void setUp() {
        linkedlistclone = new LinkedListClone();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            ListNode input = ListNode.fromArray(new int[]{1, 2, 3});
            ListNode result = linkedlistclone.copyRandomList(input);
            assertNotEquals(input, result);
            assertArrayEquals(new int[]{1, 2, 3}, result.toArray());
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            ListNode input = ListNode.fromArray(new int[]{1, 2, 3, 4});
            ListNode result = linkedlistclone.copyRandomList(input);
            assertNotEquals(input, result);
            assertArrayEquals(new int[]{1, 2, 3, 4}, result.toArray());
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            ListNode input = ListNode.fromArray(new int[]{1});
            ListNode result = linkedlistclone.copyRandomList(input);
            assertNotEquals(input, result);
            assertArrayEquals(new int[]{1}, result.toArray());
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> linkedlistclone.copyRandomList(null));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> linkedlistclone.copyRandomList(ListNode.fromArray(new int[]{})));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            ListNode input = ListNode.fromArray(new int[]{1});
            ListNode result = linkedlistclone.copyRandomList(input);
            assertNotNull(result);
            assertEquals(1, result.val);
            assertNotEquals(input, result);
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> linkedlistclone.copyRandomList(ListNode.fromArray(new int[]{1, 2, 3})));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> linkedlistclone.copyRandomList(ListNode.fromArray(new int[]{5, 6, 7, 8, 9})));
        }
    }
}
