package com.dsa.assessment.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 01 - StringReplace Tests")
class StringReplaceTest {

    private StringReplace stringReplace;

    @BeforeEach
    void setUp() {
        stringReplace = new StringReplace();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should replace character")
        void shouldReplaceCharacter() {
            assertEquals("hexxo", stringReplace.replace("hello", 'l', 'x'));
        }

        @Test
        @DisplayName("Should handle no match")
        void shouldHandleNoMatch() {
            assertEquals("hello", stringReplace.replace("hello", 'z', 'x'));
        }

        @Test
        @DisplayName("Should replace all occurrences")
        void shouldReplaceAllOccurrences() {
            assertEquals("aaaaa", stringReplace.replace("bbbbb", 'b', 'a'));
        }

        @Test
        @DisplayName("Should handle empty string")
        void shouldHandleEmptyString() {
            assertEquals("", stringReplace.replace("", 'a', 'b'));
        }

        @Test
        @DisplayName("Should replace with same character")
        void shouldReplaceWithSameCharacter() {
            assertEquals("hello", stringReplace.replace("hello", 'l', 'l'));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertNull(stringReplace.replace(null, 'a', 'b'));
        }

        @Test
        @DisplayName("Should replace special character")
        void shouldReplaceSpecialCharacter() {
            assertEquals("a b c", stringReplace.replace("a-b-c", '-', ' '));
        }

        @Test
        @DisplayName("Should handle case sensitive replacement")
        void shouldHandleCaseSensitiveReplacement() {
            assertEquals("Hello", stringReplace.replace("hello", 'h', 'H'));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw exception for null input")
        void shouldNotThrowForNullInput() {
            assertDoesNotThrow(() -> stringReplace.replace(null, 'a', 'b'));
        }
    }
}
