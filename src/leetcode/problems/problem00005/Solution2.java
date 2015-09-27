package leetcode.problems.problem00005;

public class Solution2 {

    public String longestPalindrome(String s) {
        String result = "";
        if (s == null || s.isEmpty()) {
            return result;
        }

        result = String.valueOf(s.charAt(0));

        for (int i = 0; i < s.length() - 1; i++) {
            String candidate = getLongestPalindromeAt(s, i, i);
            result = (candidate.length() > result.length()) ? candidate : result;

            candidate = getLongestPalindromeAt(s, i, i + 1);
            result = (candidate.length() > result.length()) ? candidate : result;
        }

        return result;
    }

    private String getLongestPalindromeAt(String s, int start, int end) {
        if (s.charAt(start) != s.charAt(end)) {
            return "";
        }

        while (start - 1 >= 0 && end + 1 < s.length() && s.charAt(start - 1) == s.charAt(end + 1)) {
            start--;
            end++;
        }

        return s.substring(start, end + 1);
    }
}
