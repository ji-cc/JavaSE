package hw;
/*
功能:输入一个正整数，按照从小到大的顺序输出它的所有质因子（重复的也要列举）
（如180的质因子为2 2 3 3 5 ）
最后一个数后面也要有空格
 */

import java.util.Scanner;

public class IsPrimerFactors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextInt();
        for (int j = 2; j <= Math.sqrt(num); j++) {
            while (num % j == 0) {
                System.out.print(j + " ");
                num = num / j;
            }
            if (num == 1) {
                break;
            }
        }
        if (num > 1) {
            System.out.print(num + " ");
        }
    }
}
