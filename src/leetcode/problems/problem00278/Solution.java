package leetcode.problems.problem00278;

public class Solution extends VersionControl {

    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int result = n;

        while (start >= 1 && end <= n && start <= end) {
            if (start == end) {
                result = start;
                break;
            }

            int mid = ((end - start) / 2) + start;
            if (isBadVersion(mid)) {
                if (mid == 1 || !isBadVersion(mid - 1)) {
                    result = mid;
                    break;
                }
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return result;
    }
}
