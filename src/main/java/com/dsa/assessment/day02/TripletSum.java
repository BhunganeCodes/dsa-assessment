package com.dsa.assessment.day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Day 02 - TripletSum
 * 
 * TODO: Implement this class following TDD principles
 * 1. Run tests first (they should fail)
 * 2. Write minimum code to pass
 * 3. Refactor
 * 4. Commit after each passing test
 */
public class TripletSum {

    /**
     * TODO: Implement findTriplets(int[] array, int target)
     * 
     * @param array the input array, target the target sum
     * @return List<int[]>
     */
    public List<int[]> findTriplets(int[] array, int target) {
        // TODO: Implement this method
        List<int[]> result = new ArrayList<>();
        if (array == null) return result;

        Arrays.sort(array);

        for (int i = 0; i < array.length - 2; i++) {
            if (i > 0 && array[i] == array[i - 1]) continue;

            int left = i + 1;
            int right = array.length - 1;

            while (left < right) {
                int sum = array[left] + array[i] + array[right];

                if (sum == target) {
                    result.add(new int[]{array[i], array[left], array[right]});


                    while (left < right && array[left] == array[left + 1]) left++;
                    while (left < right && array[right] == array[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
}
