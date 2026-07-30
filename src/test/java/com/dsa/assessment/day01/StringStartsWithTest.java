package com.dsa.assessment.day01;

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

@DisplayName("Day 01 - StringStartsWith Tests")
class StringStartsWithTest {

    private StringStartsWith stringstartswith;

    @BeforeEach
    void setUp() {
        stringstartswith = new StringStartsWith();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should return true for matching prefix")
        void shouldReturnTrueForMatchingPrefix() {
            assertThat(${class_name,,}.startsWith("hello world", "hello")).isTrue();
        }

        @Test
        @DisplayName("Should return false for non-matching prefix")
        void shouldReturnFalseForNonMatchingPrefix() {
            assertThat(${class_name,,}.startsWith("hello world", "world")).isFalse();
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> stringstartswith.startsWith(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> stringstartswith.startsWith(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> stringstartswith.startsWith(null));
        }
    }
}
