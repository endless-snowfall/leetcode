package leetcode.problems.problem00058;

public class Solution {

    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int result = 0;
        boolean foundNonSpaceCharacter = false;

        for (int i = s.length() - 1; i >= 0; i--) {
            char character = s.charAt(i);
            if (character == ' ' && foundNonSpaceCharacter) {
                break;
            } else if (character != ' ') {
                foundNonSpaceCharacter = true;
                result++;
            }
        }

        return result;
    }
}
