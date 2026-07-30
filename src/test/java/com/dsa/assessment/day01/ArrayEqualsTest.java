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

@DisplayName("Day 01 - ArrayEquals Tests")
class ArrayEqualsTest {

    private ArrayEquals arrayequals;

    @BeforeEach
    void setUp() {
        arrayequals = new ArrayEquals();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should return true for equal arrays")
        void shouldReturnTrueForEqualArrays() {
            int[] arr1 = {1, 2, 3};
            int[] arr2 = {1, 2, 3};
            assertThat(${class_name,,}.equals(arr1, arr2)).isTrue();
        }

        @Test
        @DisplayName("Should return false for different arrays")
        void shouldReturnFalseForDifferentArrays() {
            int[] arr1 = {1, 2, 3};
            int[] arr2 = {1, 2, 4};
            assertThat(${class_name,,}.equals(arr1, arr2)).isFalse();
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> arrayequals.equals(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> arrayequals.equals(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> arrayequals.equals(null));
        }
    }
}
