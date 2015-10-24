package leetcode.problems.problem00189;

public class BetterSolution {

    public void rotate(int[] nums, int k) {
        if (k < 0 || k % nums.length == 0) {
            return;
        }

        int gcd = gcd(nums.length, k);
        int lcm = nums.length * k / gcd;

        int rotationLoopSize = lcm / k;
        int numRotations = nums.length / rotationLoopSize;

        for (int i = 0; i < numRotations; i++) {
            int carry = nums[i];

            for (int j = 0; j < rotationLoopSize; j++) {
                int index = (i + (j + 1) * k) % nums.length;
                int nextCarry = nums[index];
                nums[index] = carry;
                carry = nextCarry;
            }
        }
    }

    private int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
}
