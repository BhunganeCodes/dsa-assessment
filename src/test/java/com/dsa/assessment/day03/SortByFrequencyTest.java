package com.dsa.assessment.day03;

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

@DisplayName("Day 03 - SortByFrequency Tests")
class SortByFrequencyTest {

    private SortByFrequency sortbyfrequency;

    @BeforeEach
    void setUp() {
        sortbyfrequency = new SortByFrequency();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should sort by frequency descending")
        void shouldSortByFrequencyDescending() {
            int[] input = {2, 5, 2, 8, 5, 6, 8, 8};
            int[] result = ${class_name,,}.sortByFrequency(input);
            assertThat(result).startsWith(8, 8, 8);
        }

        @Test
        @DisplayName("Should handle all unique elements")
        void shouldHandleAllUniqueElements() {
            int[] input = {1, 2, 3, 4, 5};
            int[] result = ${class_name,,}.sortByFrequency(input);
            assertThat(result).hasSize(5);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> sortbyfrequency.sortByFrequency(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> sortbyfrequency.sortByFrequency(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> sortbyfrequency.sortByFrequency(null));
        }
    }
}
