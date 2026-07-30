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

@DisplayName("Day 02 - FindPeakElement Tests")
class FindPeakElementTest {

    private FindPeakElement findpeakelement;

    @BeforeEach
    void setUp() {
        findpeakelement = new FindPeakElement();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should find a peak element")
        void shouldFindPeakElement() {
            int[] input = {1, 2, 3, 1};
            assertThat(${class_name,,}.findPeak(input)).isEqualTo(2);
        }

        @Test
        @DisplayName("Should find peak at edge")
        void shouldFindPeakAtEdge() {
            int[] input = {1, 2, 3, 4, 5};
            assertThat(${class_name,,}.findPeak(input)).isEqualTo(4);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> findpeakelement.findPeak(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> findpeakelement.findPeak(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> findpeakelement.findPeak(null));
        }
    }
}
