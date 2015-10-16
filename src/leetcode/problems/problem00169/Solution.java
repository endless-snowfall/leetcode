package leetcode.problems.problem00169;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int majorityElement(int[] nums) {
        if (nums.length < 3) {
            return nums[0];
        }

        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            int prevCount = (map.containsKey(nums[i])) ? map.get(nums[i]) : 0;
            if (prevCount == nums.length / 2) {
                result = nums[i];
                break;
            }
            prevCount++;
            map.put(nums[i], prevCount);
        }

        return result;
    }
}
