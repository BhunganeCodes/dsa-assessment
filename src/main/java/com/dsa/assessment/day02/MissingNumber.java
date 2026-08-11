package com.dsa.assessment.day02;

import java.util.HashMap;

/**
 * Day 02 - MissingNumber
 * 
 * TODO: Implement this class following TDD principles
 * 1. Run tests first (they should fail)
 * 2. Write minimum code to pass
 * 3. Refactor
 * 4. Commit after each passing test
 */
public class MissingNumber {

    /**
     * TODO: Implement findMissing(int[] array)
     * 
     * @param array array containing 0 to n with one missing
     * @return int
     */
    public int findMissing(int[] array) {
        // TODO: Implement this method
        if (array == null) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <= array.length; i++) {
            map.put(i,i);
        }

        for (int num : array) {
            if (map.containsKey(num)) {
                map.remove(num);
            }
        }

        int res = -1;

        for (int num : map.keySet()) {
            res = num;
        }

        return res;
    }
}
