package com.dsa.assessment.day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 04 - LinkedListMergeSorted Tests")
class LinkedListMergeSortedTest {

    private LinkedListMergeSorted linkedlistmergesorted;

    @BeforeEach
    void setUp() {
        linkedlistmergesorted = new LinkedListMergeSorted();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            ListNode list1 = ListNode.fromArray(new int[]{1, 2, 4});
            ListNode list2 = ListNode.fromArray(new int[]{1, 3, 4});
            ListNode result = linkedlistmergesorted.mergeTwoLists(list1, list2);
            assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4}, result.toArray());
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            ListNode list1 = ListNode.fromArray(new int[]{1, 3, 5});
            ListNode list2 = ListNode.fromArray(new int[]{2, 4, 6});
            ListNode result = linkedlistmergesorted.mergeTwoLists(list1, list2);
            assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, result.toArray());
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            ListNode list1 = ListNode.fromArray(new int[]{1, 2, 3});
            ListNode list2 = ListNode.fromArray(new int[]{1, 2, 3});
            ListNode result = linkedlistmergesorted.mergeTwoLists(list1, list2);
            assertArrayEquals(new int[]{1, 1, 2, 2, 3, 3}, result.toArray());
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> linkedlistmergesorted.mergeTwoLists(null, null));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> linkedlistmergesorted.mergeTwoLists(
                    ListNode.fromArray(new int[]{}),
                    ListNode.fromArray(new int[]{})));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            ListNode list1 = ListNode.fromArray(new int[]{1});
            ListNode result = linkedlistmergesorted.mergeTwoLists(list1, null);
            assertArrayEquals(new int[]{1}, result.toArray());
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> linkedlistmergesorted.mergeTwoLists(
                    ListNode.fromArray(new int[]{1, 4, 7}),
                    ListNode.fromArray(new int[]{2, 5, 8})));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> linkedlistmergesorted.mergeTwoLists(
                    null,
                    ListNode.fromArray(new int[]{1})));
        }
    }
}
