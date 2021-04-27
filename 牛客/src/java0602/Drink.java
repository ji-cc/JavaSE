package java0602;
/*
有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。
小张手上有十个空汽水瓶，她最多可以换多少瓶汽水喝？”答案是5瓶，
方法如下：先用9个空瓶子换3瓶汽水，喝掉3瓶满的，喝完以后4个空瓶子，
用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。然后你让老板先借给你一瓶汽水，
喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？
 */

import java.util.Scanner;

public class Drink {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n ;
        while (!scanner.hasNext("0")) {
            n = scanner.nextInt();
            System.out.println(drink(n));
        }
    }
    private static int drink(int n) {
        int total = 0;  // 换的饮料总数
        while (n > 2) {
            total = total + n/3;
            n = n/3 + n%3;
        }
        if (n == 2) {
            total += 1;
        }
        if (n == 0) {

        }
        return total;
    }
}
