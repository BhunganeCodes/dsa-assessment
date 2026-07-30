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

@DisplayName("Day 02 - SearchInRotated Tests")
class SearchInRotatedTest {

    private SearchInRotated searchinrotated;

    @BeforeEach
    void setUp() {
        searchinrotated = new SearchInRotated();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should find in rotated array")
        void shouldFindInRotatedArray() {
            int[] input = {4, 5, 6, 7, 0, 1, 2};
            assertThat(${class_name,,}.search(input, 0)).isEqualTo(4);
        }

        @Test
        @DisplayName("Should find in non-rotated array")
        void shouldFindInNonRotatedArray() {
            int[] input = {0, 1, 2, 4, 5, 6, 7};
            assertThat(${class_name,,}.search(input, 3)).isEqualTo(-1);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> searchinrotated.search(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> searchinrotated.search(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> searchinrotated.search(null));
        }
    }
}
