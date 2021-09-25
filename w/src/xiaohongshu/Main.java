package xiaohongshu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split(" ");
        int[] arr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        int n = arr.length;
        int count;
        int paper = 1;
        if (arr.length == 0 ) {
            count = 0;
        } if (n == 2) {
            if (arr[1] > arr[0]) {
                count = 3;
            }else {
                count = 2;
            }
        }
        else {
            count = 1;
            for (int i = 1; i < arr.length; i++) {
                int tmp = arr[i-1];
                if (arr[i] > tmp || arr[i]> arr[i+1]) {
                    paper += 1;
                }
                count += paper;

            }
        }
        System.out.println(count);
    }
}
