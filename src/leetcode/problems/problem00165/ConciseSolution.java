package leetcode.problems.problem00165;

import java.util.Arrays;

public class ConciseSolution {

    private static final String DOT = "\\.";

    public int compareVersion(String version1, String version2) {
        String[] v1Parts = version1.split(DOT);
        String[] v2Parts = version2.split(DOT);

        System.out.println(Arrays.toString(v1Parts));

        for (int i = 0; i < Math.max(v1Parts.length, v2Parts.length); i++) {
            int v1 = (i < v1Parts.length && v1Parts[i].length() > 0) ? Integer.valueOf(v1Parts[i]) : 0;
            int v2 = (i < v2Parts.length && v2Parts[i].length() > 0) ? Integer.valueOf(v2Parts[i]) : 0;

            if (v1 > v2) {
                return 1;
            } else if (v2 > v1) {
                return -1;
            }
        }

        return 0;
    }
}
