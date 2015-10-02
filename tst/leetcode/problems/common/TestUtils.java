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

    public static void assertListNodesEqual(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return;
        } else if (list1 != null && list2 != null) {
            if (list1.val != list2.val) {
                fail("Lists not equal!");
            } else {
                assertListNodesEqual(list1.next, list2.next);
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

    public static boolean areTreesEquals(TreeNode tree1, TreeNode tree2) {
        return new Solution().isSameTree(tree1, tree2);
    }

    public static void assertTreesEquals(TreeNode tree1, TreeNode tree2) {
        if (!areTreesEquals(tree1, tree2)) {
            fail("Trees not equal!");
        }
    }

    public static <T> void assertListsEqualUnordered(List<T> list1, List<T> list2) {
        assertTrue(list1.size() == list2.size());
        assertFalse("Lists are not equal (unordered)!",
            list1.stream()
                .filter(i -> !list2.contains(i))
                .findAny()
                .isPresent());
    }
}
