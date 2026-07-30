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
        @DisplayName("Should split list into two halves")
        void shouldSplitListIntoTwoHalves() {
            ListNode head = ListNode.fromArray(new int[]{1, 2, 3, 4});
            ListNode[] result = ${class_name,,}.splitList(head);
            assertThat(result[0].toArray()).containsExactly(1, 2);
            assertThat(result[1].toArray()).containsExactly(3, 4);
        }

        @Test
        @DisplayName("Should handle odd length")
        void shouldHandleOddLength() {
            ListNode head = ListNode.fromArray(new int[]{1, 2, 3});
            ListNode[] result = ${class_name,,}.splitList(head);
            assertThat(result[0].toArray()).containsExactly(1, 2);
            assertThat(result[1].toArray()).containsExactly(3);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> linkedlistsplit.splitList(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> linkedlistsplit.splitList(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> linkedlistsplit.splitList(null));
        }
    }
}
