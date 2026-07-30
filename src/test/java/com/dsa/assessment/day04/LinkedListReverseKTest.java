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

@DisplayName("Day 04 - LinkedListReverseK Tests")
class LinkedListReverseKTest {

    private LinkedListReverseK linkedlistreversek;

    @BeforeEach
    void setUp() {
        linkedlistreversek = new LinkedListReverseK();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should reverse in groups of k")
        void shouldReverseInGroupsOfK() {
            ListNode head = ListNode.fromArray(new int[]{1, 2, 3, 4, 5});
            ListNode result = ${class_name,,}.reverseKGroup(head, 2);
            assertThat(result.toArray()).containsExactly(2, 1, 4, 3, 5);
        }

        @Test
        @DisplayName("Should handle k larger than length")
        void shouldHandleKLargerThanLength() {
            ListNode head = ListNode.fromArray(new int[]{1, 2, 3});
            ListNode result = ${class_name,,}.reverseKGroup(head, 5);
            assertThat(result.toArray()).containsExactly(1, 2, 3);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> linkedlistreversek.reverseKGroup(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> linkedlistreversek.reverseKGroup(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> linkedlistreversek.reverseKGroup(null));
        }
    }
}
