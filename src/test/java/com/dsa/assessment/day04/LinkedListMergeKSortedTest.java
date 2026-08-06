package com.dsa.assessment.day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 04 - LinkedListMergeKSorted Tests")
class LinkedListMergeKSortedTest {

    private LinkedListMergeKSorted linkedlistmergeksorted;

    @BeforeEach
    void setUp() {
        linkedlistmergeksorted = new LinkedListMergeKSorted();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            ListNode[] lists = new ListNode[]{
                    ListNode.fromArray(new int[]{1, 4, 5}),
                    ListNode.fromArray(new int[]{1, 3, 4}),
                    ListNode.fromArray(new int[]{2, 6})
            };
            ListNode result = linkedlistmergeksorted.mergeKLists(lists);
            assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4, 5, 6}, result.toArray());
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            ListNode[] lists = new ListNode[]{
                    ListNode.fromArray(new int[]{1, 3}),
                    ListNode.fromArray(new int[]{2})
            };
            ListNode result = linkedlistmergeksorted.mergeKLists(lists);
            assertArrayEquals(new int[]{1, 2, 3}, result.toArray());
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            ListNode[] lists = new ListNode[]{
                    ListNode.fromArray(new int[]{1, 2, 3})
            };
            ListNode result = linkedlistmergeksorted.mergeKLists(lists);
            assertArrayEquals(new int[]{1, 2, 3}, result.toArray());
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> linkedlistmergeksorted.mergeKLists(null));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> linkedlistmergeksorted.mergeKLists(new ListNode[]{}));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            ListNode[] lists = new ListNode[]{
                    null,
                    ListNode.fromArray(new int[]{1})
            };
            ListNode result = linkedlistmergeksorted.mergeKLists(lists);
            assertArrayEquals(new int[]{1}, result.toArray());
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> linkedlistmergeksorted.mergeKLists(new ListNode[]{
                    ListNode.fromArray(new int[]{1, 2}),
                    ListNode.fromArray(new int[]{3, 4})
            }));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> linkedlistmergeksorted.mergeKLists(new ListNode[]{
                    null,
                    null
            }));
        }
    }
}
