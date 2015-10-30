package leetcode.problems.problem00049;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if (strs == null || strs.length == 0) {
            return result;
        }

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] keyChars = str.toCharArray();
            Arrays.sort(keyChars);
            String key = Arrays.toString(keyChars);

            map.computeIfAbsent(key, v -> new ArrayList<String>());

            List<String> group = map.get(key);
            group.add(str);
            map.put(key, group);
        }

        for (List<String> group : map.values()) {
            Collections.sort(group);
            result.add(group);
        }

        return result;
    }
}
