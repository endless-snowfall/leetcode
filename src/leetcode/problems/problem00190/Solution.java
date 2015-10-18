package leetcode.problems.problem00190;

public class Solution {

    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        int mask = 1;

        for (int i = 0; i < 32; i++) {
            if ((n & mask) == mask) {
                result = setOne(result, 32 - i);
            }
            mask = mask << 1;
        }

        return result;
    }

    private int setOne(int result, int index) {
        int mask = 1 << index - 1;
        return (result | mask);
    }
}
