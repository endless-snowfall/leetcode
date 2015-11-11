package leetcode.problems.problem00063;

public class Solution {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid.length <= 0 || obstacleGrid[0].length <= 0 || obstacleGrid[0][0] == 1) {
            return 0;
        }

        initializeMatrix(obstacleGrid);
        calculateUniquePaths(obstacleGrid);

        return obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }

    private void initializeMatrix(int[][] obstracleGrid) {
        obstracleGrid[0][0] = (obstracleGrid[0][0] == 1) ? 0 : 1;

        // initialize first row
        for (int i = 1; i < obstracleGrid[0].length; i++) {
            obstracleGrid[0][i] = (obstracleGrid[0][i] == 1) ? 0 : obstracleGrid[0][i - 1];
        }

        // initialize first column
        for (int i = 1; i < obstracleGrid.length; i++) {
            obstracleGrid[i][0] = (obstracleGrid[i][0] == 1) ? 0 : obstracleGrid[i - 1][0];
        }
    }

    private void calculateUniquePaths(int[][] obstracleGrid) {
        for (int i = 1; i < obstracleGrid.length; i++) {
            for (int j = 1; j < obstracleGrid[0].length; j++) {
                obstracleGrid[i][j] = (obstracleGrid[i][j] == 1) ? 0 : obstracleGrid[i][j - 1] + obstracleGrid[i - 1][j];
            }
        }
    }
}
