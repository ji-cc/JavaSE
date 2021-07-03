package hw;
/*
写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。
如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 */

import java.util.Scanner;

public class Arrangement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        int num = (int)(a * 10);
        if ((num % 10) >= 5) {
            System.out.println(num/10+1);
        }else {
            System.out.println(num/10);
        }
    }
}
