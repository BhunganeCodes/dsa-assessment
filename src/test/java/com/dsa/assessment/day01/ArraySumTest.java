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

@DisplayName("Day 01 - ArraySum Tests")
class ArraySumTest {

    private ArraySum arraysum;

    @BeforeEach
    void setUp() {
        arraysum = new ArraySum();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should return sum of positive numbers")
        void shouldReturnSumOfPositiveNumbers() {
            int[] input = {1, 2, 3, 4, 5};
            assertThat(${class_name,,}.sum(input)).isEqualTo(15);
        }

        @Test
        @DisplayName("Should return sum with negative numbers")
        void shouldReturnSumWithNegativeNumbers() {
            int[] input = {-1, 2, -3, 4, -5};
            assertThat(${class_name,,}.sum(input)).isEqualTo(-3);
        }

        @Test
        @DisplayName("Should return zero for empty array")
        void shouldReturnZeroForEmptyArray() {
            int[] input = {};
            assertThat(${class_name,,}.sum(input)).isEqualTo(0);
        }

        @Test
        @DisplayName("Should return single element")
        void shouldReturnSingleElement() {
            int[] input = {42};
            assertThat(${class_name,,}.sum(input)).isEqualTo(42);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> arraysum.sum(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> arraysum.sum(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> arraysum.sum(null));
        }
    }
}
