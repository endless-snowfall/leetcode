package leetcode.problems.problem00090;

import static leetcode.problems.common.TestUtils.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Lists;

import leetcode.problems.common.TestBase;

@SuppressWarnings("unchecked")
public class SolutionTest extends TestBase {

    private Solution solution;
    private List<List<Integer>> answer = new ArrayList<>();

    @Before
    public void before() {
        solution = new Solution();
        answer.add(new ArrayList<>());
    }

    @Test
    public void test1() {
        assertListsEqualUnordered(answer, solution.subsetsWithDup(null));
    }

    @Test
    public void test2() {
        assertListsEqualUnordered(answer, solution.subsetsWithDup(new int[] {}));
    }

    @Test
    public void test3() {
        assertListsEqualUnordered(
            Lists.newArrayList(
                Lists.newArrayList(),
                Lists.newArrayList(1)),
            solution.subsetsWithDup(new int[] { 1 }));
    }

    @Test
    public void test4() {
        assertListsEqualUnordered(
            Lists.newArrayList(
                Lists.newArrayList(),
                Lists.newArrayList(1),
                Lists.newArrayList(2),
                Lists.newArrayList(1, 2)),
            solution.subsetsWithDup(new int[] { 1, 2 }));
    }

    @Test
    public void test5() {
        assertListsEqualUnordered(
            Lists.newArrayList(
                Lists.newArrayList(),
                Lists.newArrayList(1),
                Lists.newArrayList(2),
                Lists.newArrayList(3),
                Lists.newArrayList(1, 2),
                Lists.newArrayList(1, 3),
                Lists.newArrayList(2, 3),
                Lists.newArrayList(1, 2, 3)),
            solution.subsetsWithDup(new int[] { 1, 2, 3 }));
    }

    @Test
    public void test6() {
        assertEquals(
            Lists.newArrayList(
                Lists.newArrayList(),
                Lists.newArrayList(4),
                Lists.newArrayList(1),
                Lists.newArrayList(1, 4),
                Lists.newArrayList(0),
                Lists.newArrayList(0, 4),
                Lists.newArrayList(0, 1),
                Lists.newArrayList(0, 1, 4)),
            solution.subsetsWithDup(new int[] { 4, 1, 0 }));
    }

    @Test
    public void test7() {
        assertEquals(
            Lists.newArrayList(
                Lists.newArrayList(),
                Lists.newArrayList(1),
                Lists.newArrayList(1, 1)),
            solution.subsetsWithDup(new int[] { 1, 1 }));
    }

    @Test
    public void test8() {
        assertListsEqualUnordered(
            Lists.newArrayList(
                Lists.newArrayList(2),
                Lists.newArrayList(1),
                Lists.newArrayList(1, 2, 2),
                Lists.newArrayList(2, 2),
                Lists.newArrayList(1, 2),
                Lists.newArrayList()),
            solution.subsetsWithDup(new int[] { 1, 2, 2 }));
    }

    @Test
    public void test9() {
        assertListsEqualUnordered(
            Lists.newArrayList(
                Lists.newArrayList(),
                Lists.newArrayList(1),
                Lists.newArrayList(1, 1),
                Lists.newArrayList(1, 1, 2),
                Lists.newArrayList(1, 1, 2, 2),
                Lists.newArrayList(1, 2),
                Lists.newArrayList(1, 2, 2),
                Lists.newArrayList(2),
                Lists.newArrayList(2, 2)),
            solution.subsetsWithDup(new int[] { 1, 1, 2, 2 }));
    }

    @Test
    public void test10() {
        assertEquals(
            Lists.newArrayList(
                Lists.newArrayList(),
                Lists.newArrayList(5),
                Lists.newArrayList(5, 5),
                Lists.newArrayList(5, 5, 5),
                Lists.newArrayList(5, 5, 5, 5),
                Lists.newArrayList(5, 5, 5, 5, 5)),
            solution.subsetsWithDup(new int[] { 5, 5, 5, 5, 5 }));
    }
}
