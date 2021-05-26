package java0603;

import java.util.Stack;

public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        Stack<Character> stack = new Stack<>();
        if (A.length() != n) {
            return false;
        }
        if (A != null) {
            for (int i = 0; i < n; i++) {
                if ('(' == A.charAt(i)) {
                    stack.push(A.charAt(i));
                    continue;
                }
                if (')' == A.charAt(i) && !stack.isEmpty()) {
                    stack.pop();
                    continue;
                }
                if ((')' != A.charAt(i)) || '(' != A.charAt(i)) {
                    return false;
                }
            }
            if (!stack.isEmpty()) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

}
