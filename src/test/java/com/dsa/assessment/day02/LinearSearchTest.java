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

@DisplayName("Day 02 - LinearSearch Tests")
class LinearSearchTest {

    private LinearSearch linearsearch;

    @BeforeEach
    void setUp() {
        linearsearch = new LinearSearch();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should find element at first position")
        void shouldFindAtFirstPosition() {
            int[] input = {5, 3, 8, 1, 9};
            assertThat(${class_name,,}.search(input, 5)).isEqualTo(0);
        }

        @Test
        @DisplayName("Should find element at last position")
        void shouldFindAtLastPosition() {
            int[] input = {5, 3, 8, 1, 9};
            assertThat(${class_name,,}.search(input, 9)).isEqualTo(4);
        }

        @Test
        @DisplayName("Should return -1 for non-existent element")
        void shouldReturnMinusOneForNonExistent() {
            int[] input = {5, 3, 8, 1, 9};
            assertThat(${class_name,,}.search(input, 7)).isEqualTo(-1);
        }

        @Test
        @DisplayName("Should handle empty array")
        void shouldHandleEmptyArray() {
            assertThat(${class_name,,}.search(new int[]{}, 5)).isEqualTo(-1);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> linearsearch.search(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> linearsearch.search(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> linearsearch.search(null));
        }
    }
}
