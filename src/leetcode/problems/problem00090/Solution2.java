package leetcode.problems.problem00090;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution2 {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result.add(new ArrayList<Integer>());

        if (nums == null || nums.length == 0) {
            return result;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int curSize = result.size();

            for (int j = 0; j < curSize; j++) {
                List<Integer> cur = new ArrayList<>(result.get(j));
                cur.add(nums[i]);
                if (!result.contains(cur)) {
                    result.add(cur);
                }
            }
        }

        return result;
    }
}
