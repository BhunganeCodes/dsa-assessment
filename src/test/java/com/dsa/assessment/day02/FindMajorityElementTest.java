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

@DisplayName("Day 02 - FindMajorityElement Tests")
class FindMajorityElementTest {

    private FindMajorityElement findmajorityelement;

    @BeforeEach
    void setUp() {
        findmajorityelement = new FindMajorityElement();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should find majority element")
        void shouldFindMajorityElement() {
            int[] input = {3, 2, 3};
            assertThat(${class_name,,}.findMajority(input)).isEqualTo(3);
        }

        @Test
        @DisplayName("Should find majority in larger array")
        void shouldFindMajorityInLargerArray() {
            int[] input = {2, 2, 1, 1, 1, 2, 2};
            assertThat(${class_name,,}.findMajority(input)).isEqualTo(2);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> findmajorityelement.findMajority(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> findmajorityelement.findMajority(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> findmajorityelement.findMajority(null));
        }
    }
}
