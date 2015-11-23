package leetcode.problems.problem00010;

public class Solution {

    public boolean isMatch(String s, String p) {
        if (s == null || p == null) {
            return false;
        }
        return helper(s, 0, p, 0);
    }

    private boolean helper(String s, int sIndex, String p, int pIndex) {
        if (pIndex == p.length()) {
            return (sIndex == s.length()) ? true : false;
        }

        Character patternChar = p.charAt(pIndex);
        Character nextPatternChar = (pIndex + 1 < p.length()) ? p.charAt(pIndex + 1) : null;

        if (sIndex == s.length()) {
            return (nextPatternChar == null || nextPatternChar != '*')
                ? false
                : helper(s, sIndex, p, pIndex + 2);
        }

        Character stringChar = s.charAt(sIndex);

        // next pattern char is a *
        if (nextPatternChar != null && nextPatternChar == '*') {
            if (patternChar == '.') {
                for (int i = 0; i <= s.length() - sIndex; i++) {
                    if (helper(s, sIndex + i, p, pIndex + 2)) {
                        return true;
                    }
                }
                return false;
            }

            // pattern char is alphabetic
            for (int i = 0; i <= s.length() - sIndex; i++) {
                if (helper(s, sIndex + i, p, pIndex + 2)) {
                    return true;
                }
                if (sIndex + i < s.length() && s.charAt(sIndex + i) != patternChar) {
                    break;
                }
            }
            return false;
        }

        if (patternChar == '.') {
            return helper(s, sIndex + 1, p, pIndex + 1);
        }

        // pattern char is alphabetic
        if (stringChar != patternChar) {
            return false;
        }
        return helper(s, sIndex + 1, p, pIndex + 1);
    }
}
