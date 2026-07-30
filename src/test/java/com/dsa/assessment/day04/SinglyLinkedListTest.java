package com.dsa.assessment.day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
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
        @DisplayName("Should insert at end of empty list")
        void shouldInsertAtEndOfEmptyList() {
            ListNode result = ${class_name,,}.insertAtEnd(null, 1);
            assertThat(result.val).isEqualTo(1);
            assertThat(result.next).isNull();
        }

        @Test
        @DisplayName("Should insert at end of existing list")
        void shouldInsertAtEndOfExistingList() {
            ListNode head = ListNode.fromArray(new int[]{1, 2, 3});
            ListNode result = ${class_name,,}.insertAtEnd(head, 4);
            assertThat(result.toArray()).containsExactly(1, 2, 3, 4);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> singlylinkedlist.insertAtEnd(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> singlylinkedlist.insertAtEnd(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> singlylinkedlist.insertAtEnd(null));
        }
    }
}
