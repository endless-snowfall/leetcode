package leetcode.problems.problem00165;

public class Solution {

    private static final char DOT = '.';

    public int compareVersion(String version1, String version2) {
        int version1Start = 0;
        int version1End = version1.indexOf(DOT);

        int version2Start = 0;
        int version2End = version2.indexOf(DOT);

        int v1;
        int v2;

        do {
            v1 = getVersion(version1, version1Start, version1End);
            v2 = getVersion(version2, version2Start, version2End);

            version1Start = updateStart(version1End);
            version1End = findNextDot(version1, version1End);
            version2Start = updateStart(version2End);
            version2End = findNextDot(version2, version2End);

        } while (v1 == v2 && (version1Start != -1 || version2Start != -1));

        if (v1 > v2) {
            return 1;
        } else if (v2 > v1) {
            return -1;
        }

        return 0;
    }

    private int updateStart(int version1End) {
        return (version1End == -1) ? -1 : version1End + 1;
    }

    private int findNextDot(String version, int versionEnd) {
        return (versionEnd == -1) ? -1 : version.indexOf(DOT, versionEnd + 1);
    }

    private int getVersion(String version, int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            return 0;
        } else if (endIndex == -1) {
            return Integer.valueOf(version.substring(startIndex));
        }
        return Integer.valueOf(version.substring(startIndex, endIndex));
    }
}
