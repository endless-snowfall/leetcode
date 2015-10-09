package leetcode.problems.problem00205;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public boolean isIsomorphic(String s, String t) {
        if ((s == null && t == null) || (s.length() == 0 && t.length() == 0)) {
            return true;
        }

        Map<Character, Character> sToTMapping = new HashMap<>();
        Set<Character> mappedCharsOfT = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sToTMapping.containsKey(sChar)) {
                char expectedTChar = sToTMapping.get(sChar);
                if (expectedTChar != tChar) {
                    return false;
                }
            } else {
                if (mappedCharsOfT.contains(tChar)) {
                    return false;
                }
                sToTMapping.put(sChar, tChar);
                mappedCharsOfT.add(tChar);
            }
        }

        return true;
    }
}
