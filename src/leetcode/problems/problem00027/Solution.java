package leetcode.problems.problem00027;

public class Solution {

    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int left = 0;
        int right = nums.length - 1;

        // Gotcha
        while (left <= right) {
            if (nums[left] != val) {
                left++;
                continue;
            }

            if (nums[right] == val) {
                right--;
                continue;
            }

            nums[left] = nums[right];
            left++;
            right--;
        }

        return left;
    }
}
