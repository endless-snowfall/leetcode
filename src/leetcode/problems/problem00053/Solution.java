package leetcode.problems.problem00053;

public class Solution {

    public int maxSubArray(int[] nums) {
        int result = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int candidate = 0;

            for (int j = i; j < nums.length; j++) {
                candidate += nums[j];

                if (candidate > result) {
                    result = candidate;
                }
            }
        }

        return result;
    }
}
