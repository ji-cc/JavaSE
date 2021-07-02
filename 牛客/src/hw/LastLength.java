package hw;
// 计算字符串最后一个单词的长度，单词以空格隔开，字符串长度小于5000。

import java.util.Scanner;

public class LastLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] len = str.split(" ");
        int n = len.length;
        int count = len[n-1].length();
        System.out.println(count);
    }
}
