package java0605;
/*
【解题思路】：
栈1用来作入队列 ,栈2不为空时，先栈2全部出栈到栈1，再入栈
栈2用来出队列，栈1全部出栈到栈2,栈2再出栈（即出队列）
 */

import java.util.Stack;

public class MyQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        while (!stack2.empty()) {
            Integer top = stack2.pop();
            stack1.push(top);
        }
        stack1.push(node);
    }

    public int pop() {
        while (!stack1.empty()) {
            Integer top = stack1.pop();
            stack2.push(top);
        }
        return stack2.pop();
    }
}
