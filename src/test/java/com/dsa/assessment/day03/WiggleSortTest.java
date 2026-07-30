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

@DisplayName("Day 03 - WiggleSort Tests")
class WiggleSortTest {

    private WiggleSort wigglesort;

    @BeforeEach
    void setUp() {
        wigglesort = new WiggleSort();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should wiggle sort")
        void shouldWiggleSort() {
            int[] input = {3, 5, 2, 1, 6, 4};
            int[] result = ${class_name,,}.wiggleSort(input);
            for (int i = 0; i < result.length - 1; i++) {
                if (i % 2 == 0) {
                    assertThat(result[i]).isLessThanOrEqualTo(result[i + 1]);
                } else {
                    assertThat(result[i]).isGreaterThanOrEqualTo(result[i + 1]);
                }
            }
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> wigglesort.wiggleSort(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> wigglesort.wiggleSort(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> wigglesort.wiggleSort(null));
        }
    }
}
