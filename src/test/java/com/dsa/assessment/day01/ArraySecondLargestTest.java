package com.dsa.assessment.day01;

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

@DisplayName("Day 01 - ArraySecondLargest Tests")
class ArraySecondLargestTest {

    private ArraySecondLargest arraysecondlargest;

    @BeforeEach
    void setUp() {
        arraysecondlargest = new ArraySecondLargest();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should find second largest")
        void shouldFindSecondLargest() {
            int[] input = {10, 20, 30, 40};
            assertThat(${class_name,,}.findSecondLargest(input)).isEqualTo(30);
        }

        @Test
        @DisplayName("Should handle duplicates")
        void shouldHandleDuplicates() {
            int[] input = {10, 10, 20, 20, 30};
            assertThat(${class_name,,}.findSecondLargest(input)).isEqualTo(20);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> arraysecondlargest.findSecondLargest(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> arraysecondlargest.findSecondLargest(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> arraysecondlargest.findSecondLargest(null));
        }
    }
}
