package leetcode.problems.problem00026;

public class ConciseSolution {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int writeIndex = 1;
        int readIndex = 1;

        while (readIndex < nums.length) {
            if (nums[readIndex] != nums[readIndex - 1]) {
                nums[writeIndex] = nums[readIndex];
                writeIndex++;
            }
            readIndex++;
        }

        return writeIndex;
    }
}
