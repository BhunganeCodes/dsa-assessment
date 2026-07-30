package com.dsa.assessment.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 01 - StringTrim Tests")
class StringTrimTest {

    private StringTrim stringTrim;

    @BeforeEach
    void setUp() {
        stringTrim = new StringTrim();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should trim whitespace from both ends")
        void shouldTrimWhitespaceFromBothEnds() {
            assertEquals("hello", stringTrim.trim("  hello  "));
        }

        @Test
        @DisplayName("Should handle no whitespace")
        void shouldHandleNoWhitespace() {
            assertEquals("hello", stringTrim.trim("hello"));
        }

        @Test
        @DisplayName("Should trim leading whitespace only")
        void shouldTrimLeadingWhitespaceOnly() {
            assertEquals("hello", stringTrim.trim("   hello"));
        }

        @Test
        @DisplayName("Should trim trailing whitespace only")
        void shouldTrimTrailingWhitespaceOnly() {
            assertEquals("hello", stringTrim.trim("hello   "));
        }

        @Test
        @DisplayName("Should handle empty string")
        void shouldHandleEmptyString() {
            assertEquals("", stringTrim.trim(""));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertNull(stringTrim.trim(null));
        }

        @Test
        @DisplayName("Should handle only whitespace")
        void shouldHandleOnlyWhitespace() {
            assertEquals("", stringTrim.trim("     "));
        }

        @Test
        @DisplayName("Should not trim internal spaces")
        void shouldNotTrimInternalSpaces() {
            assertEquals("hello world", stringTrim.trim("  hello world  "));
        }

        @Test
        @DisplayName("Should handle tabs and newlines")
        void shouldHandleTabsAndNewlines() {
            assertEquals("hello", stringTrim.trim("\t\nhello\n\t"));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw exception for null input")
        void shouldNotThrowForNullInput() {
            assertDoesNotThrow(() -> stringTrim.trim(null));
        }
    }
}
