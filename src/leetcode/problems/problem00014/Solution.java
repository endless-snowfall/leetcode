package leetcode.problems.problem00014;

public class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }

        int shortestLengthIndex = getIndexOfShortestString(strs);
        String shortestString = strs[shortestLengthIndex];

        if (shortestString.length() == 0) {
            return "";
        }

        StringBuilder prefixBuilder = new StringBuilder();
        boolean stop = false;

        for (int charIndex = 0; charIndex < shortestString.length(); charIndex++) {
            char currentChar = shortestString.charAt(charIndex);

            for (int arrayIndex = 0; arrayIndex < strs.length; arrayIndex++) {
                if (arrayIndex == shortestLengthIndex) {
                    continue;
                }
                if (strs[arrayIndex].charAt(charIndex) != currentChar) {
                    stop = true;
                }
            }

            if (stop) {
                break;
            }

            prefixBuilder.append(currentChar);
        }

        return prefixBuilder.toString();
    }

    private int getIndexOfShortestString(String[] strs) {
        int result = 0;
        int length = strs[0].length();

        for (int i = 1; i < strs.length; i++) {
            int candidateLength = strs[i].length();
            if (candidateLength < length) {
                result = i;
                length = candidateLength;
            }
        }
        return result;
    }
}
