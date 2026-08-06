package com.dsa.assessment.day01;

/**
 * Day 01 - ArrayMin
 * 
 * TODO: Implement this class following TDD principles
 * 1. Run tests first (they should fail)
 * 2. Write minimum code to pass
 * 3. Refactor
 * 4. Commit after each passing test
 */
public class ArrayMin {

    /**
     * TODO: Implement findMin(int[] array)
     * 
     * @param array the input array
     * @return int
     */
    public int findMin(int[] array) {
        // TODO: Implement this method
        if (array == null || array.length == 0) return 0;
        int res = array[0];

        for (int num : array) {
            if (num < res) res = num;
        }
        return res;
    }
}
