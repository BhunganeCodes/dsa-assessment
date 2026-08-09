package com.dsa.assessment.day02;

import java.util.HashMap;

/**
 * Day 02 - FindDuplicate
 * 
 * TODO: Implement this class following TDD principles
 * 1. Run tests first (they should fail)
 * 2. Write minimum code to pass
 * 3. Refactor
 * 4. Commit after each passing test
 */
public class FindDuplicate {

    /**
     * TODO: Implement findDuplicate(int[] array)
     * 
     * @param array array with one duplicate
     * @return int
     */
    public int findDuplicate(int[] array) {
        // TODO: Implement this method
        if (array == null) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        int duplicate = 0;

        for (int num : array) {
            if (map.containsKey(num)) {
                map.replace(num, map.get(num) + 1);
                duplicate = num;
            }
            map.put(num, 1);
        }
        return duplicate;
    }
}
