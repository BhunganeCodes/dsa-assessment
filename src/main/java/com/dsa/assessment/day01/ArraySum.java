package com.dsa.assessment.day01;

/**
 * Day 01 - ArraySum
 * 
 * TODO: Implement this class following TDD principles
 * 1. Run tests first (they should fail)
 * 2. Write minimum code to pass
 * 3. Refactor
 * 4. Commit after each passing test
 */
public class ArraySum {

    /**
     * TODO: Implement sum(int[] array)
     * 
     * @param array the input array
     * @return int
     */
    public int sum(int[] array) {
        // TODO: Implement this method
        if (array == null) return 0;
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }
}
