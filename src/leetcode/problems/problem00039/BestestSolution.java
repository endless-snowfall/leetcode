package leetcode.problems.problem00039;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BestestSolution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
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

        if (start + 1 < input.length && input[start + 1] == input[start]) {
            helper(input, target, start + 1, candidate, result);
            return;
        }

        int multiplier = 0;

        while (multiplier * input[start] <= target) {
            int newTarget = target - (multiplier * input[start]);

            if (newTarget == 0) {
                result.add(new ArrayList<>(candidate));
                break;
            }

            helper(input, newTarget, start + 1, candidate, result);

            candidate.add(input[start]);
            multiplier++;
        }

        remove(candidate, multiplier);
    }

    private void remove(LinkedList<Integer> list, int multiplier) {
        for (int i = 0; i < multiplier; i++) {
            list.removeLast();
        }
    }
}
