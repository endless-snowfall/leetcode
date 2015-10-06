package leetcode.problems.problem00242;

import java.util.Arrays;

public class Solution {

    public boolean isAnagram(String s, String t) {
        if (s == null && t == null) {
            return true;
        } else if (s == null && t != null) {
            return false;
        } else if (s != null && t == null) {
            return false;
        } else if (s.length() != t.length()) {
            return false;
        }

        return helper(s, t);
    }

    private boolean helper(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return Arrays.equals(tChars, sChars);
    }
}
