package hw;
/*
输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
 */

import java.util.Scanner;

public class Count_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        while (n != 0) {
            n &= (n-1);
            count += 1;
        }
        System.out.println(count);
    }
}
