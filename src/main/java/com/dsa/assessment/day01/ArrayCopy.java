package com.dsa.assessment.day01;

/**
 * Day 01 - ArrayCopy
 * 
 * TODO: Implement this class following TDD principles
 * 1. Run tests first (they should fail)
 * 2. Write minimum code to pass
 * 3. Refactor
 * 4. Commit after each passing test
 */
public class ArrayCopy {

    /**
     * TODO: Implement copy(int[] array)
     * 
     * @param array the input array
     * @return int[]
     */
    public int[] copy(int[] array) {
        // TODO: Implement this method
        if (array == null) return null;
        int[] newArr = new int[array.length];
        for (int i=0; i< array.length; i++) {
            newArr[i] = array[i];
        }
        return newArr;
    }
}
