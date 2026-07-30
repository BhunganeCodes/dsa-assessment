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

@DisplayName("Day 03 - WaveArray Tests")
class WaveArrayTest {

    private WaveArray wavearray;

    @BeforeEach
    void setUp() {
        wavearray = new WaveArray();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should sort in wave form")
        void shouldSortInWaveForm() {
            int[] input = {10, 5, 6, 3, 2, 20, 100, 80};
            int[] result = ${class_name,,}.waveSort(input);
            assertThat(result[0]).isGreaterThan(result[1]);
            assertThat(result[2]).isGreaterThan(result[3]);
        }

        @Test
        @DisplayName("Should handle small array")
        void shouldHandleSmallArray() {
            int[] input = {1, 2};
            int[] result = ${class_name,,}.waveSort(input);
            assertThat(result[0]).isGreaterThan(result[1]);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> wavearray.waveSort(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> wavearray.waveSort(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> wavearray.waveSort(null));
        }
    }
}
