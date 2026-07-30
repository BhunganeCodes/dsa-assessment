package com.dsa.assessment.day01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 01 - ArrayCopy Tests")
class ArrayCopyTest {

    private ArrayCopy arrayCopy;

    @BeforeEach
    void setUp() {
        arrayCopy = new ArrayCopy();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should copy array")
        void shouldCopyArray() {
            int[] input = {1, 2, 3};
            int[] result = arrayCopy.copy(input);
            assertArrayEquals(input, result);
        }

        @Test
        @DisplayName("Should return different reference")
        void shouldReturnDifferentReference() {
            int[] input = {1, 2, 3};
            int[] result = arrayCopy.copy(input);
            assertNotSame(input, result);
        }

        @Test
        @DisplayName("Should handle empty array")
        void shouldHandleEmptyArray() {
            int[] input = {};
            int[] result = arrayCopy.copy(input);
            assertArrayEquals(new int[]{}, result);
        }

        @Test
        @DisplayName("Should copy negative numbers")
        void shouldCopyNegativeNumbers() {
            int[] input = {-1, -2, -3};
            int[] result = arrayCopy.copy(input);
            assertArrayEquals(input, result);
        }

        @Test
        @DisplayName("Should handle single element")
        void shouldHandleSingleElement() {
            int[] input = {42};
            int[] result = arrayCopy.copy(input);
            assertArrayEquals(input, result);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertNull(arrayCopy.copy(null));
        }

        @Test
        @DisplayName("Modifying copy should not affect original")
        void modifyingCopyShouldNotAffectOriginal() {
            int[] input = {1, 2, 3};
            int[] copy = arrayCopy.copy(input);
            copy[0] = 999;
            assertEquals(1, input[0]);
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw exception for null input")
        void shouldNotThrowForNullInput() {
            assertDoesNotThrow(() -> arrayCopy.copy(null));
        }
    }
}
