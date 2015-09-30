package leetcode.problems.problem00225;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.TestBase;

public class MyStackTest extends TestBase {

    private MyStack mystack;

    @Before
    public void before() {
        mystack = new MyStack();
    }

    @Test
    public void push_OnEmptyStack() {
        assertTrue(mystack.empty());
        mystack.push(1);
        assertEquals(1, mystack.top());
        assertFalse(mystack.empty());
        mystack.pop();
        assertEquals(-1, mystack.top());
        assertTrue(mystack.empty());
    }

    @Test
    public void push() {
        mystack.push(1);
        mystack.push(2);
        assertEquals(2, mystack.top());
    }

    @Test
    public void pop_OnEmptyStack() {
        mystack.pop();
        assertTrue(mystack.empty());
        assertEquals(-1, mystack.top());
    }

    @Test
    public void pop() {
        mystack.push(1);
        mystack.push(2);
        assertEquals(2, mystack.top());
        mystack.pop();
        assertEquals(1, mystack.top());
    }

    @Test
    public void top_OnEmptyStack() {
        assertEquals(-1, mystack.top());
    }

    @Test
    public void top() {
        mystack.push(100);
        assertEquals(100, mystack.top());
    }

    @Test
    public void empty_OnEmptyStack() {
        assertTrue(mystack.empty());
    }

    @Test
    public void empty() {
        mystack.push(1);
        assertFalse(mystack.empty());
    }
}
