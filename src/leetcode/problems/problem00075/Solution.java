package leetcode.problems.problem00075;

public class Solution {

    public void sortColors(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }

        int red = 0;
        int white = 0;
        int blue = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                red++;
            } else if (nums[i] == 1) {
                white++;
            } else {
                blue++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (red > 0) {
                nums[i] = 0;
                red--;
            } else if (white > 0) {
                nums[i] = 1;
                white--;
            } else if (blue > 0) {
                nums[i] = 2;
                blue--;
            }
        }
    }
}
