package hw;
/*
给定n个字符串，请对n个字符串按照字典序排列。
 */

import java.util.Arrays;
import java.util.Scanner;

public class SortStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = scanner.next();
        }
        Arrays.sort(str);
        for (String s:str
             ) {
            System.out.println(s);
        }

    }
}
