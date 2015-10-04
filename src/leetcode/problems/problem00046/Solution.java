package leetcode.problems.problem00046;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return result;
        }

        result = helper(nums, 0);
        return result;
    }

    private List<List<Integer>> helper(int[] nums, int pivotIndex) {
        if (pivotIndex == nums.length - 1) {
            List<Integer> newList = new ArrayList<>();
            newList.add(nums[pivotIndex]);
            List<List<Integer>> result = new ArrayList<>();
            result.add(newList);
            return result;
        }

        List<List<Integer>> intermediateResults = helper(nums, pivotIndex + 1);
        List<List<Integer>> newResult = new ArrayList<>();

        for (List<Integer> intermediateResult : intermediateResults) {
            for (int i = 0; i <= intermediateResult.size(); i++) {
                List<Integer> copy = new ArrayList<>(intermediateResult);
                copy.add(i, nums[pivotIndex]);
                newResult.add(copy);
            }
        }

        return newResult;
    }
}
