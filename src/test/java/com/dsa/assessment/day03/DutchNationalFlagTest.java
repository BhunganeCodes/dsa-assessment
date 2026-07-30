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

@DisplayName("Day 03 - DutchNationalFlag Tests")
class DutchNationalFlagTest {

    private DutchNationalFlag dutchnationalflag;

    @BeforeEach
    void setUp() {
        dutchnationalflag = new DutchNationalFlag();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should sort 0s, 1s, and 2s")
        void shouldSort012() {
            int[] input = {0, 2, 1, 2, 0, 1, 1, 0};
            assertThat(${class_name,,}.sort012(input)).containsExactly(0, 0, 0, 1, 1, 1, 2, 2);
        }

        @Test
        @DisplayName("Should handle all same")
        void shouldHandleAllSame() {
            int[] input = {1, 1, 1, 1};
            assertThat(${class_name,,}.sort012(input)).containsExactly(1, 1, 1, 1);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> dutchnationalflag.sort012(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> dutchnationalflag.sort012(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> dutchnationalflag.sort012(null));
        }
    }
}
