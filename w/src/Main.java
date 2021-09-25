//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//import java.util.Stack;
//
//public class Main {
//    public static void main(String[] args) {
//        int[][] op = new int[][]{
//                {1,1},
//                {1,2},
//                {1,3},
//                {3},{2},{3}
//        };
//        int[] res = queueFromTwoStack(op);
//        System.out.println(Arrays.toString(res));
//    }
//
//    static Stack<Integer> A = new Stack<>();  // 入栈
//    static Stack<Integer> B = new Stack<>();   // 最小入栈
//    static Stack<Integer> C = new Stack<>(); // 出栈
//    static Stack<Integer> D = new Stack<>();  //  最小值出栈
//
//    public static int[] queueFromTwoStack (int[][] op) {
//        ArrayList<Integer> res = new ArrayList<>();
//        for (int i = 0; i < op.length;i++) {
//            if (op[i][0] == 1) {
//                push(op[i][1]);
//            }
//            if (op[i][0] == 2) {
//                pop();
//            }
//            if(op[i][0] == 3) {
//                res.add(getMin());
//            }
//        }
//        int num = res.size();
//        int[] ans = new int[num];
//        for (int i = 0; i < num; i++) {
//            ans[i] = res.get(i);
//        }
//        return ans;
//    }
//    public static void push (int x) {
//        while (!C.empty()) {
//            Integer top = C.pop();
//            A.push(top);
//        }
//        A.push(x);
//        if (B.empty()) {
//            B.push(x);
//            return;
//        }
//        while (!D.empty()) {
//            Integer topMin = D.pop();
//            B.push(topMin);
//        }
//        int min = B.peek();
//        if (x < min) {
//            min = x;
//        }
//
//        B.push(min);
//    }
//    public static void pop() {
//        if (A.empty()) {
//            return;
//        }
//        while (!A.empty()) {
//            Integer top = A.pop();
//            C.push(top);
//        }
//        C.pop();
//        while (!B.empty()) {
//            Integer topMin = B.pop();
//            D.push(topMin);
//        }
//        D.pop();
//    }
//    public static int getMin() {
//
//        while (!B.empty()) {
//            Integer topMin = B.pop();
//            D.push(topMin);
//        }
//        return D.peek();
//    }
//
//}


public class Main {
    static int[] a;
    static {a[0]=2;}
    public static void main(String[] args) {

    }
}
