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

@DisplayName("Day 03 - SortNearlySorted Tests")
class SortNearlySortedTest {

    private SortNearlySorted sortnearlysorted;

    @BeforeEach
    void setUp() {
        sortnearlysorted = new SortNearlySorted();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should sort nearly sorted array")
        void shouldSortNearlySortedArray() {
            int[] input = {2, 1, 3, 5, 4, 7, 6, 8};
            assertThat(${class_name,,}.sort(input, 1)).containsExactly(1, 2, 3, 4, 5, 6, 7, 8);
        }

        @Test
        @DisplayName("Should handle k=0 (already sorted)")
        void shouldHandleKZero() {
            int[] input = {1, 2, 3, 4, 5};
            assertThat(${class_name,,}.sort(input, 0)).containsExactly(1, 2, 3, 4, 5);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> sortnearlysorted.sort(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> sortnearlysorted.sort(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> sortnearlysorted.sort(null));
        }
    }
}
