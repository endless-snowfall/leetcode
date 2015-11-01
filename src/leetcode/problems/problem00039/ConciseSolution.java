package leetcode.problems.problem00039;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConciseSolution {

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        Arrays.sort(nums);
        helper(nums, 0, target, new ArrayList<Integer>(), result);
        return result;
    }

    public void helper(int[] nums, int index, int target, List<Integer> candidate, List<List<Integer>> result) {
        if (index > nums.length - 1 || target < 0) {
            return;
        }

        if (target == 0) {
            List<Integer> newResult = new ArrayList<Integer>(candidate);
            result.add(newResult);
            return;
        }

        if (index > 0 && nums[index] == nums[index - 1]) {
            helper(nums, index + 1, target, candidate, result);
            return;
        }

        if (nums[index] > target) {
            return;
        }

        helper(nums, index + 1, target, candidate, result);

        candidate.add(nums[index]);
        helper(nums, index, target - nums[index], candidate, result);
        candidate.remove(candidate.size() - 1);
    }
}
