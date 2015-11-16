package leetcode.problems.problem00151;

public class Solution {

    public String reverseWords(String s) {
        if (s == null || s.length() == 0 || !s.contains(" ")) {
            return s;
        }

        String[] words = s.split(" ");
        StringBuilder builder = new StringBuilder();
        String delimiter = "";

        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) {
                builder.append(delimiter).append(words[i]);
                delimiter = " ";
            }
        }

        return builder.toString();
    }
}
