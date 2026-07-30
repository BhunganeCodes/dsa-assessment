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

@DisplayName("Day 03 - ShellSort Tests")
class ShellSortTest {

    private ShellSort shellsort;

    @BeforeEach
    void setUp() {
        shellsort = new ShellSort();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should sort using shell sort")
        void shouldSortUsingShellSort() {
            int[] input = {23, 12, 1, 8, 34, 54, 2, 3};
            assertThat(${class_name,,}.sort(input)).containsExactly(1, 2, 3, 8, 12, 23, 34, 54);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> shellsort.sort(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> shellsort.sort(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> shellsort.sort(null));
        }
    }
}
