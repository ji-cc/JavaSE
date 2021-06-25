import java.util.Stack;

class MyQueue {

    /** Initialize your data structure here. */
    Stack<Integer> stackPush = new Stack<>();  // 负责入栈
    Stack<Integer> stackPop = new Stack<>();   // 负责出栈
    public MyQueue() {
    }
    /** Push element x to the back of queue. */
    // 要保证所有元素都在stackPush中
    public void push(int x) {
        while (!stackPop.isEmpty()) {
            stackPush.push(stackPop.pop());
        }
        stackPush.push(x);
    }
    /** Removes the element from in front of queue and returns that element. */
    // 把stackPush中的元素全部放入stackPop中，再取stackPop的栈顶元素
    public int pop() {
        while (!stackPush.isEmpty()) {
            stackPop.push(stackPush.pop());
        }
        if (stackPop.isEmpty()) {
            return 0;
        }
        return stackPop.pop();
    }
    /** Get the front element. */
    public int peek() {
        while (!stackPush.isEmpty()) {
            stackPop.push(stackPush.pop());
        }
        if (stackPop.isEmpty()) {
            return 0;
        }
        return stackPop.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stackPop.isEmpty() && stackPush.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
