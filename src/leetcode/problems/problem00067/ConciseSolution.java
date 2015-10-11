package leetcode.problems.problem00067;

public class ConciseSolution {

    public String addBinary(String a, String b) {
        if (a == null && b == null) {
            return null;
        } else if (a == null || b == null) {
            return (a == null) ? b : a;
        }

        int ai = a.length() - 1;
        int bi = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        while (ai >= 0 || bi >= 0) {
            int aint = ai < 0 ? 0 : a.charAt(ai--);
            int bint = bi < 0 ? 0 : b.charAt(bi--);
            int t = aint + bint + carry;
            result.append(t & 1);
            carry = (t >> 1) & 1;
        }

        if (carry > 0)
            result.append("1");

        return result.reverse().toString();
    }
}
