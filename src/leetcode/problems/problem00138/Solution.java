package leetcode.problems.problem00138;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {

    public int[] singleNumber(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if (seen.contains(current)) {
                seen.remove(current);
            } else {
                seen.add(current);
            }
        }

        int[] result = new int[2];
        Iterator<Integer> iterator = seen.iterator();
        result[0] = iterator.next();
        result[1] = iterator.next();
        return result;
    }
}
