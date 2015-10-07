package leetcode.problems.problem00204;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {

    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        Boolean[] isPrime = createTrueBooleanArray(n);
        isPrime[0] = false;
        isPrime[1] = false;

        IntStream.range(2, n)
            .forEach(i -> setFalseForMultiples(i, isPrime));

        return (int) Arrays.stream(isPrime)
            .filter(i -> i)
            .count();
    }

    private void setFalseForMultiples(int prime, Boolean[] isPrime) {
        if (Integer.MAX_VALUE / prime < prime) {
            return;
        }
        for (int i = prime * prime; i < isPrime.length; i += prime) {
            isPrime[i] = false;
        }
    }

    private Boolean[] createTrueBooleanArray(int size) {
        Boolean[] result = new Boolean[size];
        Arrays.fill(result, true);
        return result;
    }
}
