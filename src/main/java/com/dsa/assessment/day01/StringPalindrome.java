package com.dsa.assessment.day01;

/**
 * Day 01 - StringPalindrome
 * 
 * TODO: Implement this class following TDD principles
 * 1. Run tests first (they should fail)
 * 2. Write minimum code to pass
 * 3. Refactor
 * 4. Commit after each passing test
 */
public class StringPalindrome {

    /**
     * TODO: Implement isPalindrome(String str)
     * 
     * @param str the input string
     * @return boolean
     */
    public boolean isPalindrome(String str) {
        // TODO: Implement this method
        char[] arr = str.toCharArray();
        int l = 0;
        int r = arr.length - 1;

        boolean palindrome = true;

        for (int i = 0; i < arr.length; i++) {
            if (l > r) break;
            if (arr[l] != arr[r]) palindrome = false;
            l++;
            r--;
        }
        return palindrome;
    }
}
