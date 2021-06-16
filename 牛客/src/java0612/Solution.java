package java0612;


import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scannerc = new Scanner(System.in);
        int n = scannerc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scannerc.nextInt();
        }
        int b[] = multiply(arr);
        System.out.println(Arrays.toString(b));
    }
    public static int[] multiply(int[] A) {
        int n = A.length;
        int[] b = new int[n];
        b[0] = 1;
        for (int i = 1; i < n; i++) {
            b[i] = b[i-1] * A[i-1];
        }
        int tmp = 1;
        for (int i = n-2; i >= 0 ; i--) {
            tmp *= A[i+1];
            b[i] *= tmp;
        }
        return b;
    }
}
