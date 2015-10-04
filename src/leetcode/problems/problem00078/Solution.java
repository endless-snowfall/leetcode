package leetcode.problems.problem00078;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            List<Integer> emptySet = new ArrayList<>();
            result.add(emptySet);
            return result;
        }

        Arrays.sort(nums);
        helper(nums, 0, result);
        return result;
    }

    private List<List<Integer>> helper(int[] nums, int i, List<List<Integer>> result) {
        if (i >= nums.length) {
            result.add(new ArrayList<>());
            return result;
        }

        int num = nums[i];
        helper(nums, i + 1, result);

        List<List<Integer>> copyOfResult = new ArrayList<>();
        for (List<Integer> subset : result) {
            List<Integer> newSubset = new ArrayList<>(subset);
            newSubset.add(0, num);
            copyOfResult.add(newSubset);
        }

        result.addAll(copyOfResult);
        return result;
    }
}
