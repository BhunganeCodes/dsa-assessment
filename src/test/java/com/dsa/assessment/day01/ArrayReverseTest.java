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

@DisplayName("Day 01 - ArrayReverse Tests")
class ArrayReverseTest {

    private ArrayReverse arrayreverse;

    @BeforeEach
    void setUp() {
        arrayreverse = new ArrayReverse();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should reverse array")
        void shouldReverseArray() {
            int[] input = {1, 2, 3, 4, 5};
            assertThat(${class_name,,}.reverse(input)).containsExactly(5, 4, 3, 2, 1);
        }

        @Test
        @DisplayName("Should handle empty array")
        void shouldHandleEmptyArray() {
            int[] input = {};
            assertThat(${class_name,,}.reverse(input)).isEmpty();
        }

        @Test
        @DisplayName("Should handle odd length array")
        void shouldHandleOddLengthArray() {
            int[] input = {1, 2, 3};
            assertThat(${class_name,,}.reverse(input)).containsExactly(3, 2, 1);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> arrayreverse.reverse(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> arrayreverse.reverse(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> arrayreverse.reverse(null));
        }
    }
}
