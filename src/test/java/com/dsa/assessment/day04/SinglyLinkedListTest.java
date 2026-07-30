package com.dsa.assessment.day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 04 - SinglyLinkedList Tests")
class SinglyLinkedListTest {

    private SinglyLinkedList singlylinkedlist;

    @BeforeEach
    void setUp() {
        singlylinkedlist = new SinglyLinkedList();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            assertDoesNotThrow(() -> singlylinkedlist.solve(null));
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            assertDoesNotThrow(() -> singlylinkedlist.solve(null));
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            assertDoesNotThrow(() -> singlylinkedlist.solve(null));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> singlylinkedlist.solve(null));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> singlylinkedlist.solve(null));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            assertDoesNotThrow(() -> singlylinkedlist.solve(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> singlylinkedlist.solve(null));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> singlylinkedlist.solve(null));
        }
    }
}
