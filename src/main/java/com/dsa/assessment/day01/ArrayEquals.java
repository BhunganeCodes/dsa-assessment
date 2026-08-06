package com.dsa.assessment.day01;

/**
 * Day 01 - ArrayEquals
 * 
 * TODO: Implement this class following TDD principles
 * 1. Run tests first (they should fail)
 * 2. Write minimum code to pass
 * 3. Refactor
 * 4. Commit after each passing test
 */
public class ArrayEquals {

    /**
     * TODO: Implement equals(int[] arr1, int[] arr2)
     * 
     * @param arr1 first array, arr2 second array
     * @return boolean
     */
    public boolean equals(int[] arr1, int[] arr2) {
        // TODO: Implement this method
        if (arr1 == null && arr2 == null) return true;
        if (arr1.length != arr2.length) return false;
        for (int i=0; i< arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}
