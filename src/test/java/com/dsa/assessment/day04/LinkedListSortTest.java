package com.dsa.assessment.day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 04 - LinkedListSort Tests")
class LinkedListSortTest {

    private LinkedListSort linkedlistsort;

    @BeforeEach
    void setUp() {
        linkedlistsort = new LinkedListSort();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            ListNode result = linkedlistsort.sortList(ListNode.fromArray(new int[]{4, 2, 1, 3}));
            assertArrayEquals(new int[]{1, 2, 3, 4}, result.toArray());
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            ListNode result = linkedlistsort.sortList(ListNode.fromArray(new int[]{-1, 5, 3, 4, 0}));
            assertArrayEquals(new int[]{-1, 0, 3, 4, 5}, result.toArray());
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            ListNode result = linkedlistsort.sortList(ListNode.fromArray(new int[]{3, 1, 2}));
            assertArrayEquals(new int[]{1, 2, 3}, result.toArray());
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> linkedlistsort.sortList(null));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> linkedlistsort.sortList(ListNode.fromArray(new int[]{})));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            ListNode result = linkedlistsort.sortList(ListNode.fromArray(new int[]{7}));
            assertArrayEquals(new int[]{7}, result.toArray());
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> linkedlistsort.sortList(ListNode.fromArray(new int[]{2, 2, 1, 1})));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> linkedlistsort.sortList(ListNode.fromArray(new int[]{9, 9, 9})));
        }
    }
}
