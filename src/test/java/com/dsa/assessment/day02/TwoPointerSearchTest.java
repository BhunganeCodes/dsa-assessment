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

@DisplayName("Day 02 - TwoPointerSearch Tests")
class TwoPointerSearchTest {

    private TwoPointerSearch twopointersearch;

    @BeforeEach
    void setUp() {
        twopointersearch = new TwoPointerSearch();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should find pair with two pointers")
        void shouldFindPairWithTwoPointers() {
            int[] input = {1, 2, 3, 4, 6};
            assertThat(${class_name,,}.hasPairWithSum(input, 6)).isTrue();
        }

        @Test
        @DisplayName("Should return false if no pair")
        void shouldReturnFalseIfNoPair() {
            int[] input = {1, 2, 3, 4, 6};
            assertThat(${class_name,,}.hasPairWithSum(input, 20)).isFalse();
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> twopointersearch.hasPairWithSum(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> twopointersearch.hasPairWithSum(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> twopointersearch.hasPairWithSum(null));
        }
    }
}
