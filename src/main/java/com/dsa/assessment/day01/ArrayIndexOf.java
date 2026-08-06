package com.dsa.assessment.day01;

/**
 * Day 01 - ArrayIndexOf
 * 
 * TODO: Implement this class following TDD principles
 * 1. Run tests first (they should fail)
 * 2. Write minimum code to pass
 * 3. Refactor
 * 4. Commit after each passing test
 */
public class ArrayIndexOf {

    /**
     * TODO: Implement indexOf(int[] array, int target)
     * 
     * @param array the input array, target the value to find
     * @return int
     */
    public int indexOf(int[] array, int target) {
        // TODO: Implement this method
        if (array == null) return -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) return i;
        }
        return -1;
    }
}
