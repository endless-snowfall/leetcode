package leetcode.problems.problem00036;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.TestBase;

public class SolutionTest extends TestBase {

    private Solution solution;

    @Before
    public void before() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertFalse(solution.isValidSudoku(null));
    }

    @Test
    public void test2() {
        char[][] board = new char[][] {
            { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
            { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
            { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
            { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
            { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
            { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
            { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
            { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
            { '.', '.', '.', '.', '8', '.', '.', '7', '9' },

        };

        assertTrue(solution.isValidSudoku(board));
    }

    @Test
    public void test3() {
        char[][] board = new char[][] {
            { '1', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '2', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '3', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '4', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '5', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '6', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '7', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '8', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '9', '.', '.', '.', '.', '.', '.', '.', '.' },

        };

        assertTrue(solution.isValidSudoku(board));
    }

    @Test
    public void test4() {
        char[][] board = new char[][] {
            { '1', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '2', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '3', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '4', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '5', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '6', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '7', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '8', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '1', '.', '.', '.', '.', '.', '.', '.', '.' },

        };

        assertFalse(solution.isValidSudoku(board));
    }

    @Test
    public void test5() {
        char[][] board = new char[][] {
            { '1', '2', '3', '4', '5', '6', '7', '8', '9' },
            { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.', '.', '.' },

        };

        assertTrue(solution.isValidSudoku(board));
    }

    @Test
    public void test6() {
        char[][] board = new char[][] {
            { '1', '2', '3', '4', '5', '6', '7', '8', '1' },
            { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.', '.', '.' },

        };

        assertFalse(solution.isValidSudoku(board));
    }

    @Test
    public void test7() {
        char[][] board = new char[][] {
            { '1', '2', '3', '.', '.', '.', '.', '.', '.' },
            { '4', '5', '6', '.', '.', '.', '.', '.', '.' },
            { '7', '8', '9', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.', '.', '.' },

        };

        assertTrue(solution.isValidSudoku(board));
    }

    @Test
    public void test8() {
        char[][] board = new char[][] {
            { '1', '2', '3', '.', '.', '.', '.', '.', '.' },
            { '4', '5', '6', '.', '.', '.', '.', '.', '.' },
            { '7', '8', '1', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.', '.', '.' },
            { '.', '.', '.', '.', '.', '.', '.', '.', '.' },

        };

        assertFalse(solution.isValidSudoku(board));
    }
}