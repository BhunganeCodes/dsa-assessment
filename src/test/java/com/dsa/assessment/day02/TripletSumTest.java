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

@DisplayName("Day 02 - TripletSum Tests")
class TripletSumTest {

    private TripletSum tripletsum;

    @BeforeEach
    void setUp() {
        tripletsum = new TripletSum();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should find triplet sum")
        void shouldFindTripletSum() {
            int[] input = {1, 2, 3, 4, 5};
            var result = ${class_name,,}.findTriplets(input, 9);
            assertThat(result).isNotEmpty();
        }

        @Test
        @DisplayName("Should return empty if no triplet")
        void shouldReturnEmptyIfNoTriplet() {
            int[] input = {1, 2, 3};
            var result = ${class_name,,}.findTriplets(input, 100);
            assertThat(result).isEmpty();
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> tripletsum.findTriplets(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> tripletsum.findTriplets(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> tripletsum.findTriplets(null));
        }
    }
}
