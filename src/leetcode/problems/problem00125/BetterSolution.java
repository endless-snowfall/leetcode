package leetcode.problems.problem00125;

public class BetterSolution {

    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (!isAlphaNumeric(s.charAt(left))) {
                left++;
                continue;
            }
            if (!isAlphaNumeric(s.charAt(right))) {
                right--;
                continue;
            }

            char ch1 = Character.toLowerCase(s.charAt(left));
            char ch2 = Character.toLowerCase(s.charAt(right));
            if (ch1 != ch2) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    private boolean isAlphaNumeric(char c) {
        return Character.isLetter(c) || Character.isDigit(c);
    }
}
