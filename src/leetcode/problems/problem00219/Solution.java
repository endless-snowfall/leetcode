package leetcode.problems.problem00219;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return false;
        } else if (k == 0) {
            return true;
        }

        List<Integer> window = new ArrayList<>();
        for (int i = 0; i < k && k < nums.length; i++) {
            if (window.contains(nums[i])) {
                return true;
            }
            window.add(nums[i]);
        }

        for (int i = k; i < nums.length; i++) {
            if (window.contains(nums[i])) {
                return true;
            }
            window.remove(0);
            window.add(nums[i]);
        }

        return false;
    }
}
