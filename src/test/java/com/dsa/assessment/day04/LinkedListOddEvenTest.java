package com.dsa.assessment.day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 04 - LinkedListOddEven Tests")
class LinkedListOddEvenTest {

    private LinkedListOddEven linkedlistoddeven;

    @BeforeEach
    void setUp() {
        linkedlistoddeven = new LinkedListOddEven();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            ListNode head = ListNode.fromArray(new int[]{1, 2, 3, 4, 5});
            ListNode result = linkedlistoddeven.oddEvenList(head);
            assertArrayEquals(new int[]{1, 3, 5, 2, 4}, result.toArray());
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            ListNode head = ListNode.fromArray(new int[]{1, 2, 3, 4, 5, 6});
            ListNode result = linkedlistoddeven.oddEvenList(head);
            assertArrayEquals(new int[]{1, 3, 5, 2, 4, 6}, result.toArray());
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            ListNode head = ListNode.fromArray(new int[]{1, 2, 3});
            ListNode result = linkedlistoddeven.oddEvenList(head);
            assertArrayEquals(new int[]{1, 3, 2}, result.toArray());
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> linkedlistoddeven.oddEvenList(null));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> linkedlistoddeven.oddEvenList(ListNode.fromArray(new int[]{})));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            ListNode head = ListNode.fromArray(new int[]{1});
            ListNode result = linkedlistoddeven.oddEvenList(head);
            assertArrayEquals(new int[]{1}, result.toArray());
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> linkedlistoddeven.oddEvenList(ListNode.fromArray(new int[]{1, 2, 3, 4, 5})));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> linkedlistoddeven.oddEvenList(null));
        }
    }
}
