package hw;
/*
编写一个函数，计算字符串中含有的不同字符的个数。字符在ASCII码范围内(0~127，包括0和127)，换行表示结束符，不算在字符里。不在范围内的不作统计。多个相同的字符只计算一次
例如，对于字符串abaca而言，有a、b、c三种不同的字符，因此输出3。
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountDifStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Set<Character> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (set.add(str.charAt(i))) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
