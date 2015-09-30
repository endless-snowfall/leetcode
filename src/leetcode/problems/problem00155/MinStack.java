package leetcode.problems.problem00155;

import java.util.Stack;

class MinStack {

    private Stack<Element> stack = new Stack<>();

    public void push(int x) {
        int newMin = x;
        if (!stack.isEmpty()) {
            int currentMin = stack.peek().min;
            newMin = newMin < currentMin ? newMin : currentMin;
        }
        stack.push(new Element(x, newMin));
    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
        }
    }

    public int top() {
        return stack.isEmpty() ? -1 : stack.peek().value;
    }

    public int getMin() {
        return stack.isEmpty() ? -1 : stack.peek().min;
    }

    private class Element {

        public int value;
        public int min;

        public Element(int value, int min) {
            this.value = value;
            this.min = min;
        }
    }
}
