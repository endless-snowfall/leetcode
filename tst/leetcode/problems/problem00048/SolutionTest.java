package leetcode.problems.problem00048;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.TestBase;

public class SolutionTest extends TestBase {

    private ConciseSolution solution;

    @Before
    public void before() {
        solution = new ConciseSolution();
    }

    @Test
    public void test1() {
        solution.rotate(null);
    }

    @Test
    public void test2() {
        int[][] matrix = new int[][] { { 1 } };
        solution.rotate(matrix);
        printMatrix(matrix);
    }

    @Test
    public void test3() {
        int[][] matrix = new int[][] {
            { 1, 2 },
            { 3, 4 } };
        solution.rotate(matrix);
        printMatrix(matrix);
    }

    @Test
    public void test4() {
        int[][] matrix = new int[][] {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 } };
        solution.rotate(matrix);
        printMatrix(matrix);
    }

    @Test
    public void test5() {
        int[][] matrix = new int[][] {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 16 } };
        solution.rotate(matrix);
        printMatrix(matrix);
    }

    private void printMatrix(int matrix[][]) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
