package java0606;
/*
str.split(" "):按照空格切分字符串
Integer.valueOf(str):将数字字符串转为int
 */

import java.util.Scanner;
public class Count2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String [] str1 = str.split(" ");
        int[] arr = new int[str1.length];
        for (int i = 0; i < str1.length; i++) {
            arr[i] = Integer.valueOf(str1[i]);
        }
        countMaxLength(arr);
    }

    private static void countMaxLength(int[] arr) {
        int length = arr.length;
        int count;
        for (int i = 0; i <= length/2; i++) {
            count = 1;
            for (int j = i+1; j < length; j++) {
                if (arr[i] == arr[j]) {
                    ++count;
                }
            }
            if (count >= length/2) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
