package com.dsa.assessment.day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 04 - LinkedListAddTwoNumbers Tests")
class LinkedListAddTwoNumbersTest {

    private LinkedListAddTwoNumbers linkedlistaddtwonumbers;

    @BeforeEach
    void setUp() {
        linkedlistaddtwonumbers = new LinkedListAddTwoNumbers();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            ListNode l1 = ListNode.fromArray(new int[]{2, 4, 3});
            ListNode l2 = ListNode.fromArray(new int[]{5, 6, 4});
            ListNode result = linkedlistaddtwonumbers.addTwoNumbers(l1, l2);
            assertArrayEquals(new int[]{7, 0, 8}, result.toArray());
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            ListNode l1 = ListNode.fromArray(new int[]{9, 9, 9, 9});
            ListNode l2 = ListNode.fromArray(new int[]{1});
            ListNode result = linkedlistaddtwonumbers.addTwoNumbers(l1, l2);
            assertArrayEquals(new int[]{0, 0, 0, 0, 1}, result.toArray());
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            ListNode l1 = ListNode.fromArray(new int[]{1, 2, 3});
            ListNode l2 = ListNode.fromArray(new int[]{4, 5, 6});
            ListNode result = linkedlistaddtwonumbers.addTwoNumbers(l1, l2);
            assertArrayEquals(new int[]{5, 7, 9}, result.toArray());
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> linkedlistaddtwonumbers.addTwoNumbers(null, null));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> linkedlistaddtwonumbers.addTwoNumbers(
                    ListNode.fromArray(new int[]{}),
                    ListNode.fromArray(new int[]{})));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            ListNode l1 = ListNode.fromArray(new int[]{5});
            ListNode l2 = ListNode.fromArray(new int[]{5});
            ListNode result = linkedlistaddtwonumbers.addTwoNumbers(l1, l2);
            assertArrayEquals(new int[]{0, 1}, result.toArray());
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> linkedlistaddtwonumbers.addTwoNumbers(
                    ListNode.fromArray(new int[]{1}),
                    ListNode.fromArray(new int[]{9, 9})));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> linkedlistaddtwonumbers.addTwoNumbers(
                    ListNode.fromArray(new int[]{9, 9}),
                    ListNode.fromArray(new int[]{9})));
        }
    }
}
