package java0606;
/*
input[] = {A - B，B - C，A + B，B + C}
candy[] = {A,B,C}
A= input[0] + B
B=(input[1] + input[3])/2
C=B - input[1]
A + B == input[2]
 */

import java.util.Scanner;

public class CountCandy {
    public static void main(String[] args) {
        int[] input = new int[4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            input[i] = scanner.nextInt();
        }
        int B = (input[1] + input[3])/2;
        int A= input[0] + B;
        int C = B - input[1];
        if (A>=0 && B>=0 && C>=0 && A + B == input[2]) { // 需要用到所有条件
            System.out.print(A);
            System.out.print(" ");
            System.out.print(B);
            System.out.print(" ");
            System.out.print(C);
        }else {
            System.out.println("No");
        }

    }
}
