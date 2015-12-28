package leetcode.problems.problem00015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConciseSolution {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums == null || nums.length < 3) {
            return result;
        }

        Arrays.sort(nums);
        int aIndex = 0;

        while (aIndex <= nums.length - 3 && nums[aIndex] <= 0) {
            int bIndex = aIndex + 1;
            int cIndex = nums.length - 1;

            if (nums[aIndex] > 0 || nums[cIndex] < 0) {
                break;
            } else if (nums[aIndex] + nums[cIndex] == Integer.MIN_VALUE
                || nums[aIndex] + nums[cIndex] == Integer.MAX_VALUE) {
                break;
            }

            while (bIndex < cIndex && cIndex > aIndex) {
                int aPlusC = (nums[aIndex] + nums[cIndex]) * -1;

                if (nums[bIndex] == aPlusC) {
                    result.add(Arrays.asList(nums[aIndex], nums[bIndex], nums[cIndex]));
                    bIndex = advance(nums, bIndex);
                    cIndex = retreat(nums, cIndex);
                } else if (nums[bIndex] > aPlusC) {
                    cIndex = retreat(nums, cIndex);
                } else {
                    bIndex = advance(nums, bIndex);
                }
            }

            aIndex = advance(nums, aIndex);
        }

        return result;
    }

    private int advance(int[] nums, int previous) {
        for (int i = previous + 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                return i;
            }
        }
        return nums.length;
    }

    private int retreat(int[] nums, int previous) {
        for (int i = previous - 1; i > 0; i--) {
            if (nums[i] != nums[i + 1]) {
                return i;
            }
        }
        return -1;
    }
}
