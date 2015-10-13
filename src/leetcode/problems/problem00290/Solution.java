package leetcode.problems.problem00290;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public boolean wordPattern(String pattern, String str) {
        if (pattern == null || str == null) {
            return false;
        } else if (isEmptyOrOnlySpaces(str)) {
            return (pattern.length() == 0);
        }

        Map<Character, String> mapping = new HashMap<>();
        Set<String> mappedWords = new HashSet<>();
        StringBuilder wordBuilder = new StringBuilder();

        int patternIndex = 0;
        int stringIndex = 0;

        while (patternIndex < pattern.length() || stringIndex < str.length()) {
            // We've run out of pattern characters
            if (patternIndex >= pattern.length()) {
                return isOnlySpacesFrom(str, stringIndex);
            }

            Character patternChar = pattern.charAt(patternIndex);
            patternIndex++;

            boolean foundWord = false;
            while (stringIndex < str.length()) {
                char stringCharacter = str.charAt(stringIndex);
                stringIndex++;

                if (stringCharacter == ' ') {
                    if (foundWord) {
                        break;
                    }
                } else {
                    foundWord = true;
                    wordBuilder.append(stringCharacter);
                }
            }

            if (!foundWord) {
                return false;
            }

            if (!matches(mapping, mappedWords, patternChar, wordBuilder.toString())) {
                return false;
            }
            wordBuilder.setLength(0);
        }

        return true;
    }

    private boolean matches(Map<Character, String> mapping, Set<String> mappedWords, Character pattern, String word) {
        boolean patternIsMapped = mapping.containsKey(pattern);
        boolean wordIsMapped = mappedWords.contains(word);

        if (patternIsMapped) {
            return word.equals(mapping.get(pattern));
        } else if (wordIsMapped) {
            return false;
        }

        mapping.put(pattern, word);
        mappedWords.add(word);
        return true;
    }

    private boolean isEmptyOrOnlySpaces(String str) {
        if (str == null) {
            return false;
        } else if (str.length() == 0) {
            return true;
        }

        return isOnlySpacesFrom(str, 0);
    }

    private boolean isOnlySpacesFrom(String str, int stringIndex) {
        for (int i = stringIndex; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                return false;
            }
        }
        return true;
    }
}
