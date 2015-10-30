package leetcode.problems.problem00055;

public class Solution {

    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        } else if (nums.length == 1) {
            return true;
        }

        int jumpRange = 0;
        int index = 0;

        while (index < nums.length - 1) {
            jumpRange = Math.max(nums[index], jumpRange);
            if (jumpRange == 0) {
                return false;
            }

            index++;
            jumpRange--;
        }

        return true;
    }
}
