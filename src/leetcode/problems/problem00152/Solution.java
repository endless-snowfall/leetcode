package leetcode.problems.problem00152;

public class Solution {

    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        }

        int result = Integer.MIN_VALUE;
        int index = 0;
        int start = 0;
        int end = 0;
        int numNegatives = 0;

        boolean foundStart = false;
        boolean foundEnd = false;

        while (index < nums.length) {
            boolean isLastIndex = (index == nums.length - 1);
            int currentNumber = nums[index];
            result = Math.max(result, currentNumber);

            if (currentNumber == 0) {
                if (!foundStart) {
                    index++;
                    continue;
                }
                end = index - 1;
                foundEnd = true;
            } else if (isLastIndex) {
                if (!foundStart) {
                    start = index;
                    end = index;
                    foundStart = true;
                    foundEnd = true;
                } else if (!foundEnd) {
                    end = index;
                    foundEnd = true;
                }
            } else {
                if (!foundStart) {
                    start = index;
                    foundStart = true;
                }
            }

            if (currentNumber < 0) {
                numNegatives++;
            }

            if (foundStart && (foundEnd || isLastIndex)) {
                result = Math.max(result, helper(nums, start, end, numNegatives));

                start = 0;
                end = 0;
                numNegatives = 0;
                foundStart = false;
                foundEnd = false;
            }

            index++;
        }

        return result;
    }

    private int helper(int[] nums, int start, int end, int numNegatives) {
        if (start == end) {
            return nums[start];
        } else if (numNegatives % 2 == 0) {
            return multiplyRange(nums, start, end);
        }

        int rangeProduct = 1;
        int candidateA = 1;
        int candidateB = 1;
        int firstNegativeIndex = getLeftMostNegativeIndex(nums, start, end);
        int lastNegativeIndex = getRightMostNegativeIndex(nums, start, end);

        for (int i = start; i <= end; i++) {
            rangeProduct *= nums[i];

            if (i <= firstNegativeIndex) {
                candidateA *= nums[i];
            }

            if (i >= lastNegativeIndex) {
                candidateB *= nums[i];
            }
        }

        return Math.max(rangeProduct / candidateA, rangeProduct / candidateB);
    }

    private int multiplyRange(int[] nums, int start, int end) {
        int result = 1;
        for (int i = start; i <= end; i++) {
            result *= nums[i];
        }
        return result;
    }

    private int getLeftMostNegativeIndex(int[] nums, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (nums[i] < 0) {
                return i;
            }
        }
        return end;
    }

    private int getRightMostNegativeIndex(int[] nums, int start, int end) {
        for (int i = end; i >= start; i--) {
            if (nums[i] < 0) {
                return i;
            }
        }
        return end;
    }
}
