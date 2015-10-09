package leetcode.problems.problem00223;

public class Solution {

    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area1 = computeRectilinearArea(A, B, C, D);
        int area2 = computeRectilinearArea(E, F, G, H);

        int overlap = (C <= E || A >= G || B >= H || F >= D)
            ? 0
            : computeRectilinearArea(
                Math.max(A, E), Math.max(B, F),
                Math.min(C, G), Math.min(D, H));

        return area1 + area2 - overlap;
    }

    private int computeRectilinearArea(int x1, int y1, int x2, int y2) {
        return (y2 - y1) * (x2 - x1);
    }
}
