package leetcode.problems.problem00268;

public class Solution {

    public int missingNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        boolean[] found = new boolean[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            found[nums[i]] = true;
        }

        return getMissing(found);
    }

    private int getMissing(boolean[] found) {
        for (int i = 0; i < found.length; i++) {
            if (!found[i]) {
                return i;
            }
        }
        return -1;
    }
}
