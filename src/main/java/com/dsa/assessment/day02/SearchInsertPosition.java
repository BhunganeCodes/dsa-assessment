package com.dsa.assessment.day02;

/**
 * Day 02 - SearchInsertPosition
 * 
 * TODO: Implement this class following TDD principles
 * 1. Run tests first (they should fail)
 * 2. Write minimum code to pass
 * 3. Refactor
 * 4. Commit after each passing test
 */
public class SearchInsertPosition {

    /**
     * TODO: Implement searchInsert(int[] sortedArray, int target)
     * 
     * @param sortedArray the sorted array, target value to insert
     * @return int
     */
    public int searchInsert(int[] sortedArray, int target) {
        // TODO: Implement this method
        if (sortedArray != null) {
            for (int i = 0; i < sortedArray.length; i++) {
                if (sortedArray[i] >= target) {
                    return i;
                } else if (sortedArray[i] == target) {
                    return i - 1;
                }
            }
            return sortedArray.length;
        }
        return 0;
    }
}
