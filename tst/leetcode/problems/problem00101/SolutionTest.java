package leetcode.problems.problem00101;

import static leetcode.problems.common.TestUtils.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.TestBase;

public class SolutionTest extends TestBase {

    private Solution1 solution1;
    private Solution2 solution2;

    @Before
    public void before() {
        solution1 = new Solution1();
        solution2 = new Solution2();
    }

    @Test
    public void test1() {
        assertTrue(solution1.isSymmetric(null));
        assertTrue(solution2.isSymmetric(null));
    }

    @Test
    public void test2() {
        assertTrue(solution1.isSymmetric(createTree(1)));
        assertTrue(solution2.isSymmetric(createTree(1)));
    }

    @Test
    public void test3() {
        assertTrue(solution1.isSymmetric(createTree(1, 2, 2)));
        assertTrue(solution2.isSymmetric(createTree(1, 2, 2)));
    }

    @Test
    public void test4() {
        assertFalse(solution1.isSymmetric(createTree(1, 2, 3)));
        assertFalse(solution2.isSymmetric(createTree(1, 2, 3)));
    }

    @Test
    public void test5() {
        assertFalse(solution1.isSymmetric(createTree(1, 3, 2)));
        assertFalse(solution2.isSymmetric(createTree(1, 3, 2)));
    }

    @Test
    public void test6() {
        assertFalse(solution1.isSymmetric(createTree(1, null, 2)));
        assertFalse(solution2.isSymmetric(createTree(1, null, 2)));
    }

    @Test
    public void test7() {
        assertFalse(solution1.isSymmetric(createTree(1, 2, null)));
        assertFalse(solution2.isSymmetric(createTree(1, 2, null)));
    }

    @Test
    public void test8() {
        assertTrue(solution1.isSymmetric(createTree(1, 2, 2, 3, 4, 4, 3)));
        assertTrue(solution2.isSymmetric(createTree(1, 2, 2, 3, 4, 4, 3)));
    }

    @Test
    public void test9() {
        assertFalse(solution1.isSymmetric(createTree(1, 2, 2, null, 3, null, 3)));
        assertFalse(solution2.isSymmetric(createTree(1, 2, 2, null, 3, null, 3)));
    }
}
