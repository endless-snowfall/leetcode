package leetcode.problems.problem00118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if (numRows < 1) {
            return result;
        }

        result.add(Arrays.asList(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> lastRow = result.get(i - 1);
            List<Integer> newRow = new ArrayList<>();

            newRow.add(1);

            for (int j = 1; j < lastRow.size(); j++) {
                newRow.add(lastRow.get(j) + lastRow.get(j - 1));
            }

            newRow.add(1);
            result.add(newRow);
        }

        return result;
    }
}
