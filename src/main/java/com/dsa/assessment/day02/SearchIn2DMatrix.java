package com.dsa.assessment.day02;

/**
 * Day 02 - SearchIn2DMatrix
 * 
 * TODO: Implement this class following TDD principles
 * 1. Run tests first (they should fail)
 * 2. Write minimum code to pass
 * 3. Refactor
 * 4. Commit after each passing test
 */
public class SearchIn2DMatrix {

    /**
     * TODO: Implement searchMatrix(int[][] matrix, int target)
     * 
     * @param matrix the 2D matrix, target value to find
     * @return boolean
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // TODO: Implement this method
        if (matrix != null) {
            for (int[] innerMatrix : matrix) {
                for (int num : innerMatrix) {
                    if (num == target) return true;
                }
            }
        }
        return false;
    }
}
