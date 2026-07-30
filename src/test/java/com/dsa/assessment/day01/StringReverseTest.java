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

@DisplayName("Day 01 - StringReverse Tests")
class StringReverseTest {

    private StringReverse stringreverse;

    @BeforeEach
    void setUp() {
        stringreverse = new StringReverse();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should reverse string")
        void shouldReverseString() {
            assertThat(${class_name,,}.reverse("hello")).isEqualTo("olleh");
        }

        @Test
        @DisplayName("Should handle empty string")
        void shouldHandleEmptyString() {
            assertThat(${class_name,,}.reverse("")).isEmpty();
        }

        @Test
        @DisplayName("Should handle single character")
        void shouldHandleSingleCharacter() {
            assertThat(${class_name,,}.reverse("a")).isEqualTo("a");
        }

        @ParameterizedTest
        @ValueSource(strings = {"racecar", "madam", "level"})
        @DisplayName("Should return same for palindrome")
        void shouldReturnSameForPalindrome(String input) {
            assertThat(${class_name,,}.reverse(input)).isEqualTo(input);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> stringreverse.reverse(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> stringreverse.reverse(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> stringreverse.reverse(null));
        }
    }
}
