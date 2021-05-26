package java0610;

import java.util.Scanner;

public class ZerosNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = 0;
        for(int i = n; i >= 5; i--) {
            int tmp = i;
            while(tmp % 5 == 0) {
                res++;
                tmp /= 5;
            }
        }
        System.out.println(res);
//        long  mul = 1;  // int类型不能接受很大的阶乘
//        while (n>1) {
//            mul *= n;
//            n--;
//        }
//        String str = String.valueOf(mul);
        // 出现0 的位置不一定是末尾连续的
//        int index = str.indexOf("0");  // 返回第一个0出现位置的下标,没有0 就返回-1
//        if (index == -1) {
//            System.out.println(0);
//        }else {
//            System.out.println(str.length()-index);
//        }
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == '0') {
//                count++;
//            }else {
//                count=0;
//            }
//        }
//        System.out.println(count);
    }
}
