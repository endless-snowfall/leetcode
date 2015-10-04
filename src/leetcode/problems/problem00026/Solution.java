package leetcode.problems.problem00026;

public class Solution {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int writeIndex = 1;
        int start = 1;
        start = advanceIndex(nums, start);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[writeIndex] = nums[i];
                writeIndex++;
                i = advanceIndex(nums, i);
            }
        }

        return writeIndex;
    }

    private int advanceIndex(int[] nums, int start) {
        while (start + 1 < nums.length && nums[start + 1] == nums[start]) {
            start++;
        }
        return start;
    }
}
