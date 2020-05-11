package testquestion;

import java.util.Stack;

//用栈实现队列
public class MyQueue {
    //A负责入队列，B负责出队列
    private Stack<Integer> A = new Stack<>();
    private Stack<Integer> B = new Stack<>();

    public MyQueue() {

    }
    //入队
    //要保证所有元素都在A中，然后再把X插入到A中
    public void push(int x) {
        while (!(B.isEmpty())) {
            //把所有元素放在A中
            Integer top = B.pop();
            A.push(top);
        }
        A.push(x);
    }

    //出队
    //先把A中的元素放入B中，再取B的栈顶元素
    public int pop() {
        while (!(A.isEmpty())) {
            int top = A.pop();
            B.push(top);
        }
        return B.pop();
    }

    //返回队列首部元素
    public int peek() {
        if(empty()) {
            return 0;
        }
        while (!(A.isEmpty())) {
            int top = A.pop();
            B.push(top);
        }
        return B.peek();
    }

    //返回队列是否为空
    public boolean empty() {

        return A.isEmpty() && B.isEmpty();
    }
}

