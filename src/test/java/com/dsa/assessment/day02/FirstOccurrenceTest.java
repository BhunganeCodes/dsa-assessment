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

@DisplayName("Day 02 - FirstOccurrence Tests")
class FirstOccurrenceTest {

    private FirstOccurrence firstoccurrence;

    @BeforeEach
    void setUp() {
        firstoccurrence = new FirstOccurrence();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should find first occurrence")
        void shouldFindFirstOccurrence() {
            int[] input = {1, 2, 2, 2, 3, 4};
            assertThat(${class_name,,}.findFirst(input, 2)).isEqualTo(1);
        }

        @Test
        @DisplayName("Should handle single occurrence")
        void shouldHandleSingleOccurrence() {
            int[] input = {1, 2, 3, 4, 5};
            assertThat(${class_name,,}.findFirst(input, 3)).isEqualTo(2);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> firstoccurrence.findFirst(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> firstoccurrence.findFirst(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> firstoccurrence.findFirst(null));
        }
    }
}
