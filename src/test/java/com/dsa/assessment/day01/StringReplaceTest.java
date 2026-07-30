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

@DisplayName("Day 01 - StringReplace Tests")
class StringReplaceTest {

    private StringReplace stringreplace;

    @BeforeEach
    void setUp() {
        stringreplace = new StringReplace();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should replace character")
        void shouldReplaceCharacter() {
            assertThat(${class_name,,}.replace("hello", 'l', 'x')).isEqualTo("hexxo");
        }

        @Test
        @DisplayName("Should handle no match")
        void shouldHandleNoMatch() {
            assertThat(${class_name,,}.replace("hello", 'z', 'x')).isEqualTo("hello");
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> stringreplace.replace(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> stringreplace.replace(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> stringreplace.replace(null));
        }
    }
}
