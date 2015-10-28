package leetcode.problems.problem00034;

public class Solution {

    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[] { -1, -1 };

        if (nums == null || nums.length == 0) {
            return result;
        }

        int indexOfAnyTarget = binarySearch(nums, target, 0, nums.length - 1);

        if (indexOfAnyTarget == -1) {
            return result;
        }

        int start = findStart(nums, target, 0, indexOfAnyTarget);
        int end = findEnd(nums, target, indexOfAnyTarget, nums.length);
        result[0] = start;
        result[1] = end;

        return result;
    }

    private int findStart(int[] nums, int target, int start, int end) {
        if (start == end) {
            return start;
        }

        int mid = ((end - start) / 2) + start;

        if (nums[mid] != target) {
            return findStart(nums, target, mid + 1, end);
        } else if (mid == 0) {
            return mid;
        } else if (nums[mid - 1] != target) {
            return mid;
        } else {
            return findStart(nums, target, start, mid - 1);
        }
    }

    private int findEnd(int[] nums, int target, int start, int end) {
        if (start == end) {
            return start;
        }

        int mid = ((end - start) / 2) + start;

        if (nums[mid] != target) {
            return findEnd(nums, target, start, mid - 1);
        } else if (mid == nums.length - 1) {
            return mid;
        } else if (nums[mid + 1] != target) {
            return mid;
        } else {
            return findEnd(nums, target, mid + 1, end);
        }
    }

    private int binarySearch(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = ((end - start) / 2) + start;

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            return binarySearch(nums, target, mid + 1, end);
        } else {
            return binarySearch(nums, target, start, mid - 1);
        }
    }
}
