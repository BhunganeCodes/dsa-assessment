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
        if (x == 0) return x;

        long low = 1, high = x, ans = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            if ( mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        } return (int) ans;
    }
}
