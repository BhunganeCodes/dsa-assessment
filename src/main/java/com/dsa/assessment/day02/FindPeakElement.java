package com.dsa.assessment.day02;

/**
 * Day 02 - FindPeakElement
 * 
 * TODO: Implement this class following TDD principles
 * 1. Run tests first (they should fail)
 * 2. Write minimum code to pass
 * 3. Refactor
 * 4. Commit after each passing test
 */
public class FindPeakElement {

    /**
     * TODO: Implement findPeak(int[] array)
     * 
     * @param array the input array
     * @return int
     */
    public int findPeak(int[] array) {
        // TODO: Implement this method
        if (array == null) return 0;
        int peak = 0;

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) peak = i;
        }
        return peak;
    }
}
