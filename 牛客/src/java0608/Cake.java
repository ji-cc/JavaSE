package java0608;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int count;
        if (w%4== 0 || h%4==0) {
            count = w*h /2;
        } else if (w%2 == 0 && h%2 == 0) {
            count = (w*h/4 + 1) *4;
        } else {
            count = w*h /2 +1;
        }
        System.out.println(count);
    }
}
