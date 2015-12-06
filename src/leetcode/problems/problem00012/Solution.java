package leetcode.problems.problem00012;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {

    private static final Map<Integer, String> valueToDigit = Collections.unmodifiableMap(Stream.of(
        entry(1000, "M"),
        entry(900, "CM"),
        entry(500, "D"),
        entry(400, "CD"),
        entry(100, "C"),
        entry(90, "XC"),
        entry(50, "L"),
        entry(40, "XL"),
        entry(10, "X"),
        entry(9, "IX"),
        entry(5, "V"),
        entry(4, "IV"),
        entry(1, "I"))
        .collect(entriesToLinkedHashMap()));

    public String integerToRoman(int n) {
        StringBuilder resultBuilder = new StringBuilder();

        for (Map.Entry<Integer, String> entry : valueToDigit.entrySet()) {
            int digitCount = n / entry.getKey();
            append(resultBuilder, entry.getValue(), digitCount);
            n -= digitCount * entry.getKey();
        }

        return resultBuilder.toString();
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

    private void append(StringBuilder builder, String str, int numTimes) {
        IntStream.range(0, numTimes).forEach(i -> builder.append(str));
    }
}
