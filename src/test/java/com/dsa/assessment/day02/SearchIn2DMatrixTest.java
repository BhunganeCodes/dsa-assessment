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

@DisplayName("Day 02 - SearchIn2DMatrix Tests")
class SearchIn2DMatrixTest {

    private SearchIn2DMatrix searchin2dmatrix;

    @BeforeEach
    void setUp() {
        searchin2dmatrix = new SearchIn2DMatrix();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should find in 2D matrix")
        void shouldFindIn2DMatrix() {
            int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
            assertThat(${class_name,,}.searchMatrix(matrix, 3)).isTrue();
        }

        @Test
        @DisplayName("Should return false for non-existent")
        void shouldReturnFalseForNonExistent() {
            int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}};
            assertThat(${class_name,,}.searchMatrix(matrix, 13)).isFalse();
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> searchin2dmatrix.searchMatrix(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> searchin2dmatrix.searchMatrix(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> searchin2dmatrix.searchMatrix(null));
        }
    }
}
