package testquestion;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.Queue;

//用队列实现栈
public class MyStack {
    //借助两个队列实现一个栈
    Queue<Integer> A = new LinkedList<>();
    Queue<Integer> B = new LinkedList<>();

    public MyStack() {

    }

    //入栈
    //直接把元素往A中入队
    public void push(int x) {
        A.offer(x);
    }

    //出栈
    //队列是先进先出，栈是先进后出
    //原队列A中的元素出队，入到B中，直到A中只剩下最后一个元素，这个元素就是要出栈的元素
    public int pop() {
        //栈为空
        if(empty()) {
            return 0;
        }
        while(A.size()>1) {
            Integer cur = A.poll();
            B.offer(cur);
        }
        //循环结束时，A中只有一个元素，这个元素就是要出栈的栈顶元素
        int top = A.poll();
        //完成操作之后，要记得交换A和B，保证下次入栈都是往A中入元素
        swapAB();
        return top;
    }

    private void swapAB() {
        Queue<Integer> tmp = A;
        A = B;
        B = tmp;
    }

    //取栈顶元素
    public int top() {
        if(empty()) {
            return 0;
        }
        while(A.size()>1) {
            Integer cur = A.poll();
            B.offer(cur);
        }
        //循环结束时，A中只有一个元素，这个元素就是要出栈的栈顶元素
        int top = A.poll();
        //取栈顶元素  并不是删除，取完之后还要重新入到队列中
        B.offer(top);
        //完成操作之后，要记得交换A和B，保证下次入栈都是往A中入元素
        swapAB();
        return top;

    }


    public boolean empty() {
        return A.isEmpty() && B.isEmpty();
    }

}
