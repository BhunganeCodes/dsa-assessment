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

@DisplayName("Day 01 - StringTrim Tests")
class StringTrimTest {

    private StringTrim stringtrim;

    @BeforeEach
    void setUp() {
        stringtrim = new StringTrim();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should trim whitespace")
        void shouldTrimWhitespace() {
            assertThat(${class_name,,}.trim("  hello  ")).isEqualTo("hello");
        }

        @Test
        @DisplayName("Should handle no whitespace")
        void shouldHandleNoWhitespace() {
            assertThat(${class_name,,}.trim("hello")).isEqualTo("hello");
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> stringtrim.trim(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> stringtrim.trim(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> stringtrim.trim(null));
        }
    }
}
