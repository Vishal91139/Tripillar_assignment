// LeetCode 232 – Implement Queue using Stacks (Easy)

package MODULE_11;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> inStack;
    Stack<Integer> outStack;

    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        if(outStack.isEmpty()) {
            while(!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
    }

    public int peek() {
        if(outStack.isEmpty()) {
            while(!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.peek();
    }

    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();

        q.push(1);
        q.push(2);

        System.out.println("Peek: " + q.peek());
        System.out.println("Pop: " + q.pop());
        System.out.println("Empty: " + q.empty());
    }
}