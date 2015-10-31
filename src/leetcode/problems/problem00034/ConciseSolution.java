package leetcode.problems.problem00034;

public class ConciseSolution {

    public int[] searchRange(int[] nums, int target) {
        int[] result = { -1, -1 };

        if (nums == null || nums.length == 0) {
            return result;
        }

        int low = binarySearch(nums, target - 0.5);

        // Be care for there , low>=A.length must be check first or
        // there may be a out of boundary exception cause
        // the binarySearch function in this question return low instead of null
        // if the target are not in the array

        if (low >= nums.length || nums[low] != target) {
            return result;
        }

        result[0] = low;
        result[1] = binarySearch(nums, target + 0.5) - 1;

        return result;
    }

    public int binarySearch(int[] nums, double target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
