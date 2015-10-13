package leetcode.problems.problem00088;

public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums1.length == 0) {
            return;
        } else if (nums2 == null || nums2.length == 0) {
            return;
        }

        // Shift elements in num1 to the right by n positions
        for (int i = m - 1; i >= 0; i--) {
            nums1[n + i] = nums1[i];
        }

        int nums1Index = n;
        int nums2Index = 0;

        // Begin writing
        for (int i = 0; i < m + n; i++) {
            // Careful if one of the indices goes out of bounds because that
            // array is done processing
            int num1Number = (nums1Index < n + m) ? nums1[nums1Index] : Integer.MAX_VALUE;
            int num2Number = (nums2Index < n) ? nums2[nums2Index] : Integer.MAX_VALUE;
            int smaller;

            if (num1Number <= num2Number) {
                smaller = num1Number;
                nums1Index++;
            } else {
                smaller = num2Number;
                nums2Index++;
            }

            nums1[i] = smaller;
        }
    }
}
