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

@DisplayName("Day 04 - LinkedListOddEven Tests")
class LinkedListOddEvenTest {

    private LinkedListOddEven linkedlistoddeven;

    @BeforeEach
    void setUp() {
        linkedlistoddeven = new LinkedListOddEven();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should reorder odd even indices")
        void shouldReorderOddEvenIndices() {
            ListNode head = ListNode.fromArray(new int[]{1, 2, 3, 4, 5});
            ListNode result = ${class_name,,}.oddEvenList(head);
            assertThat(result.toArray()).containsExactly(1, 3, 5, 2, 4);
        }

        @Test
        @DisplayName("Should handle two elements")
        void shouldHandleTwoElements() {
            ListNode head = ListNode.fromArray(new int[]{1, 2});
            ListNode result = ${class_name,,}.oddEvenList(head);
            assertThat(result.toArray()).containsExactly(1, 2);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> linkedlistoddeven.oddEvenList(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> linkedlistoddeven.oddEvenList(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> linkedlistoddeven.oddEvenList(null));
        }
    }
}
