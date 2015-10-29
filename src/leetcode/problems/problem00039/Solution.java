package leetcode.problems.problem00039;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates == null || candidates.length == 0) {
            return new ArrayList<>();
        }

        Arrays.sort(candidates);
        return helper(candidates, target, 0);
    }

    private List<List<Integer>> helper(int[] input, int target, int start) {
        List<List<Integer>> result = new ArrayList<>();

        if (start == input.length || input[start] > target) {
            return result;
        }

        for (int i = start; i < input.length; i++) {
            if (i + 1 < input.length && input[i + 1] == input[i]) {
                continue;
            }

            List<Integer> candidate = new ArrayList<>();
            candidate.add(input[i]);
            int multiplier = 1;

            while (multiplier * input[i] <= target) {
                int newTarget = target - (multiplier * input[i]);

                if (newTarget == 0) {
                    result.add(candidate);
                    break;
                }

                List<List<Integer>> recursiveResults = helper(input, newTarget, i + 1);
                result.addAll(listMultiply(candidate, recursiveResults));

                candidate.add(input[i]);
                multiplier++;
            }
        }

        return result;
    }

    private List<List<Integer>> listMultiply(List<Integer> list1, List<List<Integer>> list2) {
        List<List<Integer>> result = new ArrayList<>();

        for (List<Integer> suffix : list2) {
            List<Integer> subResult = new ArrayList<>(list1);
            subResult.addAll(suffix);
            result.add(subResult);
        }

        return result;
    }
}
