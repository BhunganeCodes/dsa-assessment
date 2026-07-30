package com.dsa.assessment.day02;

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

@DisplayName("Day 02 - TwoSum Tests")
class TwoSumTest {

    private TwoSum twosum;

    @BeforeEach
    void setUp() {
        twosum = new TwoSum();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should find two sum indices")
        void shouldFindTwoSumIndices() {
            int[] input = {2, 7, 11, 15};
            assertThat(${class_name,,}.findTwoSum(input, 9)).containsExactly(0, 1);
        }

        @Test
        @DisplayName("Should return empty if no solution")
        void shouldReturnEmptyIfNoSolution() {
            int[] input = {2, 7, 11, 15};
            assertThat(${class_name,,}.findTwoSum(input, 10)).isEmpty();
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> twosum.findTwoSum(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> twosum.findTwoSum(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> twosum.findTwoSum(null));
        }
    }
}
