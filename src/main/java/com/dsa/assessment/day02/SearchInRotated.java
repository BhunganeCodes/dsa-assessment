package com.dsa.assessment.day02;

/**
 * Day 02 - SearchInRotated
 * 
 * TODO: Implement this class following TDD principles
 * 1. Run tests first (they should fail)
 * 2. Write minimum code to pass
 * 3. Refactor
 * 4. Commit after each passing test
 */
public class SearchInRotated {

    /**
     * TODO: Implement search(int[] rotatedArray, int target)
     * 
     * @param rotatedArray the rotated sorted array, target value to find
     * @return int
     */
    public int search(int[] rotatedArray, int target) {
        // TODO: Implement this method
        if (rotatedArray != null) {
            for (int i = 0; i < rotatedArray.length; i++) {
                if (rotatedArray[i] == target) return i;
            }
        }
        return -1;
    }
}
