package com.dsa.assessment.day01;

/**
 * Day 01 - StringStartsWith
 * 
 * TODO: Implement this class following TDD principles
 * 1. Run tests first (they should fail)
 * 2. Write minimum code to pass
 * 3. Refactor
 * 4. Commit after each passing test
 */
public class StringStartsWith {

    /**
     * TODO: Implement startsWith(String str, String prefix)
     * 
     * @param str the input string, prefix the prefix to check
     * @return boolean
     */
    public boolean startsWith(String str, String prefix) {
        // TODO: Implement this method
        if (str == null || prefix == null) return false;
        if (prefix.length() > str.length()) return false;

        for (int i = 0; i < prefix.length(); i++) {
            if (str.charAt(i) != prefix.charAt(i)) return false;
        }
        return true;
    }
}
