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

@DisplayName("Day 04 - LinkedListReverse Tests")
class LinkedListReverseTest {

    private LinkedListReverse linkedlistreverse;

    @BeforeEach
    void setUp() {
        linkedlistreverse = new LinkedListReverse();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should reverse linked list")
        void shouldReverseLinkedList() {
            ListNode head = ListNode.fromArray(new int[]{1, 2, 3, 4, 5});
            ListNode result = ${class_name,,}.reverse(head);
            assertThat(result.toArray()).containsExactly(5, 4, 3, 2, 1);
        }

        @Test
        @DisplayName("Should handle single element")
        void shouldHandleSingleElement() {
            ListNode head = ListNode.fromArray(new int[]{1});
            ListNode result = ${class_name,,}.reverse(head);
            assertThat(result.toArray()).containsExactly(1);
        }

        @Test
        @DisplayName("Should handle null")
        void shouldHandleNull() {
            assertThat(${class_name,,}.reverse(null)).isNull();
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> linkedlistreverse.reverse(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> linkedlistreverse.reverse(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> linkedlistreverse.reverse(null));
        }
    }
}
