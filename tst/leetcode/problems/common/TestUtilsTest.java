package leetcode.problems.common;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUtilsTest {

    @Test
    public void createTree_Null() {
        assertNull(TestUtils.createTree((Integer[]) null));
    }

    @Test
    public void createTree_Empty() {
        assertNull(TestUtils.createTree(new Integer[0]));
    }

    @Test
    public void createTree_SingleNode() {
        TreeNode result = TestUtils.createTree(0);
        assertEquals(0, result.val.intValue());
        assertNull(result.left);
        assertNull(result.right);
    }

    @Test
    public void createTree_SingleNode_Variant() {
        TreeNode result = TestUtils.createTree(0, null, null);
        assertEquals(0, result.val.intValue());
        assertNull(result.left);
        assertNull(result.right);
    }

    @Test
    public void createTree_Full_TwoLevel() {
        TreeNode result = TestUtils.createTree(0, 1, 2);
        assertEquals(0, result.val.intValue());
        assertEquals(1, result.left.val.intValue());
        assertNull(result.left.left);
        assertNull(result.left.right);
        assertEquals(2, result.right.val.intValue());
        assertNull(result.right.left);
        assertNull(result.right.right);
    }
}
