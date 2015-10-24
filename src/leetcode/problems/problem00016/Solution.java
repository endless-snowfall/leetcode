package leetcode.problems.problem00016;

import java.util.Arrays;

public class Solution {

    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) {
            return -1;
        }

        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        int aIndex = 0;

        while (aIndex <= nums.length - 3) {
            int bIndex = aIndex + 1;
            int cIndex = nums.length - 1;

            while (bIndex < cIndex && bIndex < nums.length && cIndex > aIndex) {
                int sum = nums[aIndex] + nums[bIndex] + nums[cIndex];

                if (sum == target) {
                    return target;
                }

                if (Math.abs(target - sum) < Math.abs(target - result)) {
                    result = sum;
                }

                if (sum > target) {
                    cIndex = retreat(nums, cIndex - 1);
                } else {
                    bIndex = advance(nums, bIndex + 1);
                }
            }

            aIndex = advance(nums, aIndex + 1);
        }

        return result;
    }

    private int advance(int[] nums, int start) {
        for (int i = start; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                return i;
            }
        }
        return nums.length;
    }

    private int retreat(int[] nums, int start) {
        for (int i = start; i > 0; i--) {
            if (nums[i] != nums[i + 1]) {
                return i;
            }
        }
        return 0;
    }
}