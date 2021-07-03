package hw;
/*
输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
保证输入的整数最后一位不是0。
 */


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class DelRepInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = str.length();

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(str.charAt(i));
        }
        Stack<Character> stack = new Stack<>();
        for (Character c: set
             ) {
            stack.push(c);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}

