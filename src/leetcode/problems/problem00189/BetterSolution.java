package leetcode.problems.problem00189;

import java.util.Arrays;

public class BetterSolution {

    // [1,2,3,4,5,6]
    // [1,2,3,4,5,6], temp is 1
    // [1,2,1,4,5,6], temp is 3
    // [1,2,1,4,3,6], temp is 5
    // [1,2,7,4,5,6], temp is 6
    // [1,6,7,4,5,6], temp is 2
    // [1,6,7,4,2,6], temp is 5
    // [5,6,7,4,2,6], temp is 1
    // [5,6,7,1,2,6],

    // [5,6,7,1,2,3,4]

    public void rotate(int[] nums, int k) {
        if (k < 0 || k % nums.length == 0) {
            return;
        }

        int carry;

        if (nums.length % k != 0 || k == 1) {
            carry = nums[0];

            for (int i = 0; i < nums.length; i++) {
                System.out.println("carry: " + carry + ", nums: " + Arrays.toString(nums));
                int index = ((i + 1) * k) % nums.length;
                int nextCarry = nums[index];
                nums[index] = carry;
                carry = nextCarry;
            }
        } else {
            for (int i = 0; i < k; i++) {
                carry = nums[i];

                for (int j = 0; j < (nums.length / k); j++) {
                    System.out.println("carry: " + carry + ", nums: " + Arrays.toString(nums));
                    int index = (((j + 1) * k) + i) % nums.length;
                    int nextCarry = nums[index];
                    nums[index] = carry;
                    carry = nextCarry;
                }
            }
        }
    }
}
