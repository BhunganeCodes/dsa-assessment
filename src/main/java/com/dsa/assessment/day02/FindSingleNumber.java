package com.dsa.assessment.day02;

import java.util.HashMap;

/**
 * Day 02 - FindSingleNumber
 * 
 * TODO: Implement this class following TDD principles
 * 1. Run tests first (they should fail)
 * 2. Write minimum code to pass
 * 3. Refactor
 * 4. Commit after each passing test
 */
public class FindSingleNumber {

    /**
     * TODO: Implement findSingle(int[] array)
     * 
     * @param array array where every element appears twice except one
     * @return int
     */
    public int findSingle(int[] array) {
        // TODO: Implement this method
        if (array == null) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int single = 0;

        for (int num : array) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            }
            map.put(num, 1);
            single = num;
        }
        
        return 0;
    }
}
