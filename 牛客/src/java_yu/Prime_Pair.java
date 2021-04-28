package java_yu;

import java.util.Scanner;

/*
查找组成一个偶数最接近的两个素数
任意一个偶数（大于2）都可以由2个素数组成，组成偶数的2个素数有很多种情况，
本题目要求输出组成指定偶数的两个素数差值最小的素数对。
本题含有多组样例输入。
输入
20
输出
7
13
 */
public class Prime_Pair {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            int prime = solution(num);
            System.out.println(prime);
            System.out.println(num - prime);
        }
    }
    // 从一半开始找最大的素数，另一个不一定是素数，所以从两边开始一起寻找
    private static int solution(int num) {
        if (num > 2) {
            int n = num/2;
            for (int i = n; i >0 ; i--) {
                if(isPrime(i)) {
                    if(isPrime(num - i)) {
                        return i;
                    }
                }
            }
        } 
        return 0;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= n/2; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
