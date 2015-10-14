package leetcode.problems.problem00028;

public class Solution {

    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        } else if (needle.length() == 0) {
            return 0;
        } else if (haystack.length() == 0) {
            return -1;
        }

        char firstCharOfNeedle = needle.charAt(0);

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == firstCharOfNeedle
                && matches(i, haystack, needle)) {
                return i;
            }
        }

        return -1;
    }

    private boolean matches(int index, String haystack, String needle) {
        for (int i = 1; i < needle.length(); i++) {
            if (haystack.charAt(index + i) != needle.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
