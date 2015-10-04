package leetcode.problems.problem00090;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    private Map<Integer, Integer> lastIndex;

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            List<Integer> emptySet = new ArrayList<>();
            result.add(emptySet);
            return result;
        }

        Arrays.sort(nums);
        populateLastIndex(nums);
        helper(nums, 0, result);
        return result;
    }

    private void populateLastIndex(int[] nums) {
        lastIndex = new HashMap<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (!lastIndex.containsKey(nums[i])) {
                lastIndex.put(nums[i], i);
            }
        }
    }

    private void helper(int[] nums, int i, List<List<Integer>> result) {
        if (i >= nums.length) {
            result.add(new ArrayList<>());
            return;
        }

        int num = nums[i];
        helper(nums, i + 1, result);
        List<List<Integer>> copyOfResult = new ArrayList<>();

        for (List<Integer> subset : result) {
            if (!isLastOccurrence(num, i) && (subset.isEmpty() || subset.get(0) != num)) {
                continue;
            }
            List<Integer> newSubset = new ArrayList<>(subset);
            newSubset.add(0, num);

            if (!result.contains(newSubset)) {
                copyOfResult.add(newSubset);
            }
        }

        result.addAll(copyOfResult);
    }

    private boolean isLastOccurrence(int num, int i) {
        return lastIndex.get(num) == i;
    }
}
