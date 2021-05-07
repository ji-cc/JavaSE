package java0608;
/*
两个数a,b的最小公倍数是a*b/gcd(a,b)。
由于两个数的乘积等于这两个数的最大公约数与最小公倍数的积，即（a，b）× [a，b] = a × b
所以，求两个数的最小公倍数，就可以先求出它们的最大公约数，然后用上述公式求出它们的最小公倍数。
 求最大公约数：
 辗转相除法：当余数为0时，除数就是最大公约数
 */

import java.util.Scanner;

public class MinCommonMul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int divisor = MaxCommonDiv(a,b);  // 最大公约数
        System.out.println((a * b / divisor));
    }

    private static int MaxCommonDiv(int a, int b) {
        int c = a%b;
        while (c != 0 && b != 0){
            a = b;
            b = c;
            c = a%b;
        }
        return b;
    }
}
