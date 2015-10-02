package leetcode.problems.problem00173;

import static leetcode.problems.common.TestUtils.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import leetcode.problems.common.TestBase;
import leetcode.problems.common.TreeNode;

public class BSTIteratorTest extends TestBase {

    @Test
    public void test1() {
        BSTIterator iterator = new BSTIterator(null);
        assertFalse(iterator.hasNext());
    }

    @Test
    public void test2() {
        runTest(Arrays.asList(1), createTree(1));
    }

    @Test
    public void test3() {
        runTest(Arrays.asList(1, 2, 3), createTree(2, 1, 3));
    }

    @Test
    public void test4() {
        runTest(Arrays.asList(1, 2, 3, 5, 6, 7), createTree(5, 2, 7, 1, 3, 6, null));
    }

    private void runTest(List<Integer> expected, TreeNode root) {
        BSTIterator iterator = new BSTIterator(root);
        List<Integer> result = new ArrayList<>();
        while (iterator.hasNext()) {
            result.add(iterator.next());
        }
        assertEquals(expected, result);
    }
}
