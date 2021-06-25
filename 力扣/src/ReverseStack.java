import java.util.*;

public class ReverseStack {
    public static int[] reverseStackRecursively(int[] stack, int top) {
        // write code here
        Stack<Integer> stack1 = new Stack<>();
        for (int i = 0; i < top; i++) {
            stack1.push(stack[i]);
        }
        int[] arr = new int[top];
        reserve(stack1);
        for (int i = top-1; i >= 0; i--) {
            arr[i] = stack1.pop();
        }
        return arr;
    }

    private static void reserve(Stack<Integer> stack1) {
        if (stack1.isEmpty()) {
            return;
        }
        int i = gets(stack1);
        reserve(stack1);
        stack1.push(i);

    }
    // 移除并返回当前的栈底元素
    private static int gets(Stack<Integer> stack1) {
        int result = stack1.pop();
        if (stack1.isEmpty()) {
            return result;
        }
        int i = gets(stack1);
        stack1.push(result);
        return i;
    }

//    public static void main(String[] args) {
//        int [] arr = new int[]{1,2,3};
//        System.out.println(Arrays.toString(reverseStackRecursively(arr,3)));
//    }

}