package com.dsa.assessment.day02;

/**
 * Day 02 - FirstOccurrence
 * 
 * TODO: Implement this class following TDD principles
 * 1. Run tests first (they should fail)
 * 2. Write minimum code to pass
 * 3. Refactor
 * 4. Commit after each passing test
 */
public class FirstOccurrence {

    /**
     * TODO: Implement findFirst(int[] sortedArray, int target)
     * 
     * @param sortedArray the sorted array with duplicates, target value to find
     * @return int
     */
    public int findFirst(int[] sortedArray, int target) {
        // TODO: Implement this method
        if (sortedArray == null || sortedArray.length == 0) return -1;

        for (int i = 0; i < sortedArray.length; i++) {
            if (sortedArray[i] == target) return i;
        }

        return -1;
    }
}
