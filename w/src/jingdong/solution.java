package jingdong;

import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }
        int s = arr[0][0];
        int e = arr[n-1][0];
        for (int i = 0; i < n; i++) {
            if(arr[i][1] == 1) {
                s = Math.min(arr[i][0],s);
                e = Math.max(arr[i][0],e);
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i][0] >= s && arr[i][0]<= e) {
                sum += 1;
            }
        }
        System.out.println(sum);

    }
}
