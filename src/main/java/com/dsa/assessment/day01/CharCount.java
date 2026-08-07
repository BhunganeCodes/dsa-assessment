package com.dsa.assessment.day01;

/**
 * Day 01 - CharCount
 * 
 * TODO: Implement this class following TDD principles
 * 1. Run tests first (they should fail)
 * 2. Write minimum code to pass
 * 3. Refactor
 * 4. Commit after each passing test
 */
public class CharCount {

    /**
     * TODO: Implement countChar(String str, char target)
     * 
     * @param str the input string, target the character to count
     * @return int
     */
    public int countChar(String str, char target) {
        // TODO: Implement this method
        if (str == null) return 0;
        char[] charArray = str.toCharArray();
        int count = 0;

        for (char ch : charArray) {
            if (ch == target) count++;
        }
        return count;
    }
}
