package leetcode.problems.problem00062;

public class DPSolution {

    public int uniquePaths(int m, int n) {
        if (m <= 0 || n <= 0) {
            return 0;
        } else if (m == 1 || n == 1) {
            return 1;
        }

        return helper(m, n);
    }

    private int helper(int m, int n) {
        int[][] matrix = new int[m][n];
        initializeMatrix(matrix);
        calculateUniquePaths(matrix);
        return matrix[m - 1][n - 1];
    }

    private void initializeMatrix(int[][] matrix) {
        // initialize first row
        for (int i = 1; i < matrix[0].length; i++) {
            matrix[0][i] = 1;
        }

        // initialize first column
        for (int i = 1; i < matrix.length; i++) {
            matrix[i][0] = 1;
        }
    }

    private void calculateUniquePaths(int[][] matrix) {
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                matrix[i][j] = matrix[i][j - 1] + matrix[i - 1][j];
            }
        }
    }
}
