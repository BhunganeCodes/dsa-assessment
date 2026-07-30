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

@DisplayName("Day 02 - CountOccurrences Tests")
class CountOccurrencesTest {

    private CountOccurrences countoccurrences;

    @BeforeEach
    void setUp() {
        countoccurrences = new CountOccurrences();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should count occurrences in sorted array")
        void shouldCountOccurrences() {
            int[] input = {1, 2, 2, 2, 3, 4};
            assertThat(${class_name,,}.count(input, 2)).isEqualTo(3);
        }

        @Test
        @DisplayName("Should return zero for non-existent")
        void shouldReturnZeroForNonExistent() {
            int[] input = {1, 2, 3, 4};
            assertThat(${class_name,,}.count(input, 5)).isZero();
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> countoccurrences.count(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> countoccurrences.count(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> countoccurrences.count(null));
        }
    }
}
