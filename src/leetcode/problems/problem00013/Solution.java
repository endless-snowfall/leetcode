package leetcode.problems.problem00013;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    private static final Map<String, Integer> DIGIT_TO_VALUE = Collections.unmodifiableMap(Stream.of(
        entry("M", 1000),
        entry("CM", 900),
        entry("D", 500),
        entry("CD", 400),
        entry("C", 100),
        entry("XC", 90),
        entry("L", 50),
        entry("XL", 40),
        entry("X", 10),
        entry("IX", 9),
        entry("V", 5),
        entry("IV", 4),
        entry("I", 1))
        .collect(entriesToLinkedHashMap()));

    public int romanToInt(String s) {
        int result = 0;
        int readIndex = 0;

        while (readIndex < s.length()) {
            String oneCharCandidate = String.valueOf(s.charAt(readIndex));

            if (readIndex != s.length() - 1) {
                String twoCharCandidate = oneCharCandidate + s.charAt(readIndex + 1);
                if (DIGIT_TO_VALUE.containsKey(twoCharCandidate)) {
                    result += DIGIT_TO_VALUE.get(twoCharCandidate);
                    readIndex += 2;
                    continue;
                }
            }

            result += DIGIT_TO_VALUE.get(oneCharCandidate);
            readIndex++;
        }

        return result;
    }

    private static <K, V> Map.Entry<K, V> entry(K key, V value) {
        return new AbstractMap.SimpleEntry<>(key, value);
    }

    private static <K, U> Collector<Map.Entry<K, U>, ?, Map<K, U>> entriesToLinkedHashMap() {
        return Collectors.toMap(
            (e) -> e.getKey(),
            (e) -> e.getValue(),
            (u, v) -> {
                throw new IllegalStateException(String.format("Duplicate key %s", u));
            } ,
            LinkedHashMap::new);
    }
}
