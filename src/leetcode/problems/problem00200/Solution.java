package leetcode.problems.problem00200;

public class Solution {

    public int numIslands(char[][] grid) {
        int result = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    result++;
                    sink(grid, i, j);
                }
            }
        }

        return result;
    }

    private void sink(char[][] grid, int row, int col) {
        if (row < 0 || row >= grid.length
            || col < 0 || col >= grid[0].length
            || grid[row][col] == '0') {
            return;
        }

        grid[row][col] = '0';
        sink(grid, row - 1, col);
        sink(grid, row + 1, col);
        sink(grid, row, col - 1);
        sink(grid, row, col + 1);
    }
}
