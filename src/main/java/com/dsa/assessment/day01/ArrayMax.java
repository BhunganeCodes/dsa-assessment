package com.dsa.assessment.day01;

/**
 * Day 01 - ArrayMax
 * 
 * TODO: Implement this class following TDD principles
 * 1. Run tests first (they should fail)
 * 2. Write minimum code to pass
 * 3. Refactor
 * 4. Commit after each passing test
 */
public class ArrayMax {

    /**
     * TODO: Implement findMax(int[] array)
     * 
     * @param array the input array
     * @return int
     */
    public int findMax(int[] array) {
        // TODO: Implement this method
        int res = array[0];

        for (int num : array) {
            if (num > res) {
                res = num;
            }
        }
        return res;
    }
}
