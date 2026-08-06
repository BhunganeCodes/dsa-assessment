package com.dsa.assessment.day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 04 - SinglyLinkedList Tests")
class SinglyLinkedListTest {

    private SinglyLinkedList singlylinkedlist;

    @BeforeEach
    void setUp() {
        singlylinkedlist = new SinglyLinkedList();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            ListNode result = singlylinkedlist.insertAtEnd(null, 1);
            assertArrayEquals(new int[]{1}, result.toArray());
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            ListNode result = singlylinkedlist.insertAtEnd(ListNode.fromArray(new int[]{1, 2}), 3);
            assertArrayEquals(new int[]{1, 2, 3}, result.toArray());
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            ListNode result = singlylinkedlist.insertAtEnd(ListNode.fromArray(new int[]{4, 5, 6}), 7);
            assertArrayEquals(new int[]{4, 5, 6, 7}, result.toArray());
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> singlylinkedlist.insertAtEnd(null, 1));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> singlylinkedlist.insertAtEnd(ListNode.fromArray(new int[]{}), 2));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            ListNode result = singlylinkedlist.insertAtEnd(ListNode.fromArray(new int[]{3}), 4);
            assertArrayEquals(new int[]{3, 4}, result.toArray());
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> singlylinkedlist.insertAtEnd(ListNode.fromArray(new int[]{1, 2, 3}), 4));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> singlylinkedlist.insertAtEnd(ListNode.fromArray(new int[]{1}), 2));
        }
    }
}
