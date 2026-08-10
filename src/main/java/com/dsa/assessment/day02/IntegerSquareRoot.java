package com.dsa.assessment.day02;

/**
 * Day 02 - IntegerSquareRoot
 * 
 * TODO: Implement this class following TDD principles
 * 1. Run tests first (they should fail)
 * 2. Write minimum code to pass
 * 3. Refactor
 * 4. Commit after each passing test
 */
public class IntegerSquareRoot {

    /**
     * TODO: Implement sqrt(int x)
     * 
     * @param x the input number
     * @return int
     */
    public int sqrt(int x) {
        // TODO: Implement this method

        int i = 0;
        while (i * i <= x) {
            i++;
        }
        return i - 1;
    }
}
