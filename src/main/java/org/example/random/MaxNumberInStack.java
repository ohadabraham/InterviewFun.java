package org.example.random;

import java.util.Stack;

public class MaxNumberInStack {

        private Stack<Integer> stack;
        private Stack<Integer> maxStack;

        public MaxNumberInStack() {
            stack = new Stack<Integer>();
            maxStack = new Stack<Integer>();
        }
        public void push(int num) {
            stack.push(num);
            if (maxStack.isEmpty() || num >= maxStack.peek()) {
                maxStack.push(num);
            }
        }
        public int pop() {
            if (stack.isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            int num = stack.pop();
            if (num == maxStack.peek()) {
                maxStack.pop();
            }
            return num;
        }
        public int getMax() {
            if (maxStack.isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return maxStack.peek();
        }

}
