package leetcode.problems.problem00225;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    private Queue<Integer> queue = new LinkedList<>();
    private int top = -1;

    // Push element x onto stack.
    public void push(int x) {
        top = x;
        queue.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        if (queue.size() == 0) {
            return;
        } else if (queue.size() == 1) {
            top = -1;
            queue.remove();
        } else {
            for (int i = 0; i < queue.size() - 2; i++) {
                queue.add(queue.remove());
            }
            top = queue.remove();
            queue.add(top);
            queue.remove();
        }
    }

    // Get the top element.
    public int top() {
        return top;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return queue.isEmpty();
    }
}
