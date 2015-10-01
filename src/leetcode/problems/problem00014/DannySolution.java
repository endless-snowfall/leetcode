package leetcode.problems.problem00014;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DannySolution {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null) {
            return "";
        }

        return Arrays.stream(strs)
            .reduce(this::commonPrefix)
            .orElse("");
    }

    private String commonPrefix(String s1, String s2) {
        int shorterLength = Math.min(s1.length(), s2.length());
        int lastIndex = IntStream.range(0, shorterLength)
            .filter(i -> s1.charAt(i) != s2.charAt(i))
            .findFirst()
            .orElse(shorterLength);
        return s1.substring(0, lastIndex);
    }
}