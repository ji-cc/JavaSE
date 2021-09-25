package meituan;

import java.util.Scanner;
import java.util.Stack;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.length() == 0) {
            System.out.println(0);
        }
        if(isVaild(str)) {
            int res = help(str);
            System.out.println(res%1000000007);
        }else {
            System.out.println(0);
        }

    }

    private static boolean isVaild(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ( c == '(') {
                stack.push(c);
            } else if(c == ')'){
                stack.pop();
            }
        }
        if (stack.empty()) {
            return true;
        }
        return false;
    }

    private static int help(String str) {
        int sum = 1;
        int count = 0;
        boolean flag = false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                stack.push(c);
                count++;
            } else {
                stack.pop();
                if (stack.empty()) {
                    sum *= (1+count);
                    count = 0;
                }
            }
        }
        return sum;
    }


}
