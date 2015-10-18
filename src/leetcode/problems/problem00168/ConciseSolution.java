package leetcode.problems.problem00168;

public class ConciseSolution {

    public String convertToTitle(int n) {
        StringBuilder builder = new StringBuilder();

        while (n > 0) {
            n--; // 1 => a, not 0 => a
            int remainder = n % 26;
            char digit = (char) (remainder + 65);
            builder.append(digit);
            n = (n - remainder) / 26;
        }

        return builder.reverse().toString();
    }
}
