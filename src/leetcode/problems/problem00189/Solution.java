package leetcode.problems.problem00189;

import java.util.Arrays;

public class Solution {

    public void rotate(int[] nums, int k) {
        if (k < 0 || k % nums.length == 0) {
            return;
        }

        int[] copy = Arrays.copyOf(nums, nums.length);

        for (int i = k; i < nums.length + k; i++) {
            nums[i % nums.length] = copy[i - k];
        }
    }
}
