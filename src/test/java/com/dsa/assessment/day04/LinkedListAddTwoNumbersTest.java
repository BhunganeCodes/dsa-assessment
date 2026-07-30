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
        @DisplayName("Should add two numbers")
        void shouldAddTwoNumbers() {
            ListNode l1 = ListNode.fromArray(new int[]{2, 4, 3}); // 342
            ListNode l2 = ListNode.fromArray(new int[]{5, 6, 4}); // 465
            ListNode result = ${class_name,,}.addTwoNumbers(l1, l2);
            assertThat(result.toArray()).containsExactly(7, 0, 8); // 807
        }

        @Test
        @DisplayName("Should handle carry")
        void shouldHandleCarry() {
            ListNode l1 = ListNode.fromArray(new int[]{9, 9});
            ListNode l2 = ListNode.fromArray(new int[]{1});
            ListNode result = ${class_name,,}.addTwoNumbers(l1, l2);
            assertThat(result.toArray()).containsExactly(0, 0, 1);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> linkedlistaddtwonumbers.addTwoNumbers(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> linkedlistaddtwonumbers.addTwoNumbers(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> linkedlistaddtwonumbers.addTwoNumbers(null));
        }
    }
}
