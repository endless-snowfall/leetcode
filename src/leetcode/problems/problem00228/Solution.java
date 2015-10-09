package leetcode.problems.problem00228;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return result;
        }

        int start = nums[0];
        int end = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == end + 1) {
                end = nums[i];
            } else {
                result.add(getRangeString(start, end));
                start = nums[i];
                end = nums[i];
            }
        }

        result.add(getRangeString(start, end));
        return result;
    }

    private String getRangeString(int start, int end) {
        return (start == end)
            ? String.valueOf(start)
            : String.format("%s->%s", start, end);
    }
}
