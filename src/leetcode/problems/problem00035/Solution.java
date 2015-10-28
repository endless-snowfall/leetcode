package leetcode.problems.problem00035;

public class Solution {

    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        return helper(nums, target, 0, nums.length - 1);
    }

    private int helper(int[] nums, int target, int start, int end) {
        int mid = ((end - start) / 2) + start;

        if (nums[mid] == target) {
            return mid;
        } else if (mid == 0 && target < nums[0]) {
            return 0;
        } else if (mid == nums.length - 1 && target > nums[nums.length - 1]) {
            return nums.length;
        } else if (nums[mid] < target) {
            if (target < nums[mid + 1]) {
                return mid + 1;
            }
            return helper(nums, target, mid + 1, end);
        } else { // (target < nums[mid])
            if (nums[mid - 1] < target) {
                return mid;
            }
            return helper(nums, target, start, mid - 1);
        }
    }
}
