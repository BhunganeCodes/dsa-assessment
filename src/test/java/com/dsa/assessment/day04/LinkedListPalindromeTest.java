package com.dsa.assessment.day04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Day 04 - LinkedListPalindrome Tests")
class LinkedListPalindromeTest {

    private LinkedListPalindrome linkedlistpalindrome;

    @BeforeEach
    void setUp() {
        linkedlistpalindrome = new LinkedListPalindrome();
    }

    @Nested
    @DisplayName("Positive Test Cases")
    class PositiveTests {
        @Test
        @DisplayName("Should solve basic case")
        void shouldSolveBasicCase() {
            ListNode head = ListNode.fromArray(new int[]{1, 2, 3, 2, 1});
            assertTrue(linkedlistpalindrome.isPalindrome(head));
        }

        @Test
        @DisplayName("Should solve typical case")
        void shouldSolveTypicalCase() {
            ListNode head = ListNode.fromArray(new int[]{1, 2, 1});
            assertTrue(linkedlistpalindrome.isPalindrome(head));
        }

        @Test
        @DisplayName("Should solve with valid input")
        void shouldSolveWithValidInput() {
            ListNode head = ListNode.fromArray(new int[]{1, 2});
            assertFalse(linkedlistpalindrome.isPalindrome(head));
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle null input")
        void shouldHandleNullInput() {
            assertDoesNotThrow(() -> linkedlistpalindrome.isPalindrome(null));
        }

        @Test
        @DisplayName("Should handle empty input")
        void shouldHandleEmptyInput() {
            assertDoesNotThrow(() -> linkedlistpalindrome.isPalindrome(ListNode.fromArray(new int[]{})));
        }

        @Test
        @DisplayName("Should handle boundary condition")
        void shouldHandleBoundaryCondition() {
            ListNode head = ListNode.fromArray(new int[]{1});
            assertTrue(linkedlistpalindrome.isPalindrome(head));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should not throw unexpected exception")
        void shouldNotThrowUnexpectedException() {
            assertDoesNotThrow(() -> linkedlistpalindrome.isPalindrome(ListNode.fromArray(new int[]{1, 2, 3, 4, 5, 6, 7})));
        }

        @Test
        @DisplayName("Should handle invalid input gracefully")
        void shouldHandleInvalidInputGracefully() {
            assertDoesNotThrow(() -> linkedlistpalindrome.isPalindrome(null));
        }
    }
}
