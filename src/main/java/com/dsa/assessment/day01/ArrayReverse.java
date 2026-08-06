package com.dsa.assessment.day01;

/**
 * Day 01 - ArrayReverse
 * 
 * TODO: Implement this class following TDD principles
 * 1. Run tests first (they should fail)
 * 2. Write minimum code to pass
 * 3. Refactor
 * 4. Commit after each passing test
 */
public class ArrayReverse {

    /**
     * TODO: Implement reverse(int[] array)
     * 
     * @param array the input array
     * @return int[]
     */
    public int[] reverse(int[] array) {
        // TODO: Implement this method
        if (array == null) return null;
        int[] rev = new int[array.length];
        int j = 0;

        for (int i= array.length - 1; i >= 0; i--) {
            rev[j] = array[i];
            j++;
        }
        return rev;
    }
}
