package leetcode.problems.problem00136;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        Set<Integer> set = new HashSet<>();

        Arrays.stream(nums).forEach(n -> {
            if (set.contains(n)) {
                set.remove(n);
            } else {
                set.add(n);
            }
        });

        return set.iterator().next();
    }
}
