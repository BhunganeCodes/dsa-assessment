package com.dsa.assessment.day01;

/**
 * Day 01 - StringConcat
 * 
 * TODO: Implement this class following TDD principles
 * 1. Run tests first (they should fail)
 * 2. Write minimum code to pass
 * 3. Refactor
 * 4. Commit after each passing test
 */
public class StringConcat {

    /**
     * TODO: Implement concat(String[] strings)
     * 
     * @param strings array of strings to concatenate
     * @return String
     */
    public String concat(String[] strings) {
        // TODO: Implement this method
        String result = "";

        for (String str : strings) {
            result += str;
        }
        return result;
    }
}
