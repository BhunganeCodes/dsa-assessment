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

@DisplayName("Day 04 - LinkedListCycle Tests")
class LinkedListCycleTest {

    private LinkedListCycle linkedlistcycle;

    @BeforeEach
    void setUp() {
        linkedlistcycle = new LinkedListCycle();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should detect cycle")
        void shouldDetectCycle() {
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = head.next; // cycle
            assertThat(${class_name,,}.hasCycle(head)).isTrue();
        }

        @Test
        @DisplayName("Should return false for no cycle")
        void shouldReturnFalseForNoCycle() {
            ListNode head = ListNode.fromArray(new int[]{1, 2, 3});
            assertThat(${class_name,,}.hasCycle(head)).isFalse();
        }

        @Test
        @DisplayName("Should handle null")
        void shouldHandleNull() {
            assertThat(${class_name,,}.hasCycle(null)).isFalse();
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> linkedlistcycle.hasCycle(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> linkedlistcycle.hasCycle(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> linkedlistcycle.hasCycle(null));
        }
    }
}
