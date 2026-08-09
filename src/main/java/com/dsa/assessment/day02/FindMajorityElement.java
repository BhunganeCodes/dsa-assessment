package com.dsa.assessment.day02;

import java.util.HashMap;

/**
 * Day 02 - FindMajorityElement
 * 
 * TODO: Implement this class following TDD principles
 * 1. Run tests first (they should fail)
 * 2. Write minimum code to pass
 * 3. Refactor
 * 4. Commit after each passing test
 */
public class FindMajorityElement {

    /**
     * TODO: Implement findMajority(int[] array)
     * 
     * @param array the input array
     * @return int
     */
    public int findMajority(int[] array) {
        // TODO: Implement this method
        if (array == null) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        int majority = 0;

        for (int num: array) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
                majority = num;
            }
            map.put(num, 1);
        }

        if (array.length == 1) {
            for (int num : array) majority = num;
        }

        return majority;
    }
}
