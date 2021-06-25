//import java.util.Stack;

//push(x) —— 将元素 x 推入栈中。
//pop() —— 删除栈顶的元素。
//top() —— 获取栈顶元素。
//getMin() —— 检索栈中的最小元素。

//
//class MinStack {
//    /** initialize your data structure here. */
//    Stack<Integer> stackDate = new Stack<>();
//    Stack<Integer> minStack = new Stack<>();
//    public MinStack() {
//    }
//    public void push(int val) {   // 入栈
//        stackDate.push(val);
//        if (minStack.isEmpty()) {
//            minStack.push(val);
//        }else if (val <= minStack.peek()) {
//            minStack.push(val);
//        }
//    }
//
//    public void pop() {  //删除栈顶元素
//        if (stackDate.isEmpty()) {
//            return;
//        }
//        int val = stackDate.pop();
//        if (!minStack.isEmpty()) {
//            if (val == minStack.peek()) {
//                minStack.pop();
//            }
//        }
//    }
//    public int top() {
//        if (!stackDate.isEmpty()) {
//            return stackDate.peek();
//        }
//        return 0;
//    }
//
//    public int getMin() {
//        if (!minStack.isEmpty()) {
//            return minStack.peek();
//        }
//        return 0;
//    }
//
//    public static void main(String[] args) {
//        MinStack stack = new MinStack();
//        stack.push(2);
//        stack.push(0);
//        stack.push(3);
//        stack.push(0);
//        System.out.println(stack.getMin());
//        stack.pop();
//        System.out.println(stack.getMin());
//        stack.pop();
//        System.out.println(stack.getMin());
//        stack.pop();
//        System.out.println(stack.getMin());
//    }
//}
//
///**
// * Your MinStack object will be instantiated and called as such:
// * MinStack obj = new MinStack();
// * obj.push(val);
// * obj.pop();
// * int param_3 = obj.top();
// * int param_4 = obj.getMin();
// */


import java.util.Stack;

class MinStack {

    /** initialize your data structure here. */
    Stack<Integer> stackDate = new Stack<>();
    Stack<Integer> stackMin = new Stack<>();
    public MinStack() {
    }

    public void push(int val) {
        stackDate.push(val);
        if (stackMin.isEmpty()) {
            stackMin.push(val);
        }else if (val < stackMin.peek()) {
            stackMin.push(val);
        } else {
            stackMin.push(stackMin.peek());
        }
    }
    public void pop() {
        if (stackDate.isEmpty()) {
            return;
        }
        stackDate.pop();
        stackMin.pop();
    }
    public int top() {
        if (stackDate.isEmpty()) {
            return 0;
        }
        return stackDate.peek();
    }

    public int getMin() {
        if (stackMin.isEmpty()) {
            return 0;
        }
        return stackMin.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */