package com.dsa.assessment.day02;

/**
 * Day 02 - FindFloor
 * 
 * TODO: Implement this class following TDD principles
 * 1. Run tests first (they should fail)
 * 2. Write minimum code to pass
 * 3. Refactor
 * 4. Commit after each passing test
 */
public class FindFloor {

    /**
     * TODO: Implement findFloor(int[] sortedArray, int target)
     * 
     * @param sortedArray the sorted array, target value to find floor for
     * @return int
     */
    public int findFloor(int[] sortedArray, int target) {
        // TODO: Implement this method
        if (sortedArray == null) return 0;

        int res = 0;

        for (int num : sortedArray) {
            if (num <= target) {
                res = num;
                break;
            }
        }
        return res;
    }
}
