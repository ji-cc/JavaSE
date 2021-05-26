package java0611;

import java.util.Scanner;

public class IsFibStr {
    static int x1 ;
    static int x2 ;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        x1 = 0;
        x2 = 1;
        int step = 0;
        if (n == 0 || n == 1) {
            step = 0;
        }else {
            while (x2 < n) {
                int x3 = x1 + x2;
                x1 = x2;
                x2 = x3;
            }
            step = ((x2 - n) > (n - x1))?(n-x1):(x2-n);
        }
        System.out.println(step);
    }
}
