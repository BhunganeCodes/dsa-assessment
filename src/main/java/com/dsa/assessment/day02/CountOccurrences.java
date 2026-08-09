package com.dsa.assessment.day02;

/**
 * Day 02 - CountOccurrences
 * 
 * TODO: Implement this class following TDD principles
 * 1. Run tests first (they should fail)
 * 2. Write minimum code to pass
 * 3. Refactor
 * 4. Commit after each passing test
 */
public class CountOccurrences {

    /**
     * TODO: Implement count(int[] sortedArray, int target)
     * 
     * @param sortedArray the sorted array, target value to count
     * @return int
     */
    public int count(int[] sortedArray, int target) {
        // TODO: Implement this method
        if (sortedArray == null || sortedArray.length == 0) return 0;
        int count = 0;

        for (int num : sortedArray) {
            if (num == target) count++;
        }
        return count;
    }
}
