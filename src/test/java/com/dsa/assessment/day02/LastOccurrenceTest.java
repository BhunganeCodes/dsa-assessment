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

@DisplayName("Day 02 - LastOccurrence Tests")
class LastOccurrenceTest {

    private LastOccurrence lastoccurrence;

    @BeforeEach
    void setUp() {
        lastoccurrence = new LastOccurrence();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should find last occurrence")
        void shouldFindLastOccurrence() {
            int[] input = {1, 2, 2, 2, 3, 4};
            assertThat(${class_name,,}.findLast(input, 2)).isEqualTo(3);
        }

        @Test
        @DisplayName("Should handle single occurrence")
        void shouldHandleSingleOccurrence() {
            int[] input = {1, 2, 3, 4, 5};
            assertThat(${class_name,,}.findLast(input, 3)).isEqualTo(2);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> lastoccurrence.findLast(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> lastoccurrence.findLast(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> lastoccurrence.findLast(null));
        }
    }
}
