package leetcode.problems.problem00067;

public class Solution {

    public String addBinary(String a, String b) {
        if (a == null && b == null) {
            return null;
        } else if (a == null || b == null) {
            return (a == null) ? b : a;
        } else if (a.length() == 0 && b.length() == 0) {
            return "";
        } else if (a.length() == 0 || b.length() == 0) {
            return (a.length() == 0) ? b : a;
        }

        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        boolean carry = false;

        StringBuilder resultBuilder = new StringBuilder();

        while (aIndex >= 0 || bIndex >= 0) {
            char aDigit = '\0';
            char bDigit = '\0';

            if (aIndex >= 0) {
                aDigit = a.charAt(aIndex);
                aIndex--;
            }
            if (bIndex >= 0) {
                bDigit = b.charAt(bIndex);
                bIndex--;
            }

            char newDigit = '\0';

            if (aDigit == '1' && bDigit == '1') {
                if (carry) {
                    newDigit = '1';
                } else {
                    newDigit = '0';
                    carry = true;
                }
            } else if (aDigit == '1' || bDigit == '1') {
                newDigit = (carry) ? '0' : '1';
            } else {
                if (carry) {
                    newDigit = '1';
                    carry = false;
                } else {
                    newDigit = '0';
                }
            }

            resultBuilder.insert(0, newDigit);
        }

        if (carry) {
            resultBuilder.insert(0, '1');
        }

        return resultBuilder.toString();
    }
}
