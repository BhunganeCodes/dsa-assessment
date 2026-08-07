package com.dsa.assessment.day01;

/**
 * Day 01 - StringSubstring
 * 
 * TODO: Implement this class following TDD principles
 * 1. Run tests first (they should fail)
 * 2. Write minimum code to pass
 * 3. Refactor
 * 4. Commit after each passing test
 */
public class StringSubstring {

    /**
     * TODO: Implement substring(String str, int start, int end)
     * 
     * @param str the input string, start start index, end end index
     * @return String
     */
    public String substring(String str, int start, int end) {
        // TODO: Implement this method
        if (str == null) return null;
        if (start < 0 || end > str.length()) throw new StringIndexOutOfBoundsException();
        String res = "";

        for (int i = start; i < end; i++) {
            res += str.charAt(i);
        }
        return res;
    }
}
