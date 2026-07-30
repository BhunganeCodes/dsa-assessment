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

@DisplayName("Day 04 - LinkedListSwapPairs Tests")
class LinkedListSwapPairsTest {

    private LinkedListSwapPairs linkedlistswappairs;

    @BeforeEach
    void setUp() {
        linkedlistswappairs = new LinkedListSwapPairs();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should swap adjacent pairs")
        void shouldSwapAdjacentPairs() {
            ListNode head = ListNode.fromArray(new int[]{1, 2, 3, 4});
            ListNode result = ${class_name,,}.swapPairs(head);
            assertThat(result.toArray()).containsExactly(2, 1, 4, 3);
        }

        @Test
        @DisplayName("Should handle odd length")
        void shouldHandleOddLength() {
            ListNode head = ListNode.fromArray(new int[]{1, 2, 3});
            ListNode result = ${class_name,,}.swapPairs(head);
            assertThat(result.toArray()).containsExactly(2, 1, 3);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> linkedlistswappairs.swapPairs(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> linkedlistswappairs.swapPairs(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> linkedlistswappairs.swapPairs(null));
        }
    }
}
