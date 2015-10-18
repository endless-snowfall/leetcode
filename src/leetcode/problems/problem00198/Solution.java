package leetcode.problems.problem00198;

public class Solution {

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        }

        int[] fromTwoBefore = new int[nums.length];
        int[] fromThreeBefore = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int bestStashForIndex = nums[i] + Math.max(fromTwoBefore[i], fromThreeBefore[i]);
            if (i + 2 < nums.length) {
                fromTwoBefore[i + 2] += bestStashForIndex;
            }
            if (i + 3 < nums.length) {
                fromThreeBefore[i + 3] += bestStashForIndex;
            }
        }

        // System.out.println(Arrays.toString(nums));
        // System.out.println(Arrays.toString(fromTwoBefore));
        // System.out.println(Arrays.toString(fromThreeBefore));

        int candidate1 = getCandidateForIndex(nums.length - 2, nums, fromTwoBefore, fromThreeBefore);
        int candidate2 = getCandidateForIndex(nums.length - 1, nums, fromTwoBefore, fromThreeBefore);

        return Math.max(candidate1, candidate2);
    }

    private int getCandidateForIndex(int index, int[] nums, int[] fromTwoBefore, int[] fromThreeBefore) {
        return Math.max(nums[index] + fromTwoBefore[index], nums[index] + fromThreeBefore[index]);
    }
}
