package leetcode.problems.problem00219;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return false;
        } else if (k == 0) {
            return false;
        }

        Set<Integer> window = new HashSet<>();
        for (int i = 0; i < k && i < nums.length; i++) {
            if (window.contains(nums[i])) {
                return true;
            }
            window.add(nums[i]);
        }

        for (int i = k; i < nums.length; i++) {
            if (window.contains(nums[i])) {
                return true;
            }
            window.remove(nums[i - k]);
            window.add(nums[i]);
        }

        return false;
    }
}
