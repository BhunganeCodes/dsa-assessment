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

@DisplayName("Day 02 - IntegerSquareRoot Tests")
class IntegerSquareRootTest {

    private IntegerSquareRoot integersquareroot;

    @BeforeEach
    void setUp() {
        integersquareroot = new IntegerSquareRoot();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should find integer square root")
        void shouldFindIntegerSquareRoot() {
            assertThat(${class_name,,}.sqrt(16)).isEqualTo(4);
        }

        @Test
        @DisplayName("Should floor non-perfect square")
        void shouldFloorNonPerfectSquare() {
            assertThat(${class_name,,}.sqrt(10)).isEqualTo(3);
        }

        @Test
        @DisplayName("Should handle zero")
        void shouldHandleZero() {
            assertThat(${class_name,,}.sqrt(0)).isZero();
        }

        @Test
        @DisplayName("Should handle one")
        void shouldHandleOne() {
            assertThat(${class_name,,}.sqrt(1)).isEqualTo(1);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> integersquareroot.sqrt(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> integersquareroot.sqrt(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> integersquareroot.sqrt(null));
        }
    }
}
