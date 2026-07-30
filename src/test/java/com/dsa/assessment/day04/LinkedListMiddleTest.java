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

@DisplayName("Day 04 - LinkedListMiddle Tests")
class LinkedListMiddleTest {

    private LinkedListMiddle linkedlistmiddle;

    @BeforeEach
    void setUp() {
        linkedlistmiddle = new LinkedListMiddle();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should find middle of odd length list")
        void shouldFindMiddleOfOddLengthList() {
            ListNode head = ListNode.fromArray(new int[]{1, 2, 3, 4, 5});
            ListNode middle = ${class_name,,}.findMiddle(head);
            assertThat(middle.val).isEqualTo(3);
        }

        @Test
        @DisplayName("Should find second middle of even length list")
        void shouldFindSecondMiddleOfEvenLengthList() {
            ListNode head = ListNode.fromArray(new int[]{1, 2, 3, 4});
            ListNode middle = ${class_name,,}.findMiddle(head);
            assertThat(middle.val).isEqualTo(3);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> linkedlistmiddle.findMiddle(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> linkedlistmiddle.findMiddle(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> linkedlistmiddle.findMiddle(null));
        }
    }
}
