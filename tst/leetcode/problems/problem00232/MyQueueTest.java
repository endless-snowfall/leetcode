package leetcode.problems.problem00232;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import leetcode.problems.common.TestBase;

public class MyQueueTest extends TestBase {

    private MyQueue queue;

    @Before
    public void before() {
        queue = new MyQueue();
    }

    @Test
    public void push_OnEmptyQueue() {
        assertTrue(queue.empty());
        assertEquals(-1, queue.peek());
        queue.push(1);
        assertFalse(queue.empty());
        assertEquals(1, queue.peek());
        queue.pop();
        assertTrue(queue.empty());
        assertEquals(-1, queue.peek());
    }

    @Test
    public void push() {
        queue.push(1);
        queue.push(2);
        assertEquals(1, queue.peek());
    }

    @Test
    public void pop_OnEmptyQueue() {
        assertTrue(queue.empty());
        queue.pop();
        assertTrue(queue.empty());
    }

    @Test
    public void pop() {
        queue.push(1);
        assertEquals(1, queue.peek());
        queue.push(2);
        assertEquals(1, queue.peek());
        queue.pop();
        assertEquals(2, queue.peek());
    }

    @Test
    public void peek_OnEmptyQueue() {
        assertEquals(-1, queue.peek());
    }

    @Test
    public void peek() {
        queue.push(2);
        assertEquals(2, queue.peek());
    }

    @Test
    public void empty_OnEmptyQueue() {
        assertTrue(queue.empty());
    }

    @Test
    public void empty() {
        queue.push(2);
        assertFalse(queue.empty());
    }
}
