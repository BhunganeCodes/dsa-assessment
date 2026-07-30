package com.dsa.assessment.day04;

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
        @DisplayName("Should return true for palindrome")
        void shouldReturnTrueForPalindrome() {
            ListNode head = ListNode.fromArray(new int[]{1, 2, 2, 1});
            assertThat(${class_name,,}.isPalindrome(head)).isTrue();
        }

        @Test
        @DisplayName("Should return false for non-palindrome")
        void shouldReturnFalseForNonPalindrome() {
            ListNode head = ListNode.fromArray(new int[]{1, 2, 3});
            assertThat(${class_name,,}.isPalindrome(head)).isFalse();
        }

        @Test
        @DisplayName("Should return true for single element")
        void shouldReturnTrueForSingleElement() {
            ListNode head = ListNode.fromArray(new int[]{1});
            assertThat(${class_name,,}.isPalindrome(head)).isTrue();
        }
    }

    @Nested
    @DisplayName("Edge Cases")
    class EdgeCases {
        @Test
        @DisplayName("Should handle edge case 1")
        void shouldHandleEdgeCase1() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> linkedlistpalindrome.isPalindrome(null));
        }

        @Test
        @DisplayName("Should handle edge case 2")
        void shouldHandleEdgeCase2() {
            // TODO: Add appropriate edge case test
            assertDoesNotThrow(() -> linkedlistpalindrome.isPalindrome(null));
        }
    }

    @Nested
    @DisplayName("Negative Test Cases")
    class NegativeTests {
        @Test
        @DisplayName("Should throw exception for invalid input")
        void shouldThrowExceptionForInvalidInput() {
            // TODO: Add appropriate negative test
            assertThrows(Exception.class, () -> linkedlistpalindrome.isPalindrome(null));
        }
    }
}
