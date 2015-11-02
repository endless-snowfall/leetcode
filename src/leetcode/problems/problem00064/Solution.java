package leetcode.problems.problem00064;

public class Solution {

    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int m = grid.length;
        int n = grid[0].length;

        // initialize left-most column
        for (int row = 1; row < m; row++) {
            grid[row][0] = grid[row][0] + grid[row - 1][0];
        }

        // initialize top row
        for (int col = 1; col < n; col++) {
            grid[0][col] = grid[0][col] + grid[0][col - 1];
        }

        // populate values
        for (int row = 1; row < m; row++) {
            for (int col = 1; col < n; col++) {
                grid[row][col] = grid[row][col] + Math.min(grid[row - 1][col], grid[row][col - 1]);
            }
        }

        return grid[m - 1][n - 1];
    }
}
