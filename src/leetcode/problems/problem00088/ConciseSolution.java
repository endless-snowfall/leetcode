package leetcode.problems.problem00088;

public class ConciseSolution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int writeIndex = m + n - 1;
        int nums1Index = m - 1;
        int nums2Index = n - 1;

        while (nums1Index >= 0 && nums2Index >= 0) {
            if (nums1[nums1Index] > nums2[nums2Index]) {
                nums1[writeIndex] = nums1[nums1Index];
                nums1Index--;
            } else {
                nums1[writeIndex] = nums2[nums2Index];
                nums2Index--;
            }
            writeIndex--;
        }

        if (nums1Index >= 0) {
            while (nums1Index >= 0) {
                nums1[writeIndex] = nums1[nums1Index];
                writeIndex--;
                nums1Index--;
            }
        } else if (nums2Index >= 0) {
            while (nums2Index >= 0) {
                nums1[writeIndex] = nums2[nums2Index];
                writeIndex--;
                nums2Index--;
            }
        }
    }
}
