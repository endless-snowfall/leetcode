package leetcode.problems.problem00040;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        if (candidates == null || candidates.length == 0) {
            return result;
        }

        Arrays.sort(candidates);
        helper(candidates, target, 0, new LinkedList<>(), result);
        return result;
    }

    private void helper(int[] input, int target, int start, LinkedList<Integer> candidate, List<List<Integer>> result) {
        if (start == input.length || input[start] > target) {
            return;
        }

        while (start < input.length) {
            candidate.add(input[start]);
            int newTarget = target - input[start];

            if (newTarget == 0) {
                result.add(new ArrayList<>(candidate));
                candidate.removeLast();
                break;
            }

            helper(input, newTarget, start + 1, candidate, result);
            candidate.removeLast();

            do {
                start++;
            } while (start < input.length && input[start] == input[start - 1]);
        }
    }
}
