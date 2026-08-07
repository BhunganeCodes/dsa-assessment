package com.dsa.assessment.day01;

/**
 * Day 01 - ArraySort
 * 
 * TODO: Implement this class following TDD principles
 * 1. Run tests first (they should fail)
 * 2. Write minimum code to pass
 * 3. Refactor
 * 4. Commit after each passing test
 */
public class ArraySort {

    /**
     * TODO: Implement sort(int[] array)
     * 
     * @param array the input array
     * @return int[]
     */
    public int[] sort(int[] array) {
        // TODO: Implement this method
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return array;
    }
}
