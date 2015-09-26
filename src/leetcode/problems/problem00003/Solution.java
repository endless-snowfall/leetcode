package leetcode.problems.problem00003;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        if (s.length() == 1) {
            return 1;
        }

        int result = 1;
        int startIndex = 0;
        Map<Character, Integer> charIndex = new HashMap<>();
        charIndex.put(s.charAt(0), 0);

        for (int i = 1; i < s.length(); i++) {
            Character currentChar = s.charAt(i);
            if (charIndex.containsKey(currentChar)) {
                int lastIndex = charIndex.get(currentChar);

                if (lastIndex >= startIndex) {
                    int candidateResult = i - startIndex;
                    startIndex = lastIndex + 1;

                    if (candidateResult > result) {
                        result = candidateResult;
                    }
                }
            }
            charIndex.put(currentChar, i);
        }

        int candidateResult = s.length() - startIndex;
        if (candidateResult > result) {
            result = candidateResult;
        }

        return result;
    }
}