package java0609;

import java.util.Arrays;
import java.util.Scanner;

public class Min_n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();    // 输入：str = "3 9 6 8 -10 7 -11 19 30 12 23 5"
            String[] result = str.split(" ");  // 以空格分隔 result = [3 9 6 8 -10 7 -11 19 30 12 23 5]  类型是string
            int length = result.length;
            int n = length -1;   // n个整数
            int k = Integer.valueOf(result[length-1]);   // k为result中的最后一个字符，将字符转换为整型
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.valueOf(result[i]);   // 变成整型数组
            }
            Arrays.sort(arr);  // 对数组进行排序
            // 输出前k个元素
            for (int i = 0; i < k-1; i++) {
                System.out.print(arr[i]);
                System.out.print(" ");
            }
            System.out.print(arr[k-1]);
        }
    }
}
