package leetcode.problems.problem00155;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.TestBase;

public class SolutionTest extends TestBase {

    private MinStack stack;

    @Before
    public void before() {
        stack = new MinStack();
    }

    @Test
    public void push_OnEmptyStack() {
        stack.push(1);
        assertEquals(1, stack.top());
        assertEquals(1, stack.getMin());
    }

    @Test
    public void push() {
        stack.push(2);
        stack.push(9);
        assertEquals(9, stack.top());
        assertEquals(2, stack.getMin());
    }

    @Test
    public void pop_OnEmptyStack() {
        assertEquals(-1, stack.top());
        stack.pop();
        assertEquals(-1, stack.top());
    }

    @Test
    public void pop() {
        stack.push(1);
        assertEquals(1, stack.top());
        stack.pop();
        assertEquals(-1, stack.top());
    }

    @Test
    public void top_OnEmptyStack() {
        stack.push(1);
        assertEquals(1, stack.top());
    }

    @Test
    public void top() {
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.top());
    }

    @Test
    public void getMin_OnEmptyStack() {
        assertEquals(-1, stack.getMin());
    }

    @Test
    public void getMin() {
        stack.push(10);
        assertEquals(10, stack.getMin());
        stack.push(1);
        assertEquals(1, stack.getMin());
        stack.push(5);
        assertEquals(1, stack.getMin());
    }
}
