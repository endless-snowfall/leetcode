package leetcode.problems.problem00283;

public class Solution {

    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }

        int writeIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[writeIndex] = nums[i];
                writeIndex++;
            }
        }

        for (int i = writeIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
