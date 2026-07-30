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

@DisplayName("Day 02 - FindSingleNumber Tests")
class FindSingleNumberTest {

    private FindSingleNumber findsinglenumber;

    @BeforeEach
    void setUp() {
        findsinglenumber = new FindSingleNumber();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should find single number")
        void shouldFindSingleNumber() {
            int[] input = {2, 2, 1};
            assertThat(${class_name,,}.findSingle(input)).isEqualTo(1);
        }

        @Test
        @DisplayName("Should find single in larger array")
        void shouldFindSingleInLargerArray() {
            int[] input = {4, 1, 2, 1, 2};
            assertThat(${class_name,,}.findSingle(input)).isEqualTo(4);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> findsinglenumber.findSingle(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> findsinglenumber.findSingle(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> findsinglenumber.findSingle(null));
        }
    }
}
