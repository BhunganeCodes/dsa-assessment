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

@DisplayName("Day 04 - LinkedListPartition Tests")
class LinkedListPartitionTest {

    private LinkedListPartition linkedlistpartition;

    @BeforeEach
    void setUp() {
        linkedlistpartition = new LinkedListPartition();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should partition list around x")
        void shouldPartitionListAroundX() {
            ListNode head = ListNode.fromArray(new int[]{1, 4, 3, 2, 5, 2});
            ListNode result = ${class_name,,}.partition(head, 3);
            int[] resultArray = result.toArray();
            int partitionIndex = 0;
            for (int i = 0; i < resultArray.length; i++) {
                if (resultArray[i] >= 3) {
                    partitionIndex = i;
                    break;
                }
            }
            for (int i = partitionIndex; i < resultArray.length; i++) {
                assertThat(resultArray[i]).isGreaterThanOrEqualTo(3);
            }
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> linkedlistpartition.partition(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> linkedlistpartition.partition(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> linkedlistpartition.partition(null));
        }
    }
}
