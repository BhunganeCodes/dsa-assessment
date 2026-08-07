package com.dsa.assessment.day01;

/**
 * Day 01 - StringReverse
 * 
 * TODO: Implement this class following TDD principles
 * 1. Run tests first (they should fail)
 * 2. Write minimum code to pass
 * 3. Refactor
 * 4. Commit after each passing test
 */
public class StringReverse {

    /**
     * TODO: Implement reverse(String str)
     * 
     * @param str the input string
     * @return String
     */
    public String reverse(String str) {
        // TODO: Implement this method

        char[] arr = str.toCharArray();
        String res = "";

        for (char ch : arr) {
            res = ch + res;
        }

        return res;
    }
}
