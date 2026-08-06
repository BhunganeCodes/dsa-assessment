package com.dsa.assessment.day01;

import java.util.Arrays;
import java.util.Objects;

/**
 * Day 01 - ArraySecondLargest
 * 
 * TODO: Implement this class following TDD principles
 * 1. Run tests first (they should fail)
 * 2. Write minimum code to pass
 * 3. Refactor
 * 4. Commit after each passing test
 */
public class ArraySecondLargest {

    /**
     * TODO: Implement findSecondLargest(int[] array)
     *
     * @param array the input array
     * @return int
     */
    public int findSecondLargest(int[] array) {
        // TODO: Implement this method
       if (array == null || array.length <= 2) throw new IllegalArgumentException();
        Arrays.sort(array);
        int[] res = new int[array.length];
        boolean allSame = true;

        for (int i = 0; i < array.length; i++) {
            res[i] = array[i];
            if (res[i] != res[0]) {
                allSame = false;
            }
        }
        if (allSame) throw new IllegalArgumentException();
        return res[res.length - 2];
    }
}
