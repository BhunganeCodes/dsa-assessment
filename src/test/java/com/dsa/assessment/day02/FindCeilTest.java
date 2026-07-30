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

@DisplayName("Day 02 - FindCeil Tests")
class FindCeilTest {

    private FindCeil findceil;

    @BeforeEach
    void setUp() {
        findceil = new FindCeil();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should find ceil element")
        void shouldFindCeilElement() {
            int[] input = {1, 2, 4, 6, 8};
            assertThat(${class_name,,}.findCeil(input, 5)).isEqualTo(6);
        }

        @Test
        @DisplayName("Should return -1 if no ceil")
        void shouldReturnMinusOneIfNoCeil() {
            int[] input = {1, 2, 4, 6};
            assertThat(${class_name,,}.findCeil(input, 8)).isEqualTo(-1);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> findceil.findCeil(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> findceil.findCeil(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> findceil.findCeil(null));
        }
    }
}
