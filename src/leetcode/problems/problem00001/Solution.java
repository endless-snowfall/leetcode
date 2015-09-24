package leetcode.problems.problem00001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] noAnswer = new int[0];

        if (nums.length < 2) {
            return noAnswer;
        }

        Map<Integer, List<Integer>> numberToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            addToMap(numberToIndex, nums[i], i);
        }

        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;

        while (left != right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                int[] result = new int[2];
                result[0] = getFromMap(numberToIndex, nums[left]) + 1;
                result[1] = getFromMap(numberToIndex, nums[right]) + 1;
                Arrays.sort(result);
                return result;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }

        return noAnswer;
    }

    private void addToMap(Map<Integer, List<Integer>> map, int value, int index) {
        map.putIfAbsent(value, new ArrayList<>());
        List<Integer> indices = map.get(value);
        indices.add(index);
        map.put(value, indices);
    }

    private int getFromMap(Map<Integer, List<Integer>> map, int key) {
        List<Integer> indices = map.get(key);
        int result = indices.get(0);
        indices.remove(0);
        map.put(key, indices);
        return result;
    }
}
