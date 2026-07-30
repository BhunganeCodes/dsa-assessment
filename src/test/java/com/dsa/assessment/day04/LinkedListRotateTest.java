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

@DisplayName("Day 04 - LinkedListRotate Tests")
class LinkedListRotateTest {

    private LinkedListRotate linkedlistrotate;

    @BeforeEach
    void setUp() {
        linkedlistrotate = new LinkedListRotate();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should rotate list right")
        void shouldRotateListRight() {
            ListNode head = ListNode.fromArray(new int[]{1, 2, 3, 4, 5});
            ListNode result = ${class_name,,}.rotateRight(head, 2);
            assertThat(result.toArray()).containsExactly(4, 5, 1, 2, 3);
        }

        @Test
        @DisplayName("Should handle rotation larger than length")
        void shouldHandleRotationLargerThanLength() {
            ListNode head = ListNode.fromArray(new int[]{1, 2, 3});
            ListNode result = ${class_name,,}.rotateRight(head, 4);
            assertThat(result.toArray()).containsExactly(3, 1, 2);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> linkedlistrotate.rotateRight(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> linkedlistrotate.rotateRight(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> linkedlistrotate.rotateRight(null));
        }
    }
}
