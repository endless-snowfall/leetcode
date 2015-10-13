package leetcode.problems.problem00119;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<Integer> getRow(int rowIndex) {
        if (rowIndex < 0) {
            return null;
        }

        List<Integer> lastRow = Arrays.asList(1);

        for (int i = 0; i < rowIndex; i++) {
            List<Integer> newRow = new ArrayList<>();

            newRow.add(1);

            for (int j = 1; j < lastRow.size(); j++) {
                newRow.add(lastRow.get(j) + lastRow.get(j - 1));
            }

            newRow.add(1);
            lastRow = newRow;
        }

        return lastRow;
    }
}
