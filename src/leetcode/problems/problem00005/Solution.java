package leetcode.problems.problem00005;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {

    public String convert(String s, int numRows) {
        if (s == null || s.isEmpty() || numRows < 1) {
            return "";
        } else if (numRows == 1 | numRows > s.length()) {
            return s;
        }

        int[] rowAssignment = new int[s.length()];
        rowAssignment[0] = 0;
        boolean increasingDirection = true;

        for (int i = 1; i < s.length(); i++) {
            int previousRowAssignment = rowAssignment[i - 1];

            if (previousRowAssignment == 0) {
                increasingDirection = true;
            } else if (previousRowAssignment == numRows - 1) {
                increasingDirection = false;
            }

            rowAssignment[i] = (increasingDirection)
                ? previousRowAssignment + 1
                : previousRowAssignment - 1;
        }

        StringBuilder[] builders = new StringBuilder[numRows];
        IntStream.range(0, numRows).forEach(i -> builders[i] = new StringBuilder());

        for (int i = 0; i < rowAssignment.length; i++) {
            builders[rowAssignment[i]].append(s.charAt(i));
        }

        StringBuilder resultBuilder = new StringBuilder();
        Arrays.stream(builders).forEachOrdered(builder -> resultBuilder.append(builder));

        return resultBuilder.toString();
    }
}
