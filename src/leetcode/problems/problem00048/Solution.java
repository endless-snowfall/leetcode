package leetcode.problems.problem00048;

public class Solution {

    public void rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }

        helper(matrix, 0);
    }

    private void helper(int[][] matrix, int layer) {
        if (matrix.length - (2 * layer) < 2) {
            return;
        }

        int topRowIndex = layer;
        int bottomRowIndex = matrix.length - 1 - layer;
        int leftColumnIndex = layer;
        int rightColumnIndex = matrix.length - 1 - layer;

        int[] buffer1 = new int[matrix.length - (2 * layer)];
        int[] buffer2 = new int[matrix.length - (2 * layer)];

        // Save the top row
        readRow(matrix, topRowIndex, layer, buffer1);

        // Rotate the left column to the top row
        readColumn(matrix, leftColumnIndex, layer, buffer2);
        writeRow(matrix, topRowIndex, layer, buffer2);

        // Rotate bottom row to left column
        readRow(matrix, bottomRowIndex, layer, buffer2);
        writeColumn(matrix, leftColumnIndex, layer, buffer2);

        // Rotate the right column to the bottom row
        readColumn(matrix, rightColumnIndex, layer, buffer2);
        writeRow(matrix, bottomRowIndex, layer, buffer2);

        // Rotate the top row to the right column
        writeColumn(matrix, rightColumnIndex, layer, buffer1);

        helper(matrix, layer + 1);
    }

    private void readRow(int[][] matrix, int rowIndex, int layer, int[] buffer) {
        for (int i = 0; i < matrix.length - (2 * layer); i++) {
            buffer[i] = matrix[rowIndex][layer + i];
        }
    }

    private void writeRow(int[][] matrix, int rowIndex, int layer, int[] buffer) {
        for (int i = buffer.length - 1; i >= 0; i--) {
            matrix[rowIndex][layer + (buffer.length - 1 - i)] = buffer[i];
        }
        return;
    }

    private void readColumn(int[][] matrix, int columnIndex, int layer, int[] buffer) {
        for (int i = 0; i < matrix.length - (2 * layer); i++) {
            buffer[i] = matrix[layer + i][columnIndex];
        }
    }

    private void writeColumn(int[][] matrix, int columnIndex, int layer, int[] buffer) {
        for (int i = 0; i < buffer.length; i++) {
            matrix[layer + i][columnIndex] = buffer[i];
        }
    }
}
