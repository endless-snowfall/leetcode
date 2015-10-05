package leetcode.problems.problem00047;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return result;
        }

        Arrays.sort(nums);
        helper(nums, result, new ArrayList<>(), new boolean[nums.length], 0);
        return result;
    }

    private void helper(int[] nums, List<List<Integer>> result, List<Integer> permutation, boolean[] used, int numUsed) {
        // Approach is to build permutations from an empty list, so when we
        // reach the same length as the input, we've generated a new
        // permutation.
        if (numUsed == nums.length) {
            result.add(new ArrayList<>(permutation));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // Skip elements that have been used OR
            // Duplicate numbers where the duplicates have not been used
            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
                continue;
            }

            used[i] = true;
            permutation.add(nums[i]);

            // Each time we recurse we redo the for loop above but only process
            // unused elements
            helper(nums, result, permutation, used, numUsed + 1);

            used[i] = false;
            permutation.remove(permutation.size() - 1);
        }
    }
}
