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

@DisplayName("Day 02 - FindDuplicate Tests")
class FindDuplicateTest {

    private FindDuplicate findduplicate;

    @BeforeEach
    void setUp() {
        findduplicate = new FindDuplicate();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
 
        @Test
        @DisplayName("Should find duplicate number")
        void shouldFindDuplicateNumber() {
            int[] input = {1, 3, 4, 2, 2};
            assertThat(${class_name,,}.findDuplicate(input)).isEqualTo(2);
        }

        @Test
        @DisplayName("Should find duplicate at start")
        void shouldFindDuplicateAtStart() {
            int[] input = {3, 1, 3, 4, 2};
            assertThat(${class_name,,}.findDuplicate(input)).isEqualTo(3);
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> findduplicate.findDuplicate(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> findduplicate.findDuplicate(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> findduplicate.findDuplicate(null));
        }
    }
}
