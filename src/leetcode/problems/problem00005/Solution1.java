package leetcode.problems.problem00005;

public class Solution1 {

    public String longestPalindrome(String s) {
        String result = "";
        if (s == null || s.isEmpty()) {
            return result;
        }

        result = getLongestSingleCharacterCenteredPalindrome(s);
        return getLongestDoubleCharacterCenteredPalindrome(s, result);
    }

    private String getLongestSingleCharacterCenteredPalindrome(String s) {
        String result = String.valueOf(s.charAt(0));
        return getLongestPalindrome(s, result, Solution1::isPalindrome, 0, -1, 1, 1);
    }

    private String getLongestDoubleCharacterCenteredPalindrome(String s, String result) {
        int pairCenter = findFirstPairCenterIndex(s);
        if (pairCenter == -1) {
            return result;
        }

        if (result.length() == 1) {
            result = s.substring(pairCenter, pairCenter + 2);
        }

        return getLongestPalindrome(s, result, Solution1::isPairCenteredPalindrome, pairCenter, pairCenter - 1, pairCenter + 2, 2);
    }

    private String getLongestPalindrome(
            String input,
            String resultCandidate,
            TriFunction<String, Integer, Integer, Boolean> function,
            int center,
            int start,
            int end,
            int palindromeCenterLength) {
        String result = resultCandidate;

        while (center >= 0 && center < input.length()) {
            if (start >= 0 && end < input.length()) {
                if (function.apply(input, start, end)) {
                    if (end - start + 1 > result.length()) {
                        result = input.substring(start, end + 1);
                    }
                    start--;
                    end++;
                    continue;
                }
            }
            center++;
            start = center - 1;
            end = center + palindromeCenterLength;
        }

        return result;
    }

    private static boolean isPalindrome(String s, int start, int end) {
        return s.charAt(start) == s.charAt(end);
    }

    private static boolean isPairCenteredPalindrome(String s, int start, int end) {
        return s.charAt(start) == s.charAt(end) && s.charAt(start + 1) == s.charAt(end - 1);
    }

    private int findFirstPairCenterIndex(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                return i;
            }
        }
        return -1;
    }

    @FunctionalInterface
    public interface TriFunction<T, U, V, R> {

        R apply(T t, U u, V v);
    }
}
