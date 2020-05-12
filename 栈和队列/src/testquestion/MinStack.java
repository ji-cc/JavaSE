package testquestion;

import java.util.Stack;

//设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
public class MinStack {
    Stack<Integer> A = new Stack<>(); //A中按照正常的栈来存储元素
    Stack<Integer> B = new Stack<>();  //B中的每个元素都是A中对应元素个数情况下的最小值
    //A与B中的元素要同步存在

    public MinStack() {

    }

    //入栈
    public void push(int x) {
        A.push(x); //x在A中入栈
        //同时A中的最小值如B栈
        if (B.empty()) {
            //B为空栈，则此时x为最小值
            B.push(x);
            return;
        }
        //B不为空，取出B的栈顶元素，此时的栈顶元素一定为x入A栈之前所有元素的最小值
        //取出上一轮的最小值
        int min = B.peek();
        if (x<min) {
            //新插入元素比原来的最小值还小，所有min值更新为x
            min = x;
        }
        //min值就是最小值，min入B栈
        B.push(min);
    }

    // 删除栈顶的元素
    public void pop() {
        if(A.empty()) {
            return;
        }
        A.pop();
        B.pop();
    }

    //获取栈顶元素
    public int top() {
        if (A.empty()) {
            return 0;
        }
        return A.peek();
    }

    //检索栈中的最小元素
    public int getMin() {
        if (B.empty()) {
            return 0;
        }
        return B.peek();
    }
}
