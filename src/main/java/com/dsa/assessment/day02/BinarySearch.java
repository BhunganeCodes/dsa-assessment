package com.dsa.assessment.day02;

/**
 * Day 02 - BinarySearch
 * 
 * TODO: Implement this class following TDD principles
 * 1. Run tests first (they should fail)
 * 2. Write minimum code to pass
 * 3. Refactor
 * 4. Commit after each passing test
 */
public class BinarySearch {

    /**
     * TODO: Implement search(int[] sortedArray, int target)
     * 
     * @param sortedArray the sorted input array, target the value to find
     * @return int
     */
    public int search(int[] sortedArray, int target) {
        // TODO: Implement this method
        if (sortedArray == null) return -1;

        for (int i = 0; i < sortedArray.length; i++) {
            if (sortedArray[i] == target) return i;
        }
        return -1;
    }
}
