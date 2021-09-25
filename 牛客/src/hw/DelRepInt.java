package hw;
/*
输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
保证输入的整数最后一位不是0。
 */

// 注：先反转，再去重

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class DelRepInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            int n = str.length();
            // boolean add(E e)  // 如果该集合已经包含该元素，返回false 。
            Set<Character> set = new HashSet<>();
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < n; i++) {
                stack.push(str.charAt(i));
            }
            while (!stack.isEmpty()) {
                char c = stack.pop();
                if (set.add(c)) {
                    System.out.print(c);
                }
            }
        }
    }
}

