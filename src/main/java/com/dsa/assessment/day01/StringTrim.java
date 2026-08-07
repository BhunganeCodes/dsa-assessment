package com.dsa.assessment.day01;

/**
 * Day 01 - StringTrim
 * 
 * TODO: Implement this class following TDD principles
 * 1. Run tests first (they should fail)
 * 2. Write minimum code to pass
 * 3. Refactor
 * 4. Commit after each passing test
 */
public class StringTrim {

    /**
     * TODO: Implement trim(String str)
     * 
     * @param str the input string
     * @return String
     */
    public String trim(String str) {
        // TODO: Implement this method
        if (str == null) return null;
        int start = 0;
        int end = str.length();

        while (start < end && Character.isWhitespace(str.charAt(start))) {
            start++;
        }

        while (end > start && Character.isWhitespace(str.charAt(end - 1))) {
            end--;
        }

        return str.substring(start, end);
    }
}
