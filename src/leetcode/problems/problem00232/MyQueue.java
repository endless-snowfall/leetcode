package leetcode.problems.problem00232;

import java.util.Stack;

class MyQueue {

    private Stack<Integer> enqueue = new Stack<>();
    private Stack<Integer> dequeue = new Stack<>();

    // Push element x to the back of queue.
    public void push(int x) {
        enqueue.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if (!dequeue.isEmpty()) {
            dequeue.pop();
        } else if (!enqueue.isEmpty()) {
            migrateEnqueueToDequeue();
            dequeue.pop();
        }
    }

    // Get the front element.
    public int peek() {
        if (!dequeue.isEmpty()) {
            return dequeue.peek();
        } else if (!enqueue.isEmpty()) {
            migrateEnqueueToDequeue();
            return dequeue.peek();
        } else {
            return -1;
        }
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return enqueue.isEmpty() && dequeue.isEmpty();
    }

    private void migrateEnqueueToDequeue() {
        while (!enqueue.isEmpty()) {
            dequeue.push(enqueue.pop());
        }
    }
}
