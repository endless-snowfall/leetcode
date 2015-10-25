package leetcode.problems.common;

import static org.junit.Assert.*;

import java.util.List;

import leetcode.problems.problem00100.Solution;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TestUtils {

    public static ListNode createList(int... values) {
        ListNode result = null;
        ListNode tail = null;

        for (int value : values) {
            ListNode node = new ListNode(value);
            if (result == null) {
                result = node;
            } else {
                tail.next = node;
            }
            tail = node;
        }

        return result;
    }

    public static void assertListNodesEqual(ListNode expectd, ListNode actual) {
        if (expectd == null && actual == null) {
            return;
        } else if (expectd != null && actual != null) {
            if (expectd.val != actual.val) {
                fail("Lists not equal!");
            } else {
                assertListNodesEqual(expectd.next, actual.next);
            }
        } else {
            fail("Lists not equal!");
        }
    }

    public static TreeNode createTree(Integer... values) {
        return buildSubTree(0, values);
    }

    private static TreeNode buildSubTree(int indexOfRoot, Integer[] values) {
        if (indexOfRoot < 0 || values == null || values.length == 0 || indexOfRoot >= values.length || values[indexOfRoot] == null) {
            return null;
        }
        TreeNode root = new TreeNode(values[indexOfRoot]);
        root.left = buildSubTree(indexOfRoot * 2 + 1, values);
        root.right = buildSubTree(indexOfRoot * 2 + 2, values);
        return root;
    }

    public static boolean areTreesEquals(TreeNode expected, TreeNode actual) {
        return new Solution().isSameTree(expected, actual);
    }

    public static void assertTreesEquals(TreeNode expected, TreeNode actual) {
        if (!areTreesEquals(expected, actual)) {
            fail("Trees not equal!");
        }
    }

    public static <T> void assertListsEqualUnordered(List<T> expected, List<T> actual) {
        assertTrue(String.format("Lists expected=[%s] and actual=[%s] are not the same size!", expected, actual),
            expected.size() == actual.size());
        assertFalse(String.format("Lists are not equal (unordered)! List1=[%s], List2=[%s]", expected, actual),
            expected.stream()
                .filter(i -> !actual.contains(i))
                .findAny()
                .isPresent());
    }
}
