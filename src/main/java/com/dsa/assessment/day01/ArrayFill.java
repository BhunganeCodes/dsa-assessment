package com.dsa.assessment.day01;

/**
 * Day 01 - ArrayFill
 * 
 * TODO: Implement this class following TDD principles
 * 1. Run tests first (they should fail)
 * 2. Write minimum code to pass
 * 3. Refactor
 * 4. Commit after each passing test
 */
public class ArrayFill {

    /**
     * TODO: Implement fill(int size, int value)
     * 
     * @param size the array size, value the fill value
     * @return int[]
     */
    public int[] fill(int size, int value) {
        // TODO: Implement this method
        if (size < 0) throw new IllegalArgumentException("Value cannot be less than 0.");
        int[] result = new int[size];
        for (int i = 0; i<size; i++) {
            result[i] = value;
        }
        return result;
    }
}
